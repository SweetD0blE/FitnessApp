package com.example.fitnesstrener;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.exercise.Arms;
import com.example.fitnesstrener.exercise.Back;
import com.example.fitnesstrener.exercise.Press;

public class Exercise extends AppCompatActivity {

    private ImageButton imageButtonReturn1;
    ImageButton imageButtonABS, imageButtonArms, imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);




        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, MainActivity.class);
                startActivity(intent);
            }
        });


        imageButtonABS = findViewById(R.id.imageButtonABS);

        imageButtonABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise.this, Press.class);
                startActivity(intent);
            }
        });

        imageButtonArms = findViewById(R.id.imageButtonArms);

        imageButtonArms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise.this, Arms.class);
                startActivity(intent);
            }
        });

        imageButtonBack = findViewById(R.id.imageButtonBack);

        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise.this, Back.class);
                startActivity(intent);
            }
        });

    }
}

