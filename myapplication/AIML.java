package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AIML extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiml);
        b1 = findViewById(R.id.button13);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newe = new Intent(AIML.this,Tech.class);
                startActivity(newe);
                finish();
            }
        });
    }
}