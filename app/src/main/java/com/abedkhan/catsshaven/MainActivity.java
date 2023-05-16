package com.abedkhan.catsshaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.abedkhan.catsshaven.Fragment.FavouriteFragment;
import com.abedkhan.catsshaven.Fragment.HomeFragment;
import com.abedkhan.catsshaven.Fragment.ProfileFragment;
import com.abedkhan.catsshaven.databinding.ActivityMainBinding;

import io.ak1.BubbleTabBar;
import io.ak1.OnBubbleClickListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
SmoothBottomBar smoothBottomBar;
BubbleTabBar bubbleTabBar;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

     //   smoothBottomBar=findViewById(R.id.bottomBar);
        bubbleTabBar=findViewById(R.id.bubblevar);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();

bubbleTabBar.addBubbleListener(new OnBubbleClickListener() {
    @Override
    public void onBubbleClick(int i) {



                    switch (i) {
                        case R.id.home:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
                            Log.i("tag", "clicked: " + 0);
                            break;

                        case R.id.favourite:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FavouriteFragment()).commit();
                            Log.i("tag", "clicked: " + 1);

                            break;

//                        case R.id.settings:
//                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SettingsFragment()).commit();
//                            Log.i("tag", "clicked: " + 2);
//
//                            break;

                        case R.id.profile:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFragment()).commit();
                            Log.i("tag", "clicked: " + 2);

                            break;
                    }

    }
});


    }
}