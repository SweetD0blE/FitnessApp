package com.example.fitnesstrener.RecyclerView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SearchView;

import com.example.fitnesstrener.Exercise;
import com.example.fitnesstrener.MainActivity;
import com.example.fitnesstrener.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.squareup.okhttp.internal.DiskLruCache;

import java.util.ArrayList;
import java.util.List;

public class Activity_exercise_list extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Exercise_list> exercise_lists;
    FirebaseFirestore fstore;
    ExerciseAdapter exerciseAdapter;
    public static Context context;
    ImageButton imageButtonReturn1;
    EditText searchExercise;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        fstore = FirebaseFirestore.getInstance();
        context = getApplicationContext();

        searchExercise = findViewById(R.id.searchExercise);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        recyclerView.setHasFixedSize(true);
        exercise_lists = new ArrayList<>();

        exerciseAdapter = new ExerciseAdapter(exercise_lists);

        recyclerView.setAdapter(exerciseAdapter);


        fstore.collection("Search").orderBy("name", Query.Direction.ASCENDING).get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot documentSnapshot : task.getResult().getDocuments()) {
                                Exercise_list exercise_list = documentSnapshot.toObject(Exercise_list.class);
                                assert exercise_list != null;
                                exercise_lists.add(exercise_list);
                                exerciseAdapter.notifyDataSetChanged();

                            }
                        }
                    }
                });

        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_exercise_list.this, Exercise.class);
                startActivity(intent);
            }
        });

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().isEmpty()) {
                   exercise_lists.clear();
                   exerciseAdapter.notifyDataSetChanged();
               } else {
                   searchExercise(s.toString());
              }
            }
        };
        searchExercise.addTextChangedListener(textWatcher);

    }
       private void searchExercise(String name) {
           if (!name.isEmpty()) {
               fstore.collection("Search").whereEqualTo("name", name).get()
                       .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                           @Override
                           public void onComplete(@NonNull Task<QuerySnapshot> task) {
                               if (task.isSuccessful() && task.getResult() != null) {
                                   exercise_lists.clear();
                                   exerciseAdapter.notifyDataSetChanged();

                                   for (DocumentSnapshot doc : task.getResult().getDocuments()) {
                                       Exercise_list exercise_list = doc.toObject(Exercise_list.class);
                                       exercise_lists.add(exercise_list);
                                       exerciseAdapter.notifyDataSetChanged();
                                   }
                               }
                           }
                       });
           }
       }




}