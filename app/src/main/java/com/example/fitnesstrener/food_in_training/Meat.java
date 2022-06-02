package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_dairy.Cheese;
import com.example.fitnesstrener.food_in_dairy.Eggs;
import com.example.fitnesstrener.food_in_dairy.Kefir;
import com.example.fitnesstrener.food_in_dairy.Yogurt;
import com.example.fitnesstrener.food_in_meat.Chicken;
import com.example.fitnesstrener.food_in_meat.Indeika;
import com.example.fitnesstrener.food_in_meat.Rabbit;
import com.example.fitnesstrener.food_in_meat.Telyatina;
import com.example.fitnesstrener.training_and_food.FoodRec;

public class Meat extends AppCompatActivity {
    ImageButton imageButtonReturn1;

    ImageView imageViewChicken,imageViewIndeika,imageViewTelyatina,imageViewRabbit;
    TextView textViewChicken, textViewIndeika,textViewRabbit , textViewTelyatina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meat);



        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Meat.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewChicken = findViewById(R.id.imageViewChicken);

        imageViewChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Chicken.class);
                startActivity(intent);
            }
        });

        imageViewIndeika = findViewById(R.id.imageViewIndeika);

        imageViewIndeika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Indeika.class);
                startActivity(intent);
            }
        });

        imageViewTelyatina = findViewById(R.id.imageViewTelyatina);

        imageViewTelyatina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Telyatina.class);
                startActivity(intent);
            }
        });

        imageViewRabbit = findViewById(R.id.imageViewRabbit);

        imageViewRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Rabbit.class);
                startActivity(intent);
            }
        });

        textViewChicken = findViewById(R.id.textViewChicken);

        textViewChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Chicken.class);
                startActivity(intent);
            }
        });

        textViewIndeika = findViewById(R.id.textViewIndeika);

        textViewIndeika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Indeika.class);
                startActivity(intent);
            }
        });

        textViewTelyatina = findViewById(R.id.textViewTelyatina);

        textViewTelyatina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Telyatina.class);
                startActivity(intent);
            }
        });

        textViewRabbit = findViewById(R.id.textViewRabbit);

        textViewRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meat.this, Rabbit.class);
                startActivity(intent);
            }
        });
    }
}
