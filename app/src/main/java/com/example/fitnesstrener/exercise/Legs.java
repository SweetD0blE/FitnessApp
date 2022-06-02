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
import com.example.fitnesstrener.exercise_in_legs.PrisedaniyaSoShtangoi;
import com.example.fitnesstrener.exercise_in_legs.SgibanieNog;
import com.example.fitnesstrener.exercise_in_legs.TyagaSGantelyami;
import com.example.fitnesstrener.exercise_in_legs.VipadiSGantelyami;
import com.example.fitnesstrener.exercise_in_legs.Zashagivanie;

public class Legs extends AppCompatActivity {

    ImageButton imageButtonReturn1;
    ImageView imageViewSgibanieNog, imageViewZashagivanieNaLavky, imageViewPrisedaniyaSoShtangoi,imageViewTyagaSGantelyami ,imageViewVipadiSGantelyami ;
    TextView textViewSgibanieNog,textViewZashagivanieNaLavky,textViewPrisedaniyaSoShtangoi,textViewTyagaSGantelyami,textViewVipadiSGantelyami;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this, Exercise.class);
                startActivity(intent);
            }
        });

        imageViewSgibanieNog = findViewById(R.id.imageViewSgibanieNog);

        imageViewSgibanieNog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this, SgibanieNog.class);
                startActivity(intent);
            }
        });

        imageViewZashagivanieNaLavky = findViewById(R.id.imageViewZashagivanieNaLavky);

        imageViewZashagivanieNaLavky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, Zashagivanie.class);
                startActivity(intent);
            }
        });

        imageViewPrisedaniyaSoShtangoi = findViewById(R.id.imageViewPrisedaniyaSoShtangoi);

        imageViewPrisedaniyaSoShtangoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, PrisedaniyaSoShtangoi.class);
                startActivity(intent);
            }
        });

        imageViewTyagaSGantelyami = findViewById(R.id.imageViewTyagaSGantelyami);

        imageViewTyagaSGantelyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, TyagaSGantelyami.class);
                startActivity(intent);
            }
        });

        imageViewVipadiSGantelyami = findViewById(R.id.imageViewVipadiSGantelyami);

        imageViewVipadiSGantelyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, VipadiSGantelyami.class);
                startActivity(intent);
            }
        });

        textViewSgibanieNog = findViewById(R.id.textViewSgibanieNog);

        textViewSgibanieNog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this, SgibanieNog.class);
                startActivity(intent);
            }
        });

        textViewZashagivanieNaLavky = findViewById(R.id.textViewZashagivanieNaLavky);

        textViewZashagivanieNaLavky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, Zashagivanie.class);
                startActivity(intent);
            }
        });

        textViewPrisedaniyaSoShtangoi = findViewById(R.id.textViewPrisedaniyaSoShtangoi);

        textViewPrisedaniyaSoShtangoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, PrisedaniyaSoShtangoi.class);
                startActivity(intent);
            }
        });

        textViewTyagaSGantelyami = findViewById(R.id.textViewTyagaSGantelyami);

        textViewTyagaSGantelyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, TyagaSGantelyami.class);
                startActivity(intent);
            }
        });

        textViewVipadiSGantelyami = findViewById(R.id.textViewVipadiSGantelyami);

        textViewVipadiSGantelyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Legs.this, VipadiSGantelyami.class);
                startActivity(intent);
            }
        });

    }
}
