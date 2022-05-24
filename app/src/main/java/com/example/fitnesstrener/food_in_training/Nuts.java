package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_nuts.Cashew;
import com.example.fitnesstrener.food_in_nuts.Funduk;
import com.example.fitnesstrener.food_in_nuts.GrezkiyOreh;
import com.example.fitnesstrener.food_in_nuts.Mindal;
import com.example.fitnesstrener.food_in_vegetables.Carrot;
import com.example.fitnesstrener.food_in_vegetables.Cucumber;
import com.example.fitnesstrener.food_in_vegetables.Kabachki;
import com.example.fitnesstrener.food_in_vegetables.Kapysta;
import com.example.fitnesstrener.training_and_food.FoodRec;

public class Nuts extends AppCompatActivity {
    ImageButton imageButtonReturn1;
    ImageView imageViewFunduk,imageViewMindal,imageViewGrezkiyOreh,imageViewCashew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuts);



        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nuts.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewFunduk = findViewById(R.id.imageViewFunduk);

        imageViewFunduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nuts.this, Funduk.class);
                startActivity(intent);
            }
        });

        imageViewMindal = findViewById(R.id.imageViewMindal);

        imageViewMindal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nuts.this, Mindal.class);
                startActivity(intent);
            }
        });

        imageViewGrezkiyOreh = findViewById(R.id.imageViewGrezkiyOreh);

        imageViewGrezkiyOreh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nuts.this, GrezkiyOreh.class);
                startActivity(intent);
            }
        });

        imageViewCashew = findViewById(R.id.imageViewCashew);

        imageViewCashew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nuts.this, Cashew.class);
                startActivity(intent);
            }
        });

    }
}
