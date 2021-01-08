package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.Categorylist;

import java.util.List;

public class CategorylistAdapter extends RecyclerView.Adapter<CategorylistAdapter.CatViewHolder> {

    List<Categorylist> categorylists;

    public CategorylistAdapter(List<Categorylist> categorylists){
        this.categorylists = categorylists;

    }

    @NonNull
    @Override
    public CategorylistAdapter.CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categorylist_layout,parent,false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategorylistAdapter.CatViewHolder holder, int position) {

      //  holder.catname.setText(position);

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class CatViewHolder extends RecyclerView.ViewHolder {
        ImageView catimage;
        TextView catname;


        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            catimage = itemView.findViewById(R.id.catimage);
            catname = itemView.findViewById(R.id.cat_name);
        }
    }
}
