package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Vitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals);
        final LinearLayout BMI, Diet;
        BMI= findViewById(R.id.bmi);
        Diet= findViewById(R.id.diet);

        BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Vitals.this,BMI.class);
                startActivity(intent);
            }
        });

        Diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Vitals.this, Diet.class);
                startActivity(intent);
            }
        });
    }
}