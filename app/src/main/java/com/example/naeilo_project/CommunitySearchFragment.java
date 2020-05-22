package com.example.naeilo_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CommunitySearchFragment extends Fragment {
    ViewGroup viewGroup;
    Button cancelbtn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.activity_community_search, container,false);

        //취소 버튼 클릭시
        cancelbtn = viewGroup.findViewById(R.id.community_search_cancelbtn);
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_layout,
                        new CommunityFragment()).commit();


            }
        });
        return viewGroup;
    }
}
