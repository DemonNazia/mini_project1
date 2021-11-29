package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dev_ops extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_ops2);
        b1 = findViewById(R.id.button14);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newe = new Intent(Dev_ops.this,Tech.class);
                startActivity(newe);
                finish();
            }
        });
    }
}