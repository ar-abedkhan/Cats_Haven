package com.abedkhan.catsshaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.abedkhan.catsshaven.Fragment.FavouriteFragment;
import com.abedkhan.catsshaven.Fragment.HomeFragment;
import com.abedkhan.catsshaven.Fragment.ProfileFragment;
import com.abedkhan.catsshaven.Fragment.ToDoFragment;
import com.abedkhan.catsshaven.databinding.ActivityMainBinding;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import io.ak1.BubbleTabBar;
import io.ak1.OnBubbleClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
SmoothBottomBar smoothBottomBar;
BubbleTabBar bubbleTabBar;
MeowBottomNavigation meowBottomNavigation;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

     //   smoothBottomBar=findViewById(R.id.bottomBar);
      //  bubbleTabBar=findViewById(R.id.bubblevar);

     //   getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();







bottomMeowMenu();







    }


    private void bottomMeowMenu() {

        meowBottomNavigation=findViewById(R.id.meowBottomNavigation);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_list_alt_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_favorite_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_person_24));

        meowBottomNavigation.show(1,true);


        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();

       // replace(new HomeFragment(), false);


        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {


                    switch (model.getId()) {
                        case 1:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
                            Log.i("tag", "clicked: " + 0);
                            break;

                        case 2:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ToDoFragment()).commit();
                            Log.i("tag", "clicked: " + 1);

                            break;

                        case 3:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FavouriteFragment()).commit();
                            Log.i("tag", "clicked: " + 2);

                            break;

                        case 4:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFragment()).commit();
                            Log.i("tag", "clicked: " + 2);

                            break;
                    }
                return null;
            }
        });


    }

}