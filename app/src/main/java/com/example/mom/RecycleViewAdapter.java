package com.example.mom;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.ViewHolder {
    TextView textView;
    RecyclerView recyclerView;

    public RecycleViewAdapter(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        recyclerView = itemView.findViewById(R.id.recyclerView4);

    }
}
