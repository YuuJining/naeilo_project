package com.example.naeilo_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    LoginIntroFragment loginIntroFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginIntroFragment = new LoginIntroFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.login_container,loginIntroFragment).commitAllowingStateLoss();

    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.login_container, fragment).commit();
    }
}
