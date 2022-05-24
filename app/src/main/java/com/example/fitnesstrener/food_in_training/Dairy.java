package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_dairy.Cheese;
import com.example.fitnesstrener.food_in_dairy.Eggs;
import com.example.fitnesstrener.food_in_dairy.Kefir;
import com.example.fitnesstrener.food_in_dairy.Yogurt;
import com.example.fitnesstrener.training_and_food.FoodRec;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Dairy extends AppCompatActivity {
    ImageButton imageButtonReturn1;
    ImageView imageViewKefir,imageViewCheese,imageViewEggs,imageViewYogurt;

    FirebaseAuth mAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dairy);

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dairy.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewKefir = findViewById(R.id.imageViewKefir);

        imageViewKefir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dairy.this, Kefir.class);
                startActivity(intent);
            }
        });

        imageViewCheese = findViewById(R.id.imageViewCheese);

        imageViewCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dairy.this, Cheese.class);
                startActivity(intent);
            }
        });

        imageViewEggs = findViewById(R.id.imageViewEggs);

        imageViewEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dairy.this, Eggs.class);
                startActivity(intent);
            }
        });

        imageViewYogurt = findViewById(R.id.imageViewYogurt);

        imageViewYogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dairy.this, Yogurt.class);
                startActivity(intent);
            }
        });

    }
}
