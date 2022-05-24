package com.example.fitnesstrener.food_in_vegetables;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Kapysta extends AppCompatActivity {
    TextView title,description, belok, jiri, yglevodi, kkal;

    FirebaseAuth mAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_food);


        title = findViewById(R.id.title);
        belok = findViewById(R.id.belok);
        jiri = findViewById(R.id.jiri);
        yglevodi = findViewById(R.id.yglevodi);
        kkal = findViewById(R.id.kkal);
        description = findViewById(R.id.description);



        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();


        DocumentReference documentReference = fStore.collection("Food_vegetables_kapysta").document("Bm7EXvuXTN8MW9IShCgi");
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    if (documentSnapshot.exists()) {
                        title.setText(documentSnapshot.getString("Название"));
                        description.setText(documentSnapshot.getString("Описание"));
                        belok.setText(documentSnapshot.getString("Белки"));
                        jiri.setText(documentSnapshot.getString("Жиры"));
                        yglevodi.setText(documentSnapshot.getString("Углеводы"));
                        kkal.setText(documentSnapshot.getString("Ккал"));


                    } else {
                        Log.d("Сообщение об ошибке", "Ошибка в документе");
                    }
                }
            }

        });
    }
}
