package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appoinments extends AppCompatActivity {
    private Button Dermatology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoinments);
        Dermatology = (Button) findViewById(R.id.Dermatology);
        Dermatology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDermatology();

            }
        });
    }
    public void openDermatology(){
        //Intent intent = new Intent( this,Info.class);
       // startActivity(intent);
    }
    public void onDermatologyBtnClick( View view ){
        Intent intent = new Intent( this,Info.class);
        startActivity(intent);

    }
    }
