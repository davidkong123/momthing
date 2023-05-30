package com.example.mom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button[] btns = new Button[3];
    RecyclerView[] recyclerViews = new RecyclerView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns[0] = findViewById(R.id.button);
        btns[1] = findViewById(R.id.button2);
        btns[2] = findViewById(R.id.button3);

        recyclerViews[0] = findViewById(R.id.recyclerView);
        recyclerViews[1] = findViewById(R.id.recyclerView2);
        recyclerViews[2] = findViewById(R.id.recyclerView3);

        String[] lans = {"Language 1", "Language 2", "Language 3"};

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("מה נשמעה 1", lans));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("מה נשמעה 2", lans));

        List<Item> items3 = new ArrayList<>();
        items3.add(new Item("מה נשמעה 3", lans));

        btns[0].setOnClickListener(this::onClick);
        recyclerViews[0].setLayoutManager(new LinearLayoutManager(this));
        recyclerViews[0].setAdapter(new myAdapter(getApplicationContext(), items1));

        btns[1].setOnClickListener(this::onClick);
        recyclerViews[1].setLayoutManager(new LinearLayoutManager(this));
        recyclerViews[1].setAdapter(new myAdapter(getApplicationContext(), items2));

        btns[2].setOnClickListener(this::onClick);
        recyclerViews[2].setLayoutManager(new LinearLayoutManager(this));
        recyclerViews[2].setAdapter(new myAdapter(getApplicationContext(), items3));
    }

    void onClick(View view) {
        recyclerViews[0].setVisibility(View.GONE); // Hide RecyclerView 1
        recyclerViews[1].setVisibility(View.GONE); // Hide RecyclerView 2
        recyclerViews[2].setVisibility(View.GONE); // Hide RecyclerView 3

        if (view == btns[0]) {
            recyclerViews[0].setVisibility(View.VISIBLE);
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
        } else if (view == btns[1]) {
            recyclerViews[1].setVisibility(View.VISIBLE);
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
        }
        else if (view == btns[2]) {
            recyclerViews[2].setVisibility(View.VISIBLE);
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
        }
    }
}