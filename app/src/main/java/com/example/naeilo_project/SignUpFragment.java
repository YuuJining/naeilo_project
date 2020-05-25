package com.example.naeilo_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignUpFragment extends Fragment {

    ViewGroup rootview;
    Button sign_up_ok_btn;
    Button sign_up_cancle_btn;
    Context mycontext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = (ViewGroup) inflater.inflate(R.layout.fragment_sign_up,container,false);

        sign_up_ok_btn = rootview.findViewById(R.id.sign_up_ok_btn);
        sign_up_cancle_btn = rootview.findViewById(R.id.sign_up_cancel_btn);

        sign_up_cancle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((LoginActivity)getActivity()).replaceFragment(new LoginIntroFragment());
            }
        });

        sign_up_ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mycontext,"회원가입이 완료되었습니다!", Toast.LENGTH_SHORT).show();

                ((LoginActivity)getActivity()).replaceFragment(new LoginIntroFragment());

            }
        });


        return rootview;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mycontext = context;

    }
}
