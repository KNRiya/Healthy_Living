package com.example.healthy_living;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class DailyMedicines extends AppCompatActivity {
   private Button addMedicine, homeButton;
    private ListView mListview;
    DatabaseReference mDatabaseReference;
    private List<Medicine>medicineList;
    private MAdopter mAdopter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_medicines);
        mDatabaseReference= FirebaseDatabase.getInstance().getReference("Medicine");
        mListview=findViewById(R.id.listViewId);
        medicineList=new ArrayList<>();
        addMedicine= findViewById(R.id.addMedicineButtonId);
        homeButton=findViewById(R.id.homeButtonId);
        mAdopter=new MAdopter(DailyMedicines.this,medicineList);



      homeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(DailyMedicines.this,MainActivity.class);
              startActivity(intent);
          }
      });
     addMedicine.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(DailyMedicines.this,AddToDailyMedicine.class);
             startActivity(intent);
         }
     });
    }

    @Override
    protected void onStart() {
        mDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                medicineList.clear();
                for (DataSnapshot dataSnapshot1 : datasnapshot.getChildren())
                {
                    Medicine medicine= dataSnapshot1.getValue(Medicine.class);
                    medicineList.add(medicine);
                }
                mListview.setAdapter(mAdopter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        super.onStart();
    }
}