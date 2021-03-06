package com.example.healthy_living;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class ResistantMedicines extends AppCompatActivity {

    private ListView rListview;
private Button rAddMedicineButton,rHomeButton;
DatabaseReference rDatabaseReference;
private List<rMedicine>rMedicineList;
private rMAdopter rmadopter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistant_medicines);


        rDatabaseReference= FirebaseDatabase.getInstance().getReference("rMedicine");
        rListview=findViewById(R.id.rListViewId);
        rHomeButton=findViewById(R.id.rHomeButtonId);
        rAddMedicineButton=findViewById(R.id.rAddMedicineButtonId);
        rMedicineList=new ArrayList<>();
        rmadopter=new rMAdopter(ResistantMedicines.this,rMedicineList);

        rAddMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddToRMedicine();
            }
        });
        rHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResistantMedicines.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openAddToRMedicine(){
        Intent intent=new Intent(this,AddToRMedicine.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        rDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {

                rMedicineList.clear();
                for (DataSnapshot dataSnapshot1 : datasnapshot.getChildren())
                {
                rMedicine rmedicine= dataSnapshot1.getValue(rMedicine.class);
                rMedicineList.add(rmedicine);
                }
                rListview.setAdapter(rmadopter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        super.onStart();
    }
}