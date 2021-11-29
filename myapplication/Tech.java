package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tech extends AppCompatActivity {

    ImageButton i1,i2,i3,i4,i5;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        b1 = findViewById(R.id.button9);
        i1 = findViewById(R.id.imageButton);
        i2 = findViewById(R.id.imageButton2);
        i3 = findViewById(R.id.imageButton3);
        i4 = findViewById(R.id.imageButton4);
        i5 = findViewById(R.id.imageButton5);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tech.this,CloudComputing.class);
                startActivity(in);
                finish();
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2n = new Intent(Tech.this,CyberSecurity.class);
                startActivity(i2n);
                finish();
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3n = new Intent(Tech.this,DataAnalytics.class);
                startActivity(i3n);
                finish();
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i24n = new Intent(Tech.this,Dev_ops.class);
                startActivity(i24n);
                finish();
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(Tech.this,AIML.class);
                startActivity(in5);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Tech.this,Home.class);
                startActivity(in1);
                finish();
            }
        });


    }
}