package com.example.naeilo_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class UserInfoFragment extends Fragment {
    ViewGroup viewGroup;
    ImageButton environmentimg;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_user_info,container,false);

        environmentimg = viewGroup.findViewById(R.id.environmentimg);
        environmentimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ((MainActivity)getActivity()).replaceFragment(UserInfoMenuFragment.newInstance());
                UserInfoMenuFragment dialog = new UserInfoMenuFragment();
                dialog.show(getActivity().getSupportFragmentManager(),"tag");
            }
        });
        return viewGroup;
    }
}
