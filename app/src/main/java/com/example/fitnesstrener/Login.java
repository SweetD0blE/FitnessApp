package com.example.fitnesstrener;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText email_login,password_login;
    Button login;
    TextView registration;

    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.login);

        email_login = findViewById(R.id.email_login);
        password_login = findViewById(R.id.password_login);
        login = findViewById(R.id.login);
        registration = findViewById(R.id.registration);

        mAuth = FirebaseAuth.getInstance();


                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String email = email_login.getText().toString().trim();
                        String password = password_login.getText().toString().trim();

                        if (email.isEmpty() || password.isEmpty()){
                            Toast.makeText(Login.this,"Заполните все данные", Toast.LENGTH_SHORT).show();
                        }else{
                            mAuth.signInWithEmailAndPassword(email,password)
                                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if(task.isSuccessful()){
                                                Intent intent = new Intent(Login.this, MainActivity.class);
                                                startActivity(intent);
                                            }else{
                                                Toast.makeText(Login.this, "Проверьте правильность ввода", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });
                        }
                    }
                });

                registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });

    }

}
