package com.example.naeilo_project;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CommunityFragment extends Fragment {
    ViewGroup viewGroup;
    ImageButton imgbtn1;
    Button score;
    Button order;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_community, container,false);

    //search(#)버튼 클릭시
    imgbtn1 = viewGroup.findViewById(R.id.imgbtn1);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.main_layout,
                        new CommunitySearchFragment()).commit();
            }
        });

        //popup score 필터
        score = viewGroup.findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenuscore = new PopupMenu(viewGroup.getContext(),score);
                popupMenuscore.getMenuInflater().inflate(R.menu.community_filter_score, popupMenuscore.getMenu());
                popupMenuscore.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.all:
                                score.setText("전체");
                                score.setTextColor(Color.BLACK);
                                break;
                            case R.id.score1:
                                score.setText("1점 이상");
                                score.setTextColor(Color.BLACK);
                                break;
                            case R.id.score2:
                                score.setText("2점 이상");
                                score.setTextColor(Color.BLACK);
                                break;
                            case R.id.score3:
                                score.setText("3점 이상");
                                score.setTextColor(Color.BLACK);
                                break;
                            case R.id.score4:
                                score.setText("4점 이상");
                                score.setTextColor(Color.BLACK);
                                break;
                            case R.id.score5:
                                score.setText("5점");
                                score.setTextColor(Color.BLACK);
                                break;
                        }
                        return true;
                    }
                });
                popupMenuscore.show();
            }
        });

        //popup 최신순 필터
        order = viewGroup.findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenuorder = new PopupMenu(viewGroup.getContext(),order);
                popupMenuorder.getMenuInflater().inflate(R.menu.community_filter_order, popupMenuorder.getMenu());
                popupMenuorder.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.recent:
                                order.setText("최신순");
                                break;
                            case R.id.popularity:
                                order.setText("인기순");
                                break;

                        }
                        return true;
                    }
                });
                popupMenuorder.show();
            }
        });
        return viewGroup;
    }
}
