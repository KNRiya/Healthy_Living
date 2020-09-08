package com.example.healthy_living;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MAdopter extends ArrayAdapter<Medicine> {
    private Activity context;
    private List<Medicine>medicineList;

    public MAdopter(Activity context, List<Medicine> medicineList) {
        super(context, R.layout.medicine_sample_layout, medicineList);
        this.context = context;
        this.medicineList = medicineList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater mLayoutInflater= context.getLayoutInflater();
        View view=mLayoutInflater.inflate(R.layout.medicine_sample_layout,null,true);
        Medicine medicine=medicineList.get(position);
        TextView t3=view.findViewById(R.id.mNameTextViewId);
        TextView t4=view.findViewById(R.id.timesTextViewId);
        t3.setText(medicine.getmName());
        t4.setText(medicine.getTimes());

        return view;
    }
}
