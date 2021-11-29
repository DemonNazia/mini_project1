package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eligible extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligible);
        b1=(Button)findViewById(R.id.button16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(Eligible.this,Tech.class);
                startActivity(inte);
                finish();
            }
        });

    }
}