package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_dairy.Cheese;
import com.example.fitnesstrener.food_in_dairy.Eggs;
import com.example.fitnesstrener.food_in_dairy.Kefir;
import com.example.fitnesstrener.food_in_dairy.Yogurt;
import com.example.fitnesstrener.food_in_fish.Losos;
import com.example.fitnesstrener.food_in_fish.Mintai;
import com.example.fitnesstrener.food_in_fish.Treska;
import com.example.fitnesstrener.food_in_fish.Tynec;
import com.example.fitnesstrener.training_and_food.FoodRec;

public class Fish extends AppCompatActivity {
    ImageButton imageButtonReturn1;
    ImageView imageViewTreska,imageViewMintai,imageViewLosos,imageViewTynec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish);



        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fish.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewTreska = findViewById(R.id.imageViewTreska);

        imageViewTreska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fish.this, Treska.class);
                startActivity(intent);
            }
        });

        imageViewMintai = findViewById(R.id.imageViewMintai);

        imageViewMintai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fish.this, Mintai.class);
                startActivity(intent);
            }
        });

        imageViewLosos = findViewById(R.id.imageViewLosos);

        imageViewLosos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fish.this, Losos.class);
                startActivity(intent);
            }
        });

        imageViewTynec = findViewById(R.id.imageViewTynec);

        imageViewTynec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fish.this, Tynec.class);
                startActivity(intent);
            }
        });
    }
}
