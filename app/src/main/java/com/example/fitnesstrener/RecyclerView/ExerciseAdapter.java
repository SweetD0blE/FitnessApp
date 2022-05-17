package com.example.fitnesstrener.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitnesstrener.R;
import com.example.fitnesstrener.exercise.Arms;
import com.example.fitnesstrener.exercise_in_arms.Molotok;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.Viewholder> {
    List<Exercise_list> exercise_lists;
    public static Context context;

    public ExerciseAdapter(List<Exercise_list> exercise_lists) {
        this.exercise_lists = exercise_lists;
        FirebaseFirestore.getInstance();
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.name_exercise.setText(exercise_lists.get(position).getName());
        Glide.with(Activity_exercise_list.context).load(exercise_lists.get(position).getImg_url()).into(holder.imageExercise);

        if(exercise_lists.get(position).getName().equals("Молотки")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Activity_exercise_list.context, Molotok.class);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return exercise_lists.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {
        TextView name_exercise;
        ImageButton imageExercise;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name_exercise = itemView.findViewById(R.id.name_exercise);
            imageExercise = itemView.findViewById(R.id.imageExercise);

        }
    }
}
