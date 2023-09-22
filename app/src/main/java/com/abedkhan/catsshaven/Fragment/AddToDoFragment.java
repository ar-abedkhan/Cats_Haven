package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.Models.ToDoModel;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentAddToDoBinding;

import java.util.ArrayList;
import java.util.List;

public class AddToDoFragment extends Fragment {

    public AddToDoFragment() {
    }
FragmentAddToDoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentAddToDoBinding.inflate(getLayoutInflater(),container,false);



        return binding.getRoot();
    }
}