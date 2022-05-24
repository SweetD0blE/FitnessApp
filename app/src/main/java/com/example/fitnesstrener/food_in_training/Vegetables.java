package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_fish.Losos;
import com.example.fitnesstrener.food_in_fish.Mintai;
import com.example.fitnesstrener.food_in_fish.Treska;
import com.example.fitnesstrener.food_in_fish.Tynec;
import com.example.fitnesstrener.food_in_vegetables.Carrot;
import com.example.fitnesstrener.food_in_vegetables.Cucumber;
import com.example.fitnesstrener.food_in_vegetables.Kabachki;
import com.example.fitnesstrener.food_in_vegetables.Kapysta;
import com.example.fitnesstrener.training_and_food.FoodRec;

public class Vegetables extends AppCompatActivity {
    ImageButton imageButtonReturn1;

    ImageView imageViewKapusta,imageViewCucumber,imageViewCarrot,imageViewKabachki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables);



        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vegetables.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewKapusta = findViewById(R.id.imageViewKapusta);

        imageViewKapusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vegetables.this, Kapysta.class);
                startActivity(intent);
            }
        });

        imageViewCucumber = findViewById(R.id.imageViewCucumber);

        imageViewCucumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vegetables.this, Cucumber.class);
                startActivity(intent);
            }
        });

        imageViewCarrot = findViewById(R.id.imageViewCarrot);

        imageViewCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vegetables.this, Carrot.class);
                startActivity(intent);
            }
        });

        imageViewKabachki = findViewById(R.id.imageViewKabachki);

        imageViewKabachki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vegetables.this, Kabachki.class);
                startActivity(intent);
            }
        });

    }
}
