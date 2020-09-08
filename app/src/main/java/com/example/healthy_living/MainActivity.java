package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView dailyMedicineCardView,vitalsCardView,remindersCardView,healthHistoryCardView,appoinmentsCardView,resistantMedicineCardView,mapCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dailyMedicineCardView =findViewById(R.id.idDailyMedicine);
        vitalsCardView=findViewById(R.id.idVitals);
        remindersCardView=findViewById(R.id.idReminders);
        healthHistoryCardView=findViewById(R.id.idHealthHistory);
        appoinmentsCardView=findViewById(R.id.idAppoinments);
        resistantMedicineCardView=findViewById(R.id.idRMedicines);
        mapCardView=findViewById(R.id.idLocation);


        dailyMedicineCardView.setOnClickListener(this);
        vitalsCardView.setOnClickListener(this);
        remindersCardView.setOnClickListener(this);
        healthHistoryCardView.setOnClickListener(this);
        appoinmentsCardView.setOnClickListener(this);
        resistantMedicineCardView.setOnClickListener(this);
        mapCardView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
if (v.getId()==R.id.idDailyMedicine)
        {
            Intent intent=new Intent(MainActivity.this,DailyMedicines.class);
            startActivity(intent);
        }
else if(v.getId()==R.id.idVitals)
        {Intent intent=new Intent(MainActivity.this,Vitals.class);
        startActivity(intent);}
else if(v.getId()==R.id.idReminders)
        {    Intent intent=new Intent(MainActivity.this,Reminders.class);
            startActivity(intent);}

else if(v.getId()==R.id.idHealthHistory)
        {    Intent intent=new Intent(MainActivity.this,HealthHistory.class);
            startActivity(intent);}

else if(v.getId()==R.id.idAppoinments)
        {    Intent intent=new Intent(MainActivity.this,Appoinments.class);
            startActivity(intent);}

else if(v.getId()==R.id.idRMedicines)
        {    Intent intent=new Intent(MainActivity.this,ResistantMedicines.class);
            startActivity(intent);}

else if(v.getId()==R.id.idLocation)
        {    Intent intent=new Intent(MainActivity.this,Map.class);
            startActivity(intent);}


    }
}