package com.example.fitnesstrener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.fitnesstrener.calendar.Calendar;
import com.example.fitnesstrener.training_and_food.Training;


public class MainActivity extends AppCompatActivity {

    private ImageButton Imgjour,Exercise,Profile, Train;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Profile = findViewById(R.id.profile);
        Exercise = findViewById(R.id.exercise);
        Imgjour = findViewById(R.id.imgjour);
        Train = findViewById(R.id.train);

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

}
}