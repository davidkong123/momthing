package com.example.mom;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecycleViewAdapter extends RecyclerView.ViewHolder {
    TextView textView;
    //FloatingActionButton floatingActionButton;

    public RecycleViewAdapter(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        //floatingActionButton = itemView.findViewById(R.id.floatingActionButton2);

    }
}
