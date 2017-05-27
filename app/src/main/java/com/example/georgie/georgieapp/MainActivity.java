package com.example.georgie.georgieapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btSignIn,btNewUser;
    EditText etUsername,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSignIn = (Button) findViewById(R.id.btSignIn);
        btNewUser = (Button) findViewById(R.id.btNewUser);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);


        btSignIn.setOnClickListener(this);
        btNewUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText etUserName = (EditText) findViewById(R.id.etUsername);
        String strUserName = etUserName.getText().toString();
        etPassword = (EditText) findViewById(R.id.etPassword);
        switch (v.getId()){
            case R.id.btSignIn:
                if(etUserName.getText().toString().isEmpty()) {
                    etUserName.setError("Please fill out this field");
                    return;
                } else if (etPassword.getText().toString().isEmpty()) {
                    etPassword.setError("Please fill out this field");
                    return;
                }else{
                    startActivity(new Intent(this, display.class));
                    break;
                }
            case R.id.btNewUser:
                startActivity(new Intent(this, register.class));
                break;
        }
    }
}
