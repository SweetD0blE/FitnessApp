package com.example.fitnesstrener.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.Exercise;
import com.example.fitnesstrener.MainActivity;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise_in.Planka;
import com.example.fitnesstrener.exercise_in.Twisting;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Press extends AppCompatActivity {
    //Объявляем используемые переменные:
    ImageButton imageButtonReturn1;
    ImageView imageViewScrychivanie,imageViewPlanka;
    TextView title, osnmysch, slojnost, description;


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
    }
}