package com.example.fitnesstrener.training_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise_in_arms.Molotok;
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_back.Podtyagivaniya;
import com.example.fitnesstrener.exercise_in_cardio.JumpWithSkakalka;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.OtjimNaBrysiah;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_legs.PrisedaniyaSoShtangoi;
import com.example.fitnesstrener.exercise_in_legs.SgibanieNog;
import com.example.fitnesstrener.exercise_in_legs.VipadiSGantelyami;
import com.example.fitnesstrener.training_and_food.Training;

public class Sreda extends AppCompatActivity {
    ImageButton imageButtonReturn;

    CardView cardViewPodtyagivaniya, cardViewPrisedaniya, cardViewSkakalka, cardViewHummers, cardViewOtjimNaBrysiah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sreda);


        imageButtonReturn = findViewById(R.id.imageButtonReturn);

        imageButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, Training.class);
                startActivity(intent);
            }
        });

        cardViewPodtyagivaniya = findViewById(R.id.cardViewPodtyagivaniya);

        cardViewPodtyagivaniya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, Podtyagivaniya.class);
                startActivity(intent);
            }
        });

        cardViewPrisedaniya = findViewById(R.id.cardViewPrisedaniya);

        cardViewPrisedaniya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, PrisedaniyaSoShtangoi.class);
                startActivity(intent);
            }
        });

        cardViewSkakalka = findViewById(R.id.cardViewSkakalka);

        cardViewSkakalka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, JumpWithSkakalka.class);
                startActivity(intent);
            }
        });

        cardViewHummers = findViewById(R.id.cardViewHummers);

        cardViewHummers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, Molotok.class);
                startActivity(intent);
            }
        });

        cardViewOtjimNaBrysiah = findViewById(R.id.cardViewOtjimNaBrysiah);

        cardViewOtjimNaBrysiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sreda.this, OtjimNaBrysiah.class);
                startActivity(intent);
            }
        });

    }
}
