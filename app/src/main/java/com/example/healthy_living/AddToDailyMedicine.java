package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddToDailyMedicine extends AppCompatActivity {
private EditText mNameEditText,timesEditText;
private Button saveDataButton, loadData;
DatabaseReference mDatabaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_daily_medicine);
        timesEditText=findViewById(R.id.timesEditTextId);
        mNameEditText=findViewById(R.id.mNameEditTextid);
        saveDataButton=findViewById(R.id.saveId);
        loadData=findViewById(R.id.loadId);
                                            /*
                                   connect to firebase real time db to get instances of Medicine
                                             */
        mDatabaseReference=FirebaseDatabase.getInstance().getReference("Medicine");
                                                          /* calling saveData Method for saving
                         the Name of each Medicine and time to Firebase Real time Database    */
        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
                        //listener to loadData to open Midicine List Activity
        loadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddToDailyMedicine.this,DailyMedicines.class);
                startActivity(intent);
            }
        });

    }
                                //implementation of saveData method
    public void saveData() {

        String mName=mNameEditText.getText().toString().trim();
        String times=timesEditText.getText().toString().trim();
        String key=mDatabaseReference.push().getKey(); //create a unique key for each instance
        Medicine medicine=new Medicine(mName,times);
                                    //save each instance through the object of model class Medicine
        mDatabaseReference.child(key).setValue(medicine);
                                    // create a toast after after each successful save
        Toast.makeText(getApplicationContext(),"Added Successfully",Toast.LENGTH_LONG).show();
                                //clear input fields after saving data
        mNameEditText.setText("");
        timesEditText.setText("");
    }
}