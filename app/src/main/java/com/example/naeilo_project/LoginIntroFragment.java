package com.example.naeilo_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginIntroFragment extends Fragment {

    ViewGroup rootview;
    Button sign_up;
    Button kakao_login;
    Button login;
    Context mycontext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = (ViewGroup) inflater.inflate(R.layout.fragment_login_intro,container,false);

        sign_up = rootview.findViewById(R.id.sign_up_btn);
        login = rootview.findViewById(R.id.login_btn);
        kakao_login = rootview.findViewById(R.id.kakao_login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mycontext,MainActivity.class);
                startActivity(intent);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LoginActivity)getActivity()).replaceFragment(new SignUpFragment());
            }
        });

        return rootview;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        mycontext = context;
        super.onAttach(context);
    }
}
