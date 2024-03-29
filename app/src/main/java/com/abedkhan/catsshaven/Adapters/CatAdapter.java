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
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.Viewholders.CatViewholder;
import com.bumptech.glide.Glide;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatViewholder> {
    Context context;
    List<CatModel>catModels;

    public CatAdapter(Context context, List<CatModel> catModels) {
        this.context = context;
        this.catModels = catModels;
    }

    @NonNull
    @Override
    public CatViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.breed_recycler_design,parent,false);
        return new CatViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewholder holder, int position) {
    CatModel catModel=catModels.get(position);


        holder.name.setText(catModel.getName());



        Glide.with(context).load(catModel.getImg()).into(holder.img);

        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, ContenerActivity.class);
            intent.putExtra("details",true);
            context.startActivity(intent);
        });




    }

    @Override
    public int getItemCount() {
        return catModels.size();
    }
}
