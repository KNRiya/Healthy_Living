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

public class rMAdopter extends ArrayAdapter<rMedicine> {
private Activity context;
private List<rMedicine>rMedicineList;

    public rMAdopter(Activity context, List<rMedicine> rMedicineList) {
        super(context, R.layout.rm_sample_layout, rMedicineList);
        this.context = context;
        this.rMedicineList = rMedicineList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater rLayoutInflater=context.getLayoutInflater();

        View view=rLayoutInflater.inflate(R.layout.rm_sample_layout,null,true);

        rMedicine rmedicine=rMedicineList.get(position);
        TextView t1=view.findViewById(R.id.rMNameTextViewId);
        TextView t2=view.findViewById(R.id.rNoteTextViewId);
        t1.setText(rmedicine.getrMName());
        t2.setText(rmedicine.getrNote());

        return view;
    }
}
