package com.example.naeilo_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager2 mainViewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        mainViewpager=findViewById(R.id.main_viewpager);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home: {
                        mainViewpager.setCurrentItem(0);
                        return true;
                    }
                    case R.id.community: {
                        mainViewpager.setCurrentItem(1);
                        return true;
                    }
                    case R.id.userInfo: {
                        mainViewpager.setCurrentItem(2);
                        return true;
                    }
                    default:
                        return false;
                }
            }
        });
    }
}
