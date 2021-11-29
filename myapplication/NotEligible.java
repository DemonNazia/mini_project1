package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotEligible extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_eligible);
        b1=(Button) findViewById(R.id.button15);
        b2=(Button) findViewById(R.id.button17);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iuy = new Intent(NotEligible.this,Softskills.class);
                startActivity(iuy);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iuy2 = new Intent(NotEligible.this,Home.class);
                startActivity(iuy2);
                finish();

            }
        });
    }
}