package com.example.naeilo_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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

        getSupportFragmentManager().beginTransaction().add(R.id.main_layout,homeFragment.newInstance()).commitAllowingStateLoss();

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

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_layout, fragment).commit();
    }
}
