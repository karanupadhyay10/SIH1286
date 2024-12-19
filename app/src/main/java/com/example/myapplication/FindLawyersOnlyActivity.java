package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class FindLawyersOnlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_lawyers_only2);


        CardView exit= findViewById(R.id.cardLawyersOnly_ka_Back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( FindLawyersOnlyActivity.this, FindLawyerActivity.class));
            }
        });

        CardView buisnesslawyer = findViewById(R.id.cardBusinessLawyer);
        buisnesslawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FindLawyersOnlyActivity.this,LawyerDetails.class);
                it.putExtra("title","Business Lawyers");
                startActivity(it);
            }
        });

        CardView constitutionallawyer = findViewById(R.id.cardConstitutionalLawyer);
        constitutionallawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FindLawyersOnlyActivity.this,LawyerDetails.class);
                it.putExtra("title","Constitutional Lawyers");
                startActivity(it);
            }
        });
        CardView criminallawyer = findViewById(R.id.cardCriminalLawyer);
        criminallawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FindLawyersOnlyActivity.this,LawyerDetails.class);
                it.putExtra("title","Criminal Lawyers");
                startActivity(it);
            }
        });
        CardView employment_andlabourlawyer = findViewById(R.id.cardEmployment_and_LabourLawyer4);
        employment_andlabourlawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(FindLawyersOnlyActivity.this,LawyerDetails.class);
                it.putExtra("title","Employment and Labour Lawyers");
                startActivity(it);
            }
        });
    }
}