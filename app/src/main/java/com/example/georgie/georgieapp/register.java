package com.example.georgie.georgieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener {

    Button btSignUp,btSignIn;
    EditText etFullNames,etAdmNo,etUsername,etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btSignUp = (Button) findViewById(R.id.btSignUp);
        btSignIn = (Button) findViewById(R.id.btSignIn);
        etFullNames = (EditText) findViewById(R.id.etFullNames);
        etAdmNo = (EditText) findViewById(R.id.etAdmNo);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btSignUp.setOnClickListener(this);
        btSignIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSignUp:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btSignIn:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
