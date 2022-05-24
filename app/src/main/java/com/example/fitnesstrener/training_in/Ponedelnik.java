package com.example.fitnesstrener.training_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnesstrener.MainActivity;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_legs.SgibanieNog;
import com.example.fitnesstrener.exercise_in_legs.VipadiSGantelyami;
import com.example.fitnesstrener.training_and_food.Training;

public class Ponedelnik extends AppCompatActivity {

    ImageButton imageButtonReturn;
    CardView cardViewOtjimanie,cardViewJimGanteley,cardViewVipadiGanteli,cardViewOtjmOtSkamii ,cardViewSgibanieNog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ponedelnik);


        imageButtonReturn = findViewById(R.id.imageButtonReturn);

        imageButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, Training.class);
                startActivity(intent);
            }
        });

        cardViewOtjimanie = findViewById(R.id.cardViewOtjimanie);

        cardViewOtjimanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, Otjimaniya.class);
                startActivity(intent);
            }
        });

        cardViewJimGanteley = findViewById(R.id.cardViewJimGanteley);

        cardViewJimGanteley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, JimGantelei.class);
                startActivity(intent);
            }
        });

        cardViewVipadiGanteli = findViewById(R.id.cardViewVipadiGanteli);

        cardViewVipadiGanteli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, VipadiSGantelyami.class);
                startActivity(intent);
            }
        });

        cardViewOtjmOtSkamii = findViewById(R.id.cardViewOtjmOtSkamii);

        cardViewOtjmOtSkamii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, OntjimSkamii.class);
                startActivity(intent);
            }
        });

        cardViewSgibanieNog = findViewById(R.id.cardViewSgibanieNog);

        cardViewSgibanieNog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ponedelnik.this, SgibanieNog.class);
                startActivity(intent);
            }
        });
    }
}
