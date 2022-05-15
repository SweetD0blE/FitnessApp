package com.example.fitnesstrener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.fitnesstrener.calendar.Calendar;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private ImageButton Imgjour;
    private FirebaseAuth mAuth;
    private ImageButton Exercise;
    private ImageButton Profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Profile = findViewById(R.id.profile);
        Exercise = findViewById(R.id.exercise);
        Imgjour = findViewById(R.id.imgjour);
        mAuth = FirebaseAuth.getInstance();

        Imgjour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calendar.class);
                startActivity(intent);
            }
        });
        Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise.class);
                startActivity(intent);
            }
    });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.fitnesstrener.profile.Profile.class);
                startActivity(intent);
            }
        });
}
}