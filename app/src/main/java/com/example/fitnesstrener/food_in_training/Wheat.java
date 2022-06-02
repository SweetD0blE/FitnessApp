package com.example.fitnesstrener.food_in_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.food_in_wheat.Celnozernovoi;
import com.example.fitnesstrener.food_in_wheat.Grecha;
import com.example.fitnesstrener.food_in_wheat.Makaroni;
import com.example.fitnesstrener.food_in_wheat.OtrybnoiHleb;
import com.example.fitnesstrener.training_and_food.FoodRec;

public class Wheat extends AppCompatActivity {

    ImageButton imageButtonReturn1;

    ImageView imageViewOtrybHleb,imageViewCelnozernovoi,imageViewMakaroni,imageViewGrecha;
    TextView textViewOtrybHleb,textViewCelnozernovoi,textViewMakaroni,textViewGrecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wheat);



        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wheat.this, FoodRec.class);
                startActivity(intent);
            }
        });

        imageViewOtrybHleb = findViewById(R.id.imageViewOtrybHleb);

        imageViewOtrybHleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, OtrybnoiHleb.class);
                startActivity(intent);
            }
        });

        imageViewCelnozernovoi = findViewById(R.id.imageViewCelnozernovoi);

        imageViewCelnozernovoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Celnozernovoi.class);
                startActivity(intent);
            }
        });

        imageViewMakaroni = findViewById(R.id.imageViewMakaroni);

        imageViewMakaroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Makaroni.class);
                startActivity(intent);
            }
        });

        imageViewGrecha = findViewById(R.id.imageViewGrecha);

        imageViewGrecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Grecha.class);
                startActivity(intent);
            }
        });

        textViewOtrybHleb = findViewById(R.id.textViewOtrybHleb);

        textViewOtrybHleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, OtrybnoiHleb.class);
                startActivity(intent);
            }
        });

        textViewCelnozernovoi = findViewById(R.id.textViewCelnozernovoi);

        textViewCelnozernovoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Celnozernovoi.class);
                startActivity(intent);
            }
        });

        textViewMakaroni = findViewById(R.id.textViewMakaroni);

        textViewMakaroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Makaroni.class);
                startActivity(intent);
            }
        });

        textViewGrecha = findViewById(R.id.textViewGrecha);

        textViewGrecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this, Grecha.class);
                startActivity(intent);
            }
        });


    }
}