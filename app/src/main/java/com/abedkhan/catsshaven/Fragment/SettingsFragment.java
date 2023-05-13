package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentSearchBinding;

public class SettingsFragment extends Fragment {

    public SettingsFragment() {
        // Required empty public constructor
    }
FragmentSearchBinding binding;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentSearchBinding.inflate(getLayoutInflater(),container,false);
















        return binding.getRoot();
    }
}