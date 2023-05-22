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

        String[] lans = {};
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("מה נשמעה",lans));

        for (int i = 0; i < 3; i++) {
            btns[i].setOnClickListener(this::onClick);
            recyclerViews[i].setLayoutManager(new LinearLayoutManager(this));
            recyclerViews[i].setAdapter(new myAdapter(getApplicationContext(), items));
        }

    }

    void onClick(View view){
        if (view == btns[0]) {
            recyclerViews[0].setVisibility(View.VISIBLE);
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
        }
        else if (view == btns[1]) {
            recyclerViews[1].setVisibility(View.VISIBLE);
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
        }
        else if (view == btns[2]) {
            recyclerViews[2].setVisibility(View.VISIBLE);
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
        }
    }
}