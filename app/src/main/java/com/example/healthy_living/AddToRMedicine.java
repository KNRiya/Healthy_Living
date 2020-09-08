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

public class AddToRMedicine extends AppCompatActivity {
private Button rSaveButton, rLoadButton;
private EditText rMNameEditText, rNoteEditText;
DatabaseReference rDatabaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_r_medicine);

        rDatabaseReference= FirebaseDatabase.getInstance().getReference("rMedicine");
        rSaveButton=findViewById(R.id.rSaveButtonId);
        rLoadButton=findViewById(R.id.rLoadButtonId);
        rMNameEditText=findViewById(R.id.rMNameEditTextid);
        rNoteEditText=findViewById(R.id.rNoteEditTextId);

        rLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AddToRMedicine.this,ResistantMedicines.class);
                startActivity(intent);
            }
        });


        rSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rSaveData();
            }
        });

    }

   public void rSaveData(){
      String rMName=rMNameEditText.getText().toString().trim();
      String rNote=rNoteEditText.getText().toString().trim();
      String key=rDatabaseReference.push().getKey();
      rMedicine rmedicine=new rMedicine(rMName,rNote);
      rDatabaseReference.child(key).setValue(rmedicine);
       Toast.makeText(getApplicationContext(),"Added Successfully",Toast.LENGTH_LONG).show();
       rMNameEditText.setText("");
       rNoteEditText.setText("");
    }
}