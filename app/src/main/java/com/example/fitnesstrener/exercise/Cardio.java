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
import com.example.fitnesstrener.exercise_in_cardio.BegovayaDorojka;
import com.example.fitnesstrener.exercise_in_cardio.Berpi;
import com.example.fitnesstrener.exercise_in_cardio.JumpWithSkakalka;
import com.example.fitnesstrener.exercise_in_cardio.Stepper;
import com.example.fitnesstrener.exercise_in_cardio.Velotrenajor;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.JimShtangiLeja;
import com.example.fitnesstrener.exercise_in_chest.OtjimNaBrysiah;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_chest.SvedenieRyk;

public class Cardio extends AppCompatActivity {

    ImageButton imageButtonReturn1;
    ImageView imageViewStepper, imageViewBegovayaDorojka, imageViewJumpWithSkakalka,imageViewBerpi ,imageViewVelotrenajor ;
    TextView title, osnmysch, slojnost, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardio);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardio.this, Exercise.class);
                startActivity(intent);
            }
        });
        imageViewStepper = findViewById(R.id.imageViewStepper);

        imageViewStepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardio.this, Stepper.class);
                startActivity(intent);
            }
        });

        imageViewBegovayaDorojka = findViewById(R.id.imageViewBegovayaDorojka);

        imageViewBegovayaDorojka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cardio.this, BegovayaDorojka.class);
                startActivity(intent);
            }
        });

        imageViewJumpWithSkakalka = findViewById(R.id.imageViewJumpWithSkakalka);

        imageViewJumpWithSkakalka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cardio.this, JumpWithSkakalka.class);
                startActivity(intent);
            }
        });

        imageViewBerpi = findViewById(R.id.imageViewBerpi);

        imageViewBerpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cardio.this, Berpi.class);
                startActivity(intent);
            }
        });

        imageViewVelotrenajor = findViewById(R.id.imageViewVelotrenajor);

        imageViewVelotrenajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cardio.this, Velotrenajor.class);
                startActivity(intent);
            }
        });

    }
}

