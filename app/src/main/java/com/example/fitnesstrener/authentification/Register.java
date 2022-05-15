package com.example.fitnesstrener.authentification;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

     EditText mEmail_register,mWeight,mPassword_register,mFullName;
     Button mRegister;
     FirebaseAuth mAuth;
     FirebaseFirestore fStore;
     String userID;



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


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEmail_register.getText().toString().trim();
                String password = mPassword_register.getText().toString().trim();
                String fullName = mFullName.getText().toString();
                String weight = mWeight.getText().toString();


                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Register.this, "Заполните все данные", Toast.LENGTH_SHORT).show();

                } else {
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        userID = mAuth.getCurrentUser().getUid();
                                        DocumentReference documentReference = fStore.collection("Users").document(userID);
                                        Map<String,Object> user = new HashMap<>();
                                        user.put("Имя",fullName);
                                        user.put("Логин",email);
                                        user.put("Вес",weight);
                                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void aVoid) {
                                                Log.d("Сообщение", "Пользователь создан c уникальным кодом:" + userID);
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.d("Сообщение об ошибке", "Пользователь не был создан");
                                            }
                                        });
                                        Intent intent = new Intent(Register.this, Login.class);
                                        startActivity(intent);

                                    } else {
                                        Toast.makeText(Register.this, "Проверьте правильность ввода", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });

    }

}
