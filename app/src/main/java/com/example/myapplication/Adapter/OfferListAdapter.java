package com.example.myapplication.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.models.OfferList;

import java.util.List;

public class OfferListAdapter extends RecyclerView.Adapter<OfferListAdapter.OffViewHolder> {
    List<OfferList> offerList;
    public OfferListAdapter(List<OfferList> offerList){
        this.offerList = offerList;
    }

    @NonNull
    @Override
    public OfferListAdapter.OffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OfferListAdapter.OffViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class OffViewHolder extends RecyclerView.ViewHolder{



        public OffViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
