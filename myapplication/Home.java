package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    Button b1,b2,b3,b4,b6;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b6 =(Button)findViewById(R.id.Logout);
        firebaseAuth =FirebaseAuth.getInstance();
        b1 =(Button)findViewById(R.id.button2);
        b2 =(Button)findViewById(R.id.button4);
        b3 =(Button)findViewById(R.id.button5);
        b4 =(Button)findViewById(R.id.button6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                Intent k1 = new Intent(Home.this,MainActivity.class);
                startActivity(k1);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Form.class);
                startActivity(i); //check eligibilty
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Home.this, Tech.class);
                startActivity(i1); //trending technology
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Home.this, Softskills.class);
                startActivity(i2); // soft skills
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Home.this, SUbjects.class);
                startActivity(i3); // academics
                finish();
            }
        });
    }
}