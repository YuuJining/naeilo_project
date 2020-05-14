package com.example.naeilo_project;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SmartScheduleFragment extends Fragment {

    public static SmartScheduleFragment newInstance() {
        return new SmartScheduleFragment();
    }

    Context mycontext;

    ViewGroup viewGroup;
    DatePickerDialog.OnDateSetListener callbackMethod;
    Button departure_date_button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_smart_schedule, container,false);

        departure_date_button = viewGroup.findViewById(R.id.trip_departure_date);

        departure_date_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(mycontext, callbackMethod, 2020,5,14);
                dialog.show();
            }
        });
        InitializeListner();
        return viewGroup;
    }

    public void InitializeListner() {
        callbackMethod = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                departure_date_button.setText(i+"년 "+(i1+1)+"월 "+i2+"일");
                departure_date_button.setTextColor(Color.BLACK);

            }
        };
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mycontext = context;
    }
}
