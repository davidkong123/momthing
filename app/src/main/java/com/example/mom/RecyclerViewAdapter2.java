package com.example.mom;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecyclerViewAdapter2 extends RecyclerView.ViewHolder {
    FloatingActionButton floatingActionButton;

    public RecyclerViewAdapter2(@NonNull View itemView) {
        super(itemView);
        floatingActionButton = itemView.findViewById(R.id.floatingActionButton);


    }
}
