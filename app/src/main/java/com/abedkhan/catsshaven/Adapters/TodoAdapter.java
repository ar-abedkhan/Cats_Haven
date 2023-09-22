package com.abedkhan.catsshaven.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abedkhan.catsshaven.Models.ToDoModel;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.Viewholders.TodoViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {
    List<ToDoModel> toDoModels;
    Context context;

    public TodoAdapter(List<ToDoModel> toDoModels, Context context) {
        this.toDoModels = toDoModels;
        this.context = context;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.todolistdesign,parent,false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {

        ToDoModel toDoModel=toDoModels.get(position);

try {
    holder.title.setText(toDoModel.todoTitle);
    holder.time.setText(toDoModel.todoTime);
    holder.done.setText(toDoModel.todoStatus);


    Glide.with(context).load(toDoModel.todoImg).into(holder.todoImg);
    Glide.with(context).load(toDoModel.todoPriority).into(holder.pHigh);

}catch (Exception e){

}


    }

    @Override
    public int getItemCount() {
        return toDoModels.size();
    }
}
