package com.example.naeilo_project;

import androidx.appcompat.app.AppCompatActivity;

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
}
