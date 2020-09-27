package com.example.healthy_living;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    private Button submit;
     private EditText edtTxtFullName,edtTxtAge , edtTxtDoctorName , edtTxtDate , edtTxtPhone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        submit = (Button) findViewById(R.id.submit);
        edtTxtFullName = findViewById(R.id.edtTxtFullName);
        edtTxtAge = findViewById(R.id.edtTxtAge);
        edtTxtDoctorName = findViewById(R.id.etdTxtDoctorName);
        edtTxtDate = findViewById(R.id.edtTxtDate);
        edtTxtPhone = findViewById(R.id.edtTxtPhone);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveData();

            }
        });
    }


    public void saveData(){

         String FullName = edtTxtFullName.getText().toString().trim();
         String Age = edtTxtAge.getText().toString().trim();
         String DoctorName = edtTxtDoctorName.getText().toString().trim();
         String Date = edtTxtDate.getText().toString().trim();
         String Phone = edtTxtPhone.getText().toString().trim();

     }
    public void onSubmitBtnClick( View view ){

        /*TextView txtFullName = findViewById(R.id.txtFullName);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtDoctorName = findViewById(R.id.txtDoctorName);
        TextView txtDate = findViewById(R.id.txtDate);
        TextView txtPhone = findViewById(R.id.txtPhone);*/

        EditText edtTxtFullName = findViewById(R.id.edtTxtFullName);
        EditText edtTxtAge = findViewById(R.id.edtTxtAge);
        EditText edtTxtDoctorName = findViewById(R.id.etdTxtDoctorName);
        EditText edtTxtDate = findViewById(R.id.edtTxtDate);
        EditText edtTxtPhone = findViewById(R.id.edtTxtPhone);

        /*txtFullName.setText(" Your Name  is :  " + edtTxtFullName.getText().toString());
        txtAge.setText(" Your Name  is :  " + edtTxtAge.getText().toString());
        txtDoctorName.setText(" Your Name  is :  " + edtTxtDoctorName.getText().toString());
        txtDate.setText(" Your Name  is :  " + edtTxtDate.getText().toString());
        txtPhone.setText(" Your Name  is :  " + edtTxtPhone.getText().toString());*/





    }
}