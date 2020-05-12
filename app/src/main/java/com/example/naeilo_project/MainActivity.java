package com.example.naeilo_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment;
    CommunityFragment communityFragment;
    UserInfoFragment userInfoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_navigation);

        homeFragment=new HomeFragment();
        communityFragment=new CommunityFragment();
        userInfoFragment = new UserInfoFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,homeFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,homeFragment).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.community: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,communityFragment).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.userInfo: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,userInfoFragment).commitAllowingStateLoss();
                        return true;
                    }

                    default: return false;
                }
            }
        });
    }
}
