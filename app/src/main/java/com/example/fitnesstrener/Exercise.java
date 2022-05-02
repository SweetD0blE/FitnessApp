package com.example.fitnesstrener;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.exercise.Press;

public class Exercise extends AppCompatActivity {

    private ImageButton imageButtonReturn1;
    ImageButton imageButtonABS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        imageButtonABS = findViewById(R.id.imageButtonABS);
        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);













        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageButtonABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise.this, Press.class);
                startActivity(intent);
            }
        });
    }
}

