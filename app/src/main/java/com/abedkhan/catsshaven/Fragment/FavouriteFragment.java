package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentFavouriteBinding;

public class FavouriteFragment extends Fragment {

    public FavouriteFragment() {
        // Required empty public constructor
    }
FragmentFavouriteBinding binding;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentFavouriteBinding.inflate(getLayoutInflater(),container,false);



        return binding.getRoot();
    }
}