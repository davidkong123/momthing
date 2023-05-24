package com.example.mom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


public class myAdapter extends RecyclerView.Adapter<RecycleViewAdapter>{

    Context context;
    List<Item> items;

    //FloatingActionButton floatingActionButton;

    public myAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }



    @NonNull
    @Override
    public RecycleViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecycleViewAdapter(LayoutInflater.from(context).inflate(R.layout.custom_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter holder, int position) {
        holder.textView.setText(items.get(position).getSen());
        //floatingActionButton = holder.floatingActionButton.findViewById(R.id.floatingActionButton2);



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    void onClick(View view){
        //if(view == floatingActionButton){}
    }


}
