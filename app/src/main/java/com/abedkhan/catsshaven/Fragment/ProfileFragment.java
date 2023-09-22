package com.abedkhan.catsshaven.Fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentProfileBinding;

import java.util.ArrayList;


public class ProfileFragment<val> extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }
FragmentProfileBinding binding;
    Dialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentProfileBinding.inflate(getLayoutInflater(),container,false);


binding.theme.setOnClickListener(view -> {



        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Select theme");
        builder.setView(R.layout.theme);
        String back;
//        builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
        AlertDialog dialog = builder.create();
        dialog.show();



//
//        switch (themeselect){
//            case 0:
//        }


});






        return binding.getRoot();
    }

}