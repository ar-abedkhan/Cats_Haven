package com.abedkhan.catsshaven.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.Adapters.TodoAdapter;
import com.abedkhan.catsshaven.ContenerActivity;
import com.abedkhan.catsshaven.Models.ToDoModel;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentToDoBinding;

import java.util.ArrayList;
import java.util.List;

public class ToDoFragment extends Fragment {

    public ToDoFragment() {
    }
FragmentToDoBinding binding;
    List<ToDoModel> toDoModelList=new ArrayList<>();







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
binding=FragmentToDoBinding.inflate(getLayoutInflater(),container,false);



binding.addTodo.setOnClickListener(view -> {

    Intent intent=new Intent(getContext(), ContenerActivity.class);
    intent.putExtra("addtodo",true);
    getContext().startActivity(intent);
});

binding.backBtn.setOnClickListener(view -> {

    Intent intent=new Intent(getContext(), ContenerActivity.class);
    intent.putExtra("home",true);
    getContext().startActivity(intent);
});


        toDoModelList.add(new ToDoModel("Bath","10:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg));
        toDoModelList.add(new ToDoModel("Flash and ticks","11:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.cat));
        toDoModelList.add(new ToDoModel("Teeth","12:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.cat2));
        toDoModelList.add(new ToDoModel("Bath","01:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg2));


        TodoAdapter adapter=new TodoAdapter(toDoModelList,getContext());
        binding.todoTodayRecycler.setAdapter(adapter);




//
//        toDoModelList.add(new ToDoModel("Bath","10:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg));
//        toDoModelList.add(new ToDoModel("Flash and ticks","11:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.cat));
//        toDoModelList.add(new ToDoModel("Teeth","12:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.cat2));
//        toDoModelList.add(new ToDoModel("Bath","01:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg2));
//        toDoModelList.add(new ToDoModel("Bath","01:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg2));
//        toDoModelList.add(new ToDoModel("Bath","01:22 AM","UnDone",R.drawable.ic_baseline_circle_24,R.drawable.catimg2));
//
//
//        TodoAdapter adapter1=new TodoAdapter(toDoModelList,getContext());
//        binding.todorecyclerview.setAdapter(adapter1);
//
//



        return binding.getRoot();
    }
}