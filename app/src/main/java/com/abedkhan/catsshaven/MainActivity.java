package com.abedkhan.catsshaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.abedkhan.catsshaven.Fragment.HomeFragment;
import com.abedkhan.catsshaven.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());






        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();




    }
}