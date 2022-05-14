package com.example.fitnesstrener.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.Exercise;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise_in_arms.DiamondOtjim;
import com.example.fitnesstrener.exercise_in_arms.FranceJim;
import com.example.fitnesstrener.exercise_in_arms.Molotok;
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_arms.UpShtanga;
import com.example.fitnesstrener.exercise_in_press.Twisting;

public class Arms extends AppCompatActivity {

    ImageButton imageButtonReturn1;
    ImageView imageViewMolotok, imageViewPushUp, imageViewUpShtanga,imageViewDiamondOtjim ,imageViewFrancejim ;
    TextView title, osnmysch, slojnost, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arms);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Arms.this, Exercise.class);
                startActivity(intent);
            }
        });
        imageViewMolotok = findViewById(R.id.imageViewMolotok);

        imageViewMolotok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Arms.this, Molotok.class);
                startActivity(intent);
            }
        });

        imageViewPushUp = findViewById(R.id.imageViewPushUp);

        imageViewPushUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Arms.this, OntjimSkamii.class);
                startActivity(intent);
            }
        });

        imageViewUpShtanga = findViewById(R.id.imageViewUpShtanga);

        imageViewUpShtanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Arms.this, UpShtanga.class);
                startActivity(intent);
            }
        });

        imageViewDiamondOtjim = findViewById(R.id.imageViewDiamondOtjim);

        imageViewDiamondOtjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Arms.this, DiamondOtjim.class);
                startActivity(intent);
            }
        });

        imageViewFrancejim = findViewById(R.id.imageViewFrancejim);

        imageViewFrancejim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Arms.this, FranceJim.class);
                startActivity(intent);
            }
        });

    }
}
