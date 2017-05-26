package com.example.georgie.georgieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class display extends AppCompatActivity implements View.OnClickListener {

    Button btSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        btSignOut = (Button) findViewById(R.id.btSignOut);

        btSignOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSignOut:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
