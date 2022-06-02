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
import com.example.fitnesstrener.exercise_in_back.HyperExtenzia;
import com.example.fitnesstrener.exercise_in_back.Podtyagivaniya;
import com.example.fitnesstrener.exercise_in_back.TyagaGanteli;
import com.example.fitnesstrener.exercise_in_back.TyagaTrosa;
import com.example.fitnesstrener.exercise_in_back.TyagaVerhnegoBlocka;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.JimShtangiLeja;
import com.example.fitnesstrener.exercise_in_chest.OtjimNaBrysiah;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_chest.SvedenieRyk;

public class Chest extends AppCompatActivity {
    ImageButton imageButtonReturn1;
    ImageView imageViewOtjim, imageViewJimGantelei, imageViewJimShtangiLeja,imageViewSvedenieRyk ,imageViewOtjimNaBrysiah ;
    TextView textViewOtjim,textViewJimGantelei , textViewJimShtangiLeja,textViewSvedenieRyk , textViewOtjimNaBrysiah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, Exercise.class);
                startActivity(intent);
            }
        });

        imageViewOtjim = findViewById(R.id.imageViewOtjim);

        imageViewOtjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, Otjimaniya.class);
                startActivity(intent);
            }
        });

        imageViewJimGantelei = findViewById(R.id.imageViewJimGantelei);

        imageViewJimGantelei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, JimGantelei.class);
                startActivity(intent);
            }
        });

        imageViewJimShtangiLeja = findViewById(R.id.imageViewJimShtangiLeja);

        imageViewJimShtangiLeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, JimShtangiLeja.class);
                startActivity(intent);
            }
        });

        imageViewSvedenieRyk = findViewById(R.id.imageViewSvedenieRyk);

        imageViewSvedenieRyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, SvedenieRyk.class);
                startActivity(intent);
            }
        });

        imageViewOtjimNaBrysiah = findViewById(R.id.imageViewOtjimNaBrysiah);

        imageViewOtjimNaBrysiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, OtjimNaBrysiah.class);
                startActivity(intent);
            }
        });

        textViewOtjim = findViewById(R.id.textViewOtjim);

        textViewOtjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, Otjimaniya.class);
                startActivity(intent);
            }
        });

        textViewJimGantelei = findViewById(R.id.textViewJimGantelei);

        textViewJimGantelei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, JimGantelei.class);
                startActivity(intent);
            }
        });

        textViewJimShtangiLeja = findViewById(R.id.textViewJimShtangiLeja);

        textViewJimShtangiLeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, JimShtangiLeja.class);
                startActivity(intent);
            }
        });

        textViewSvedenieRyk = findViewById(R.id.textViewSvedenieRyk);

        textViewSvedenieRyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, SvedenieRyk.class);
                startActivity(intent);
            }
        });

        textViewOtjimNaBrysiah = findViewById(R.id.textViewOtjimNaBrysiah);

        textViewOtjimNaBrysiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chest.this, OtjimNaBrysiah.class);
                startActivity(intent);
            }
        });

    }
}
