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

    Boolean flag;
    Boolean flag2;
    Boolean flag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flag = false;
        flag2 = false;
        flag3 = false;

        btns[0] = findViewById(R.id.button);
        btns[1] = findViewById(R.id.button2);
        btns[2] = findViewById(R.id.button3);

        recyclerViews[0] = findViewById(R.id.recyclerView);
        recyclerViews[1] = findViewById(R.id.recyclerView2);
        recyclerViews[2] = findViewById(R.id.recyclerView3);

        String[] lans = {"Language 1", "Language 2", "Language 3"};

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("האם כואב לך?", lans));
        items1.add(new Item("האם אתה רוצה להתקלח?", lans));
        items1.add(new Item("האם אתה רוצה תרופות נגד כאבים?", lans));
        items1.add(new Item("איזה תרופות אתה לוקח?", lans));
        items1.add(new Item("האם אתה צריך עזרה?", lans));
        items1.add(new Item("האם יש לך רגישות לתרופות?", lans));
        items1.add(new Item("חום", lans));
        items1.add(new Item("לחץ דם", lans));
        items1.add(new Item("דופק", lans));
        items1.add(new Item("כן", lans));
        items1.add(new Item("לא", lans));
        items1.add(new Item("שירותים", lans));
        items1.add(new Item("נשימה", lans));
        items1.add(new Item("בדיקת דם", lans));
        items1.add(new Item("כמה זמן", lans));
        items1.add(new Item("שתן", lans));
        items1.add(new Item("יציאה", lans));
        items1.add(new Item("שלום", lans));
        items1.add(new Item("תודה", lans));
        items1.add(new Item("בבקשה", lans));
        items1.add(new Item("מה שלומך?", lans));
        items1.add(new Item("האם אכלת?", lans));
        items1.add(new Item("סוכר", lans));
        items1.add(new Item("מה השם שלך?", lans));


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
            if (!flag) {
                recyclerViews[0].setVisibility(View.VISIBLE);
                flag = true;
            }
            else{
                recyclerViews[0].setVisibility(View.GONE);
                flag = false;
            }

        } else if (view == btns[1]) {
            if (!flag2) {
                recyclerViews[1].setVisibility(View.VISIBLE);
                flag2 = true;
            }
            else{
                recyclerViews[1].setVisibility(View.GONE);
                flag2 = false;
            }
        }
        else if (view == btns[2]) {
            if (!flag3) {
                recyclerViews[2].setVisibility(View.VISIBLE);
                flag3 = true;
            }
            else{
                recyclerViews[2].setVisibility(View.GONE);
                flag3 = false;
            }
        }
    }
}