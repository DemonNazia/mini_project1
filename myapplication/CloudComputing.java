package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CloudComputing extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_computing);


        b1 = findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newe = new Intent(CloudComputing.this,Tech.class);
                startActivity(newe);
                finish();
            }
        });
    }
}