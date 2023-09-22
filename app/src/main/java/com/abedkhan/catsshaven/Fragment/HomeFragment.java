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
import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;
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

//        allBreedsRecycler();
//
//        cetagoryRecycler();
//

        onItemClicked();
















        return binding.getRoot();
    }

    private void onItemClicked() {



//
//        binding.foodSearch.setOnClickListener(view -> {
////            Log.i("TAG", "onCreate:-----------------Main search ");
//
//            AppCompatActivity appCompatActivity = (AppCompatActivity) view.getContext();
//            FoodSearchFragment fragment = new FoodSearchFragment();
//            Bundle bundle = new Bundle();
//            fragment.setArguments(bundle);
//
//            //  appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.contener, fragment).addToBackStack(null).commit();
//            Intent intent = new Intent(MainActivity.this, ContenerActivity.class);
//            intent.putExtra("foodsearch", true);
//            startActivity(intent);
//        });
//
//

    }

    private void onClickSetup() {




//
//        binding.search.setOnClickListener(view -> {
//
//            Intent intent=new Intent(getContext(), ContenerActivity.class);
//            intent.putExtra("search",true);
//            getContext().startActivity(intent);
//
////            AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();
////            SearchFragment fragment=new SearchFragment();
////            Bundle bundle=new Bundle();
////            fragment.setArguments(bundle);
////
////
////            appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).addToBackStack(null).commit();
//
//
//        });
//

        binding.cat.setOnClickListener(view -> {


            Intent intent=new Intent(getContext(), ContenerActivity.class);
            intent.putExtra("cat",true);
            requireActivity().startActivity(intent);

        });
//

        binding.dog.setOnClickListener(view -> {


            Intent intent=new Intent(getContext(), ContenerActivity.class);
            intent.putExtra("dog",true);
            requireActivity().startActivity(intent);

        });
//



    }

    private void sliderSetup() {
     //   ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.cat,"image 1"));
        sliderItems.add(new SliderItem(R.drawable.cat2,"Image 2"));
        sliderItems.add(new SliderItem(R.drawable.catimg,"Image 3"));
        sliderItems.add(new SliderItem(R.drawable.catimg2,"Image 3"));
        sliderItems.add(new SliderItem(R.drawable.catimg3,"Image 3"));
        sliderItems.add(new SliderItem(R.drawable.catimg,"Image 3"));

        binding.smartSlider.setAdapter(new SliderAdapter(sliderItems,binding.smartSlider,5000));

//        new SliderAdapter((position, title, view) -> {
//            Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show();
//        });

//        imageList = new ArrayList<>();
//        imageList.add(new SlideModel(R.drawable.cat, ScaleTypes.CENTER_CROP));
//        imageList.add(new SlideModel(R.drawable.cat2, ScaleTypes.CENTER_CROP));
//        imageList.add(new SlideModel(R.drawable.catimg, ScaleTypes.CENTER_CROP));
//        imageList.add(new SlideModel(R.drawable.catimg2, ScaleTypes.CENTER_CROP));
//        imageList.add(new SlideModel(R.drawable.catimg3,"Mars", ScaleTypes.CENTER_CROP));
//
//
//        binding.imgSlider.setImageList(imageList);


    }

//    private void cetagoryRecycler() {
//
//        cetagoryModelsList.add(new CetagoryModels("Foods",R.drawable.cat));
//        cetagoryModelsList.add(new CetagoryModels("Reproduction",R.drawable.cat2));
//        cetagoryModelsList.add(new CetagoryModels("Medicine",R.drawable.catimg));
//        cetagoryModelsList.add(new CetagoryModels("Dises",R.drawable.catimg2));
//        cetagoryModelsList.add(new CetagoryModels("Game",R.drawable.catimg3));
//        cetagoryModelsList.add(new CetagoryModels("Take and care ",R.drawable.cat));
//        cetagoryModelsList.add(new CetagoryModels("Parsh",R.drawable.cat));
//
//
//        CetagoryAdapter adapter=new CetagoryAdapter(requireContext(),cetagoryModelsList);
//        binding.cetagoryRecycler.setAdapter(adapter);
//
//
//
//
//
//    }
//
//    private void allBreedsRecycler() {
//
//
//        catModels.add(new CatModel("Deshi grid",R.drawable.cat));
//        catModels.add(new CatModel("American parsh",R.drawable.catimg2));
//        catModels.add(new CatModel("Parsh",R.drawable.cat2));
//        catModels.add(new CatModel("Parsh",R.drawable.catimg));
//        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
//        catModels.add(new CatModel("Parsh",R.drawable.cat));
//        catModels.add(new CatModel("Cross parsh",R.drawable.cat));
//        catModels.add(new CatModel("Parsh",R.drawable.catimg2));
//        catModels.add(new CatModel("Parsh",R.drawable.cat2));
//        catModels.add(new CatModel("Parsh",R.drawable.catimg));
//        catModels.add(new CatModel("Parsh",R.drawable.catimg3));
//        catModels.add(new CatModel("Parsh",R.drawable.cat));
//
//
//        CatAdapter adapter=new CatAdapter(getContext(),catModels);
//        binding.allBreedsRecycler.setAdapter(adapter);
//
//
//    }
//


}