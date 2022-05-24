package com.example.fitnesstrener.training_and_food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnesstrener.MainActivity;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.training_in.Ponedelnik;
import com.example.fitnesstrener.training_in.Pyatniza;
import com.example.fitnesstrener.training_in.Sreda;

public class Training extends AppCompatActivity {
    ImageButton imageButtonReturn;
    CardView cardViewFood,cardViewPonedelnik,cardViewSreda,cardViewPyatniza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training);

        imageButtonReturn = findViewById(R.id.imageButtonReturn);

        imageButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, MainActivity.class);
                startActivity(intent);
            }
        });


        cardViewFood = findViewById(R.id.cardViewFood);

        cardViewFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, FoodRec.class);
                startActivity(intent);
            }
        });

        cardViewPonedelnik = findViewById(R.id.cardViewPonedelnik);

        cardViewPonedelnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, Ponedelnik.class);
                startActivity(intent);
            }
        });
        cardViewSreda = findViewById(R.id.cardViewSreda);

        cardViewSreda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, Sreda.class);
                startActivity(intent);
            }
        });
        cardViewPyatniza = findViewById(R.id.cardViewPyatniza);

        cardViewPyatniza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, Pyatniza.class);
                startActivity(intent);
            }
        });

    }
}

