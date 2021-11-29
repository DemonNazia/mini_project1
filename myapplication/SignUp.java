package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {


    FirebaseAuth firebaseAuth;
    Button b1,b2;

    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.back);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName3);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName4);
        e2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        firebaseAuth = FirebaseAuth.getInstance();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(SignUp.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString();
                if(s1.isEmpty())
                {
                    e1.setError("fill the username ");
                    return;
                }
                else
                {
                    if(s2.isEmpty())
                    {
                        e2.setError("fill password");
                        return;
                    }
                }
                //p1.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful())
                        {

                            Toast.makeText(SignUp.this,"registration done...",Toast.LENGTH_SHORT).show();
                            //p1.setVisibility(View.INVISIBLE);
                            Intent i = new Intent(SignUp.this,MainActivity.class);
                            startActivity(i);
                            finish();

                        }
                        else
                        {

                            Toast.makeText(SignUp.this,"already exist...",Toast.LENGTH_SHORT).show();
//                            p1.setVisibility(View.INVISIBLE);
                            Intent i1 = new Intent(SignUp.this,MainActivity.class);
                            startActivity(i1);
                            finish();
                        }
                    }
                });
            }
        });
    }
}