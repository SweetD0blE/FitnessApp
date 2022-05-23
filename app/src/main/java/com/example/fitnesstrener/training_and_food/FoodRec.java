package com.example.fitnesstrener.training_and_food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.Exercise;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.RecyclerView.Activity_exercise_list;
import com.example.fitnesstrener.exercise.Arms;
import com.example.fitnesstrener.exercise.Back;
import com.example.fitnesstrener.exercise.Cardio;
import com.example.fitnesstrener.exercise.Chest;
import com.example.fitnesstrener.exercise.Legs;
import com.example.fitnesstrener.exercise.Press;
import com.example.fitnesstrener.food_in_training.Dairy;
import com.example.fitnesstrener.food_in_training.Fish;
import com.example.fitnesstrener.food_in_training.Meat;
import com.example.fitnesstrener.food_in_training.Nuts;
import com.example.fitnesstrener.food_in_training.Vegetables;
import com.example.fitnesstrener.food_in_training.Water;
import com.example.fitnesstrener.food_in_training.Wheat;

public class FoodRec extends AppCompatActivity {

    private ImageButton imageButtonReturn1;
    ImageButton imageButtonWater, imageButtonMeat, imageButtonFish, imageButtonVegetables, imageButtonNuts, imageButtonDairy, imageButtonWheat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodrec);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodRec.this, Training.class);
                startActivity(intent);
            }
        });


        imageButtonWater = findViewById(R.id.imageButtonWater);

        imageButtonWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Water.class);
                startActivity(intent);
            }
        });

        imageButtonMeat = findViewById(R.id.imageButtonMeat);

        imageButtonMeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Meat.class);
                startActivity(intent);
            }
        });

        imageButtonFish = findViewById(R.id.imageButtonFish);

        imageButtonFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Fish.class);
                startActivity(intent);
            }
        });

        imageButtonVegetables = findViewById(R.id.imageButtonVegetables);

        imageButtonVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Vegetables.class);
                startActivity(intent);
            }
        });

        imageButtonNuts = findViewById(R.id.imageButtonNuts);

        imageButtonNuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Nuts.class);
                startActivity(intent);
            }
        });

        imageButtonDairy = findViewById(R.id.imageButtonDairy);

        imageButtonDairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Dairy.class);
                startActivity(intent);
            }
        });

        imageButtonWheat = findViewById(R.id.imageButtonWheat);

        imageButtonWheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodRec.this, Wheat.class);
                startActivity(intent);
            }
        });
    }

}
