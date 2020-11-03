package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private TextView tv_sub1;
    private TextView tv_sub2;
    private TextView tv_sub3;
    private TextView tv_sub4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub1 = findViewById(R.id.tv_sub1);
        tv_sub2 = findViewById(R.id.tv_sub2);
        tv_sub3 = findViewById(R.id.tv_sub3);
        tv_sub4 = findViewById(R.id.tv_sub4);
        //get intent로 put extra에서 받은걸 가져옴
        Intent intent1 = getIntent();
        String str1 = intent1.getStringExtra("str1");
        String str2 = intent1.getStringExtra("str2");
        String str3 = intent1.getStringExtra("str3");
        String str4 = intent1.getStringExtra("str4");
        //tv_sub에서 최종적으로 쓰게됨
        tv_sub1.setText(str1);
        tv_sub2.setText(str2);
        tv_sub3.setText(str3);
        tv_sub4.setText(str4);
    }
}