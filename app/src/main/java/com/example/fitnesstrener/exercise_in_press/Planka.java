package com.example.fitnesstrener.exercise_in_press;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnesstrener.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.StorageReference;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Planka extends AppCompatActivity {
    TextView title,osnmysch,slojnost,description;


    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String exerciseId;
    StorageReference storageReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_exercise);

        title = findViewById(R.id.title);
        osnmysch = findViewById(R.id.osnmysch);
        slojnost = findViewById(R.id.slojnost);
        description = findViewById(R.id.description);



        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();


        DocumentReference documentReference = fStore.collection("Exercise_press_planka").document("RjiqKGqyyTVS2xFyAfSg");
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

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "14Zd69Hw6Xk";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
    }

}