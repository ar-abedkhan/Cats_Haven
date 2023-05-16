package com.abedkhan.catsshaven;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.abedkhan.catsshaven.Fragment.DetailsFragment;
import com.abedkhan.catsshaven.Fragment.SearchFragment;
import com.abedkhan.catsshaven.databinding.ActivityContenerBinding;

public class ContenerActivity extends AppCompatActivity {
ActivityContenerBinding binding;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityContenerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intent=getIntent();

        if (intent.getBooleanExtra("search", false)){
            replace(new SearchFragment());

        } else if (intent.getBooleanExtra("details",false)) {
            replace(new DetailsFragment());

        }



    }

    private void replace(Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrame, fragment).commit();
    }

}