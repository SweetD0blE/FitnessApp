package com.example.fitnesstrener.authentification;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.RegexValidator;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.authorization.Login;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

     EditText mEmail_register,mWeight,mPassword_register,mFullName, mNumber, mDate;
     Button mRegister;
     FirebaseAuth mAuth;
     FirebaseFirestore fStore;
     String userID;
     AwesomeValidation awesomeValidation;
     RadioButton mMale,mFemale,radioButton;
     RadioGroup radioGroup;
     int year,month,day;
     DatePickerDialog.OnDateSetListener onDateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        mFullName = findViewById(R.id.fullName);
        mWeight = findViewById(R.id.weight);
        mEmail_register = findViewById(R.id.email_register);
        mPassword_register = findViewById(R.id.password_register);
        mRegister = findViewById(R.id.register);

        radioGroup = findViewById(R.id.ragioGender);
        mNumber = findViewById(R.id.phone_register);
        mDate = findViewById(R.id.date_register);

        final Calendar calendar = Calendar.getInstance();


        //?????????????????? ?????? ???????????? ???????? ????????????????

        mDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                day = calendar.get(Calendar.DAY_OF_MONTH);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Register.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = dayOfMonth + "." + month + "." + year;
                        mDate.setText(date);
                    }
                }, day, month, year);
                datePickerDialog.show();
            }
        });


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEmail_register.getText().toString().trim();
                String password = mPassword_register.getText().toString().trim();
                String fullName = mFullName.getText().toString();
                String weight = mWeight.getText().toString();
                String number = mNumber.getText().toString();
                String date = mDate.getText().toString();


                if(fullName.isEmpty()){
                    mFullName.setError("?????????????? ???????????? ??????");
                    return;
                }
                if(weight.isEmpty()){
                    mWeight.setError("?????????????? ?????? ??????");
                    return;
                }
                if(email.isEmpty()){
                    mEmail_register.setError("?????????????? ??????????");
                    return;
                }
                if(password.isEmpty()){
                    mPassword_register.setError("?????????????? ????????????");
                    return;
                }else if(password.length() < 6){
                    mPassword_register.setError("???????????? ???????????? ?????????????????? ???????????? 6 ????????????????");
                    return;
                }

                if(number.isEmpty()){
                    mNumber.setError("?????????????? ???????? ?????????? ????????????????");
                    return;
                }else if(number.length() < 11){
                    mNumber.setError("?????????????????????? ???????????? ??????????(11 ????????)");
                    return;
                }
                if(date.isEmpty()){
                    mDate.setError("???????????????? ???????? ???????? ????????????????");
                    return;
                }


                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String gender = radioButton.getText().toString();


                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Register.this, "?????????????????? ?????? ????????????", Toast.LENGTH_SHORT).show();

                } else {
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        userID = mAuth.getCurrentUser().getUid();
                                        DocumentReference documentReference = fStore.collection("Users").document(userID);
                                        Map<String,Object> user = new HashMap<>();
                                        user.put("??????",fullName);
                                        user.put("??????????",email);
                                        user.put("??????",weight);
                                        user.put("??????",gender);
                                        //user.put("??????",female);
                                        //user.put("?????? ??????",male);
                                        user.put("??????????????",number);
                                        user.put("???????? ????????????????",date);

                                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void aVoid) {
                                               Toast.makeText(Register.this,"???? ?????????????? ????????????????????????????????????",Toast.LENGTH_SHORT).show();
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.d("?????????????????? ???? ????????????", "???????????????????????? ???? ?????? ????????????");
                                            }
                                        });
                                        Intent intent = new Intent(Register.this, Login.class);
                                        startActivity(intent);

                                    } else {
                                        Toast.makeText(Register.this, "?????????????????? ???????????????????????? ??????????", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });




    }

}
