package com.example.fitnesstrener.training_and_food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.fitnesstrener.R;

public class Training extends AppCompatActivity {

    CardView cardViewFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training);


        cardViewFood = findViewById(R.id.cardViewFood);

        cardViewFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Training.this, FoodRec.class);
                startActivity(intent);
            }
        });
    }
}

