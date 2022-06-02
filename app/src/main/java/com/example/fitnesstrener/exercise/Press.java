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
import com.example.fitnesstrener.exercise_in_press.Bicycle;
import com.example.fitnesstrener.exercise_in_press.LegsUp;
import com.example.fitnesstrener.exercise_in_press.Planka;
import com.example.fitnesstrener.exercise_in_press.SidePlanka;
import com.example.fitnesstrener.exercise_in_press.Twisting;

public class Press extends AppCompatActivity {
    //Объявляем используемые переменные:
    ImageButton imageButtonReturn1;
    ImageView imageViewScrychivanie,imageViewPlanka, imageViewSideplanka, imageViewBicycle,imageViewLegsUp;
    TextView textViewScrychivanie,textViewPlanka,textViewSideplanka,textViewBicycle,textViewLegsUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.press);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Press.this, Exercise.class);
                startActivity(intent);
            }
        });
        imageViewScrychivanie = findViewById(R.id.imageViewScrychivanie);

        imageViewScrychivanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Press.this, Twisting.class);
                startActivity(intent);
            }
        });

        imageViewPlanka = findViewById(R.id.imageViewPlanka);

        imageViewPlanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, Planka.class);
                startActivity(intent);
            }
        });

        imageViewSideplanka = findViewById(R.id.imageViewSideplanka);

        imageViewSideplanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, SidePlanka.class);
                startActivity(intent);
            }
        });

        imageViewBicycle = findViewById(R.id.imageViewBicycle);

        imageViewBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, Bicycle.class);
                startActivity(intent);
            }
        });

        imageViewLegsUp = findViewById(R.id.imageViewLegsUp);

        imageViewLegsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, LegsUp.class);
                startActivity(intent);
            }
        });

        textViewScrychivanie = findViewById(R.id.textViewScrychivanie);

        textViewScrychivanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, Twisting.class);
                startActivity(intent);
            }
        });

        textViewPlanka = findViewById(R.id.textViewPlanka);

        textViewPlanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, Planka.class);
                startActivity(intent);
            }
        });

        textViewSideplanka = findViewById(R.id.textViewSideplanka);

        textViewSideplanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, SidePlanka.class);
                startActivity(intent);
            }
        });

        textViewBicycle = findViewById(R.id.textViewBicycle);

        textViewBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, Bicycle.class);
                startActivity(intent);
            }
        });

        textViewLegsUp = findViewById(R.id.textViewLegsUp);

        textViewLegsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Press.this, LegsUp.class);
                startActivity(intent);
            }
        });
    }
}