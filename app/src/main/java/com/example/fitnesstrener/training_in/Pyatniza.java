package com.example.fitnesstrener.training_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise_in_arms.DiamondOtjim;
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_back.TyagaVerhnegoBlocka;
import com.example.fitnesstrener.exercise_in_cardio.Berpi;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_legs.SgibanieNog;
import com.example.fitnesstrener.exercise_in_legs.TyagaSGantelyami;
import com.example.fitnesstrener.exercise_in_legs.VipadiSGantelyami;
import com.example.fitnesstrener.exercise_in_press.Twisting;
import com.example.fitnesstrener.training_and_food.Training;

public class Pyatniza extends AppCompatActivity {
    ImageButton imageButtonReturn;

    CardView cardViewTwisting, cardViewTyagaSGantelyami, cardViewDiamondOtjim, cardViewTyagaVerhnegoBloka, cardViewBerpi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pyatniza);


        imageButtonReturn = findViewById(R.id.imageButtonReturn);

        imageButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, Training.class);
                startActivity(intent);
            }
        });

        cardViewTwisting = findViewById(R.id.cardViewTwisting);

        cardViewTwisting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, Twisting.class);
                startActivity(intent);
            }
        });

        cardViewTyagaSGantelyami = findViewById(R.id.cardViewTyagaSGantelyami);

        cardViewTyagaSGantelyami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, TyagaSGantelyami.class);
                startActivity(intent);
            }
        });

        cardViewDiamondOtjim = findViewById(R.id.cardViewDiamondOtjim);

        cardViewDiamondOtjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, DiamondOtjim.class);
                startActivity(intent);
            }
        });

        cardViewTyagaVerhnegoBloka = findViewById(R.id.cardViewTyagaVerhnegoBloka);

        cardViewTyagaVerhnegoBloka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, TyagaVerhnegoBlocka.class);
                startActivity(intent);
            }
        });

        cardViewBerpi = findViewById(R.id.cardViewBerpi);

        cardViewBerpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pyatniza.this, Berpi.class);
                startActivity(intent);
            }
        });
    }
}
