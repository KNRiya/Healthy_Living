package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reminders extends AppCompatActivity {
    private Button MedicineTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);
        MedicineTime = (Button) findViewById(R.id.MedicineTime);
        MedicineTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMedicineTime();

            }
        });

        });
    }
    public void openMedicineTime(){


    }
    public void onMedicineTimeBtnClick( View view ){
        //Intent intent = new Intent( this,Info.class);
       // startActivity(intent);

    }
}