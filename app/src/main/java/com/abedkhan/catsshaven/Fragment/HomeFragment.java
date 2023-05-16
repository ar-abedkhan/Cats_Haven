package com.abedkhan.catsshaven.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.abedkhan.catsshaven.Adapters.CatAdapter;
import com.abedkhan.catsshaven.Adapters.CetagoryAdapter;
import com.abedkhan.catsshaven.ContenerActivity;
import com.abedkhan.catsshaven.Models.CatModel;
import com.abedkhan.catsshaven.Models.CetagoryModels;
import com.abedkhan.catsshaven.R;
import com.abedkhan.catsshaven.databinding.FragmentHomeBinding;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import io.ak1.BubbleTabBar;
import io.ak1.OnBubbleClickListener;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }
FragmentHomeBinding binding;
    ArrayList<SlideModel> imageList;
    List<CatModel> catModels=new ArrayList<>();
    List<CetagoryModels>cetagoryModelsList=new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding=FragmentHomeBinding.inflate(getLayoutInflater(),container,false);












        onClickSetup();

        sliderSetup();

        allBreedsRecycler();

        cetagoryRecycler();















        return binding.getRoot();
    }

    private void onClickSetup() {





        binding.search.setOnClickListener(view -> {

            Intent intent=new Intent(getContext(), ContenerActivity.class);
            intent.putExtra("search",true);
            getContext().startActivity(intent);

//            AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();
//            SearchFragment fragment=new SearchFragment();
//            Bundle bundle=new Bundle();
//            fragment.setArguments(bundle);
//
//
//            appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).addToBackStack(null).commit();


        });


        binding.txt.setOnClickListener(view -> {


            Intent intent=new Intent(getContext(), ContenerActivity.class);
            intent.putExtra("details",true);
            getContext().startActivity(intent);

        });




    }

    private void sliderSetup() {


        imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.cat,"Cat", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.cat2,"All Food", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.catimg,"Night", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.catimg2,"Burger", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.catimg3,"Mars", ScaleTypes.CENTER_CROP));


        binding.imgSlider.setImageList(imageList);


    }

    private void cetagoryRecycler() {

        cetagoryModelsList.add(new CetagoryModels("Foods",R.drawable.cat));
        cetagoryModelsList.add(new CetagoryModels("Reproduction",R.drawable.cat2));
        cetagoryModelsList.add(new CetagoryModels("Medicine",R.drawable.catimg));
        cetagoryModelsList.add(new CetagoryModels("Dises",R.drawable.catimg2));
        cetagoryModelsList.add(new CetagoryModels("Game",R.drawable.catimg3));
        cetagoryModelsList.add(new CetagoryModels("Take and care ",R.drawable.cat));
        cetagoryModelsList.add(new CetagoryModels("Parsh",R.drawable.cat));


        CetagoryAdapter adapter=new CetagoryAdapter(requireContext(),cetagoryModelsList);
        binding.cetagoryRecycler.setAdapter(adapter);





    }

    private void allBreedsRecycler() {


        catModels.add(new CatModel("Parsh",R.drawable.cat));
        catModels.add(new CatModel("Parsh",R.drawable.catimg2));
        catModels.add(new CatModel("Parsh",R.drawable.cat2));
        catModels.add(new CatModel("Parsh",R.drawable.catimg));
        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
        catModels.add(new CatModel("Parsh",R.drawable.cat));
        catModels.add(new CatModel("Parsh",R.drawable.cat));
        catModels.add(new CatModel("Parsh",R.drawable.catimg2));
        catModels.add(new CatModel("Parsh",R.drawable.cat2));
        catModels.add(new CatModel("Parsh",R.drawable.catimg));
        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
        catModels.add(new CatModel("Parsh",R.drawable.cat));


        CatAdapter adapter=new CatAdapter(getContext(),catModels);
        binding.allBreedsRecycler.setAdapter(adapter);


    }



}