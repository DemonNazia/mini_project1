package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        e1 = findViewById(R.id.editTextTextPersonName5);
        e2 = findViewById(R.id.editTextTextPersonName6);
        e3 = findViewById(R.id.editTextTextPersonName7);
        b1 = findViewById(R.id.button8);
        b2 = findViewById(R.id.button7);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iop = new Intent(Form.this,Home.class);
                startActivity(iop);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int c=Integer.parseInt(s3);
                if(a>7 && b>75 && c>11)
                {
                    Toast.makeText(Form.this, "You are eligible", Toast.LENGTH_SHORT).show();
                    Intent inre = new Intent(Form.this,Eligible.class);
                    startActivity(inre);
                    finish();
                }
                else
                {
                    Toast.makeText(Form.this, "You are not eligible", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}