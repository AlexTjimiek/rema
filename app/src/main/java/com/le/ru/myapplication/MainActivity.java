package com.le.ru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btn1;
    TextView btn2;
    TextView btn3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn1 = (TextView) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (TextView) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (TextView) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

    }
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.btn1:
                       Intent intent = new Intent(this, Activity2.class);
                        startActivity(intent);
                        //btn1.setText("нопка 1");
                        break;
                    case R.id.btn2:
                        btn2.setText("нопка 2");
                        break;
                    case R.id.btn3:
                        btn1.setText("");
                        btn2.setText("");
                        break;
                }
            }
        };






