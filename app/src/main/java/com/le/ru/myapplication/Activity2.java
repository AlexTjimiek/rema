package com.le.ru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    FrameLayout btnb;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

       btnb = (FrameLayout) findViewById(R.id.btnb);
        btnb.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnb:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                //btn1.setText("нопка 1");
                break;

        }
    }
};