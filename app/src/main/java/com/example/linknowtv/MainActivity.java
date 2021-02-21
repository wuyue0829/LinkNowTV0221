package com.example.linknowtv;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView key_1;
    private TextView key_2;
    private TextView key_3;
    private TextView key_4;
    private TextView key_5;
    private TextView key_6;
    private TextView key_7;
    private TextView key_8;
    private TextView key_9;
    private TextView key_shanchu;
    private TextView key_0;
    private TextView key_ok;
    private TextView tv_code;
    private StringBuffer stringBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }


    private void initView(){
        key_1 = findViewById(R.id.num_1);
        key_2 = findViewById(R.id.num_2);
        key_3 = findViewById(R.id.num_3);
        key_4 = findViewById(R.id.num_4);
        key_5 = findViewById(R.id.num_5);
        key_6 = findViewById(R.id.num_6);
        key_7 = findViewById(R.id.num_7);
        key_8 = findViewById(R.id.num_8);
        key_9 = findViewById(R.id.num_9);
        key_shanchu = findViewById(R.id.num_shanchu);
        key_0 = findViewById(R.id.num_0);
        key_ok = findViewById(R.id.num_ok);
        tv_code = findViewById(R.id.tv_code);
        stringBuffer = new StringBuffer();
    }

    private void initData(){
        key_5.requestFocus();
        key_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(1);
                tv_code.setText(stringBuffer);
            }
        });

        key_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(2);
                tv_code.setText(stringBuffer);
            }
        });

        key_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(3);
                tv_code.setText(stringBuffer);
            }
        });

        key_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(4);
                tv_code.setText(stringBuffer);
            }
        });

        key_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(5);
                tv_code.setText(stringBuffer);
            }
        });

        key_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(6);
                tv_code.setText(stringBuffer);
            }
        });

        key_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(7);
                tv_code.setText(stringBuffer);
            }
        });

        key_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(8);
                tv_code.setText(stringBuffer);
            }
        });

        key_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(9);
                tv_code.setText(stringBuffer);
            }
        });

        key_shanchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.deleteCharAt(stringBuffer.length()-1);
                tv_code.setText(stringBuffer);
            }
        });

        key_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringBuffer.append(0);
                tv_code.setText(stringBuffer);
            }
        });

        key_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Tag","会议ID是"+ stringBuffer.toString());
            }
        });


    }


}