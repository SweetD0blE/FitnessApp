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
import com.example.fitnesstrener.exercise_in_arms.DiamondOtjim;
import com.example.fitnesstrener.exercise_in_arms.FranceJim;
import com.example.fitnesstrener.exercise_in_arms.Molotok;
import com.example.fitnesstrener.exercise_in_arms.OntjimSkamii;
import com.example.fitnesstrener.exercise_in_arms.UpShtanga;
import com.example.fitnesstrener.exercise_in_back.HyperExtenzia;
import com.example.fitnesstrener.exercise_in_back.Podtyagivaniya;
import com.example.fitnesstrener.exercise_in_back.TyagaGanteli;
import com.example.fitnesstrener.exercise_in_back.TyagaTrosa;
import com.example.fitnesstrener.exercise_in_back.TyagaVerhnegoBlocka;
import com.example.fitnesstrener.exercise_in_cardio.BegovayaDorojka;
import com.example.fitnesstrener.exercise_in_cardio.Berpi;
import com.example.fitnesstrener.exercise_in_cardio.JumpWithSkakalka;
import com.example.fitnesstrener.exercise_in_cardio.Stepper;
import com.example.fitnesstrener.exercise_in_cardio.Velotrenajor;
import com.example.fitnesstrener.exercise_in_chest.JimGantelei;
import com.example.fitnesstrener.exercise_in_chest.JimShtangiLeja;
import com.example.fitnesstrener.exercise_in_chest.OtjimNaBrysiah;
import com.example.fitnesstrener.exercise_in_chest.Otjimaniya;
import com.example.fitnesstrener.exercise_in_chest.SvedenieRyk;
import com.example.fitnesstrener.exercise_in_legs.PrisedaniyaSoShtangoi;
import com.example.fitnesstrener.exercise_in_legs.SgibanieNog;
import com.example.fitnesstrener.exercise_in_legs.TyagaSGantelyami;
import com.example.fitnesstrener.exercise_in_legs.VipadiSGantelyami;
import com.example.fitnesstrener.exercise_in_legs.Zashagivanie;
import com.example.fitnesstrener.exercise_in_press.Bicycle;
import com.example.fitnesstrener.exercise_in_press.LegsUp;
import com.example.fitnesstrener.exercise_in_press.Planka;
import com.example.fitnesstrener.exercise_in_press.SidePlanka;
import com.example.fitnesstrener.exercise_in_press.Twisting;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.Viewholder> {
    List<Exercise_list> exercise_lists;
    Context context;

    public ExerciseAdapter(Context context, List<Exercise_list> exercise_lists) {
        this.exercise_lists = exercise_lists;
        this.context = context;
        FirebaseFirestore.getInstance();
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
        Glide.with(context).load(exercise_lists.get(position).getImg_url()).into(holder.imageExercise);

        if(exercise_lists.get(position).getName().equals("??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Molotok.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????????? ??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DiamondOtjim.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????????? ??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, BegovayaDorojka.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????? ????????????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Berpi.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????????? ????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, SidePlanka.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Bicycle.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("????????????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Velotrenajor.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????? ?? ??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, VipadiSGantelyami.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("????????????????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, HyperExtenzia.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????? ????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, JimGantelei.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????? ????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, JimShtangiLeja.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????????????????? ???? ??????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Zashagivanie.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Otjimaniya.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????????????? ???? ??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, OtjimNaBrysiah.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("?????????????????? ???? ????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, OntjimSkamii.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Planka.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("????????????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Podtyagivaniya.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????? ??????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, LegsUp.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????? ????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, UpShtanga.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????????????? ???? ??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PrisedaniyaSoShtangoi.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????? ???? ??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, JumpWithSkakalka.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????????? ??????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, SvedenieRyk.class);
                    context.startActivity(intent);
                }
            });
        }
        if(exercise_lists.get(position).getName().equals("???????????????? ??????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, SgibanieNog.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("??????????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Twisting.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Stepper.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("???????? ???????????????? ??????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TyagaVerhnegoBlocka.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("???????? ?????????????? ?? ??????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TyagaGanteli.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("???????? ?? ??????????????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TyagaSGantelyami.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("???????? ?????????? ????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TyagaTrosa.class);
                    context.startActivity(intent);
                }
            });
        }if(exercise_lists.get(position).getName().equals("?????????????????????? ?????? ????????")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, FranceJim.class);
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
