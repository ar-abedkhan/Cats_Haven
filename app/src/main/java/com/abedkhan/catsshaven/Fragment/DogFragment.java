package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentToDoBinding;

public class DogFragment extends Fragment {

    public DogFragment() {
        // Required empty public constructor
    }
FragmentToDoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentToDoBinding.inflate(getLayoutInflater(),container,false);








        return binding.getRoot();
    }
}