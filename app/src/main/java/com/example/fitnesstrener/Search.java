package com.example.fitnesstrener;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Search extends AppCompatActivity {

    private ItemAdapter itemAdapter;
    private SearchView searchView;
    public List<Item> itemList;
    private RecyclerView recyclerView;
    ImageButton imageButtonReturn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_exercise);


        imageButtonReturn1 = findViewById(R.id.imageButtonReturn1);

        imageButtonReturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, Exercise.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();


        itemList = new ArrayList<>();

        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));
        itemList.add(new Item("Skrychivaniya", R.drawable.twisting));

        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

    }

    private void filterList(String text) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : itemList){
            if (item.getItemName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        if (filteredList.isEmpty()){
            Toast.makeText(this,"Упражнение не найдено", Toast.LENGTH_SHORT).show();
        }else{
            itemAdapter.setFilteredList(filteredList);
        }

    }


}
