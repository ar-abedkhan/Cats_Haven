package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    public SearchFragment() {
        // Required empty public constructor
    }
FragmentSearchBinding binding;










    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentSearchBinding.inflate(getLayoutInflater(),container,false);


        binding.backBtn.setOnClickListener(view -> {


            AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();
            HomeFragment fragment=new HomeFragment();
            Bundle bundle=new Bundle();
            fragment.setArguments(bundle);


            appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).addToBackStack(null).commit();


        });


        return binding.getRoot();
    }
}