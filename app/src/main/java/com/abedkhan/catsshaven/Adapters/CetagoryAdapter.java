package com.abedkhan.catsshaven.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.ContenerActivity;
import com.abedkhan.catsshaven.Models.CatModel;
import com.abedkhan.catsshaven.Models.CetagoryModels;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.Viewholders.CetagoryViewholder;
import com.bumptech.glide.Glide;

import java.util.List;

public class CetagoryAdapter extends RecyclerView.Adapter<CetagoryViewholder> {


    Context context;
    List<CetagoryModels>cetagoryModels;

    public CetagoryAdapter(Context context, List<CetagoryModels> cetagoryModels) {
        this.context = context;
        this.cetagoryModels = cetagoryModels;
    }

    @NonNull
    @Override
    public CetagoryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cetagory_design,parent,false);

        return new CetagoryViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CetagoryViewholder holder, int position) {
        CetagoryModels catModel=cetagoryModels.get(position);

        holder.name.setText(catModel.getCetagoryname());

        Glide.with(context).load(catModel.getCetagoryImg()).into(holder.img);

        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, ContenerActivity.class);
            intent.putExtra("details",true);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return cetagoryModels.size();
    }
}
