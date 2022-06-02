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
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_arms.UpShtanga;
import com.example.fitnesstrener.exercise_in_back.HyperExtenzia;
import com.example.fitnesstrener.exercise_in_back.Podtyagivaniya;
import com.example.fitnesstrener.exercise_in_back.TyagaGanteli;
import com.example.fitnesstrener.exercise_in_back.TyagaTrosa;
import com.example.fitnesstrener.exercise_in_back.TyagaVerhnegoBlocka;

public class Back extends AppCompatActivity {
    ImageButton imageButtonReturn1;
    ImageView imageViewHyperExtenzia, imageViewPodtyagivaniya, imageViewTyagatrossa,imageViewTyagaverhnegobloka ,imageViewTyagaganteli ;
    TextView textViewHyperExtenzia, textViewPodtyagivaniya, textViewTyagatrossa,textViewTyagaverhnegobloka , textViewTyagaganteli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Back.this, Exercise.class);
                startActivity(intent);
            }
        });
        imageViewHyperExtenzia = findViewById(R.id.imageViewHyperExtenzia);

        imageViewHyperExtenzia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Back.this, HyperExtenzia.class);
                startActivity(intent);
            }
        });

        imageViewPodtyagivaniya = findViewById(R.id.imageViewPodtyagivaniya);

        imageViewPodtyagivaniya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, Podtyagivaniya.class);
                startActivity(intent);
            }
        });

        imageViewTyagatrossa = findViewById(R.id.imageViewTyagatrossa);

        imageViewTyagatrossa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaTrosa.class);
                startActivity(intent);
            }
        });

        imageViewTyagaverhnegobloka = findViewById(R.id.imageViewTyagaverhnegobloka);

        imageViewTyagaverhnegobloka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaVerhnegoBlocka.class);
                startActivity(intent);
            }
        });

        imageViewTyagaganteli = findViewById(R.id.imageViewTyagaganteli);

        imageViewTyagaganteli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaGanteli.class);
                startActivity(intent);
            }
        });

        textViewHyperExtenzia = findViewById(R.id.textViewHyperExtenzia);

        textViewHyperExtenzia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Back.this, HyperExtenzia.class);
                startActivity(intent);
            }
        });

        textViewPodtyagivaniya = findViewById(R.id.textViewPodtyagivaniya);

        textViewPodtyagivaniya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, Podtyagivaniya.class);
                startActivity(intent);
            }
        });

        textViewTyagatrossa = findViewById(R.id.textViewTyagatrossa);

        textViewTyagatrossa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaTrosa.class);
                startActivity(intent);
            }
        });

        textViewTyagaverhnegobloka = findViewById(R.id.textViewTyagaverhnegobloka);

        textViewTyagaverhnegobloka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaVerhnegoBlocka.class);
                startActivity(intent);
            }
        });

        textViewTyagaganteli = findViewById(R.id.textViewTyagaganteli);

        textViewTyagaganteli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Back.this, TyagaGanteli.class);
                startActivity(intent);
            }
        });

    }
}

