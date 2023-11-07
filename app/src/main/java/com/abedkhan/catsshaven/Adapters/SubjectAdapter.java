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
import com.abedkhan.catsshaven.Models.SubjectModel;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.Viewholders.SubjectViewholder;
import com.bumptech.glide.Glide;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectViewholder> {


    Context context;
    List<SubjectModel> subjectModelList;

    public SubjectAdapter(Context context, List<SubjectModel> subjectModelList) {
        this.context = context;
        this.subjectModelList = subjectModelList;
    }

    @NonNull
    @Override
    public SubjectViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.subject_recycler_design,parent,false);

        return new SubjectViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewholder holder, int position) {

        SubjectModel subjectModel=subjectModelList.get(position);

        holder.name.setText(subjectModel.getSubjectName());
        holder.description.setText(subjectModel.getSubjectDescription());

        Glide.with(context).load(subjectModel.getSubjectImg()).into(holder.image);


        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, ContenerActivity.class);
            intent.putExtra("cat",true);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return subjectModelList.size();
    }
}
