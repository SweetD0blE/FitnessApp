package com.example.fitnesstrener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesstrener.calendar.Calendar;
import com.example.fitnesstrener.training_and_food.Training;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";
    private ImageButton Imgjour,Exercise,Profile, Train;
    TextView TextViewExercise, TextViewTrain, TextViewJournal, TextViewProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Profile = findViewById(R.id.profile);
        Exercise = findViewById(R.id.exercise);
        Imgjour = findViewById(R.id.imgjour);
        Train = findViewById(R.id.train);
        TextViewExercise = findViewById(R.id.TextViewExercise);
        TextViewTrain = findViewById(R.id.TextViewTrain);
        TextViewJournal = findViewById(R.id.TextViewJournal);
        TextViewProfile = findViewById(R.id.TextViewProfile);


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

        Train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Training.class);
                startActivity(intent);
            }
        });

        TextViewExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Exercise.class);
                startActivity(intent);
            }
        });

        TextViewTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Training.class);
                startActivity(intent);
            }
        });

        TextViewJournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calendar.class);
                startActivity(intent);
            }
        });

        TextViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.fitnesstrener.profile.Profile.class);
                startActivity(intent);
            }
        });
}
}