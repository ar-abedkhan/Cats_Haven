package com.abedkhan.catsshaven.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.Adapters.CatAdapter;
import com.abedkhan.catsshaven.Adapters.CetagoryAdapter;
import com.abedkhan.catsshaven.Models.CatModel;
import com.abedkhan.catsshaven.Models.CetagoryModels;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentCatBinding;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class CatFragment extends Fragment {

    public CatFragment() {
        // Required empty public constructor
    }
FragmentCatBinding binding;
    ArrayList<SlideModel> imageList;
    List<CatModel> catModels=new ArrayList<>();
    List<CetagoryModels>cetagoryModelsList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCatBinding.inflate(getLayoutInflater(),container,false);



        allBreedsRecycler();
//
        cetagoryRecycler();

        return binding.getRoot();
    }




    private void cetagoryRecycler() {

        cetagoryModelsList.add(new CetagoryModels("Foods",R.drawable.cat));
        cetagoryModelsList.add(new CetagoryModels("Reproduction",R.drawable.cat2));
        cetagoryModelsList.add(new CetagoryModels("Medicine",R.drawable.catimg));
        cetagoryModelsList.add(new CetagoryModels("Dises",R.drawable.catimg2));
        cetagoryModelsList.add(new CetagoryModels("Game",R.drawable.catimg3));
        cetagoryModelsList.add(new CetagoryModels("Take and care ",R.drawable.cat));
        cetagoryModelsList.add(new CetagoryModels("Parsh",R.drawable.cat));

        CetagoryAdapter cetagoryAdapter=new CetagoryAdapter(requireContext(),cetagoryModelsList);
        binding.cetagoryRecycler.setAdapter(cetagoryAdapter);

//        CetagoryAdapter adapter=new CetagoryAdapter(requireContext(),cetagoryModelsList);
//        binding.cetagoryRecycler.setAdapter(adapter);
//




    }

    private void allBreedsRecycler() {


        catModels.add(new CatModel("Deshi grid",R.drawable.cat));
        catModels.add(new CatModel("American parsh",R.drawable.catimg2));
        catModels.add(new CatModel("Parsh",R.drawable.cat2));
        catModels.add(new CatModel("Parsh",R.drawable.catimg));
        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
        catModels.add(new CatModel("Parsh",R.drawable.cat));
        catModels.add(new CatModel("Cross parsh",R.drawable.cat));
        catModels.add(new CatModel("Parsh",R.drawable.catimg2));
        catModels.add(new CatModel("Parsh",R.drawable.cat2));
        catModels.add(new CatModel("Parsh",R.drawable.catimg));
        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
        catModels.add(new CatModel("Parsh",R.drawable.cat));


        CatAdapter adapter=new CatAdapter(getContext(),catModels);
        binding.allBreedsRecycler.setAdapter(adapter);


    }





}