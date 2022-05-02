package com.example.fitnesstrener.exercise_in;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.Exercise;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise.Press;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.StorageReference;

public class Twisting extends AppCompatActivity {

    TextView title,osnmysch,slojnost,description;


    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String exerciseId;
    StorageReference storageReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.press_skrychivanie);

        title = findViewById(R.id.title);
        osnmysch = findViewById(R.id.osnmysch);
        slojnost = findViewById(R.id.slojnost);
        description = findViewById(R.id.description);



        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        exerciseId = mAuth.getCurrentUser().getUid();

        DocumentReference documentReference = fStore.collection("Exercise").document(exerciseId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    if (documentSnapshot.exists()) {
                        title.setText(documentSnapshot.getString("Название"));
                        description.setText(documentSnapshot.getString("Описание"));
                        osnmysch.setText(documentSnapshot.getString("Основные мышцы"));
                        slojnost.setText(documentSnapshot.getString("Сложность выполнения"));
                    } else {
                        Log.d("Сообщение об ошибке", "Ошибка в документе");
                    }
                }
            }

        });
    }

}
