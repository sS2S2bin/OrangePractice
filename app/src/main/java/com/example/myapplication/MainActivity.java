package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_id;
    private Button btn_test;
    EditText et_ans;
    private EditText et_test1;
    private EditText et_test2;
    private EditText et_test3;
    private EditText et_test4;
    private String str1;
    private String str2;
    private String str3;
    private String str4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test1 = findViewById(R.id.et_test1);
        et_test2 = findViewById(R.id.et_test2);
        et_test3 = findViewById(R.id.et_test3);
        et_test4 = findViewById(R.id.et_test4);

        str1 = et_test1.getText().toString();
        str2 = et_test2.getText().toString();
        str3 = et_test3.getText().toString();
        str4 = et_test4.getText().toString();

        btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, SubActivity.class);
                intent1.putExtra("str1",str1); //다음엑티비티에서 별명을 이용해서 받아옴, 실제로 돌아가는 데이터
                intent1.putExtra("str2",str2);
                intent1.putExtra("str3",str3);
                intent1.putExtra("str4",str4);
                startActivity(intent1); //액티비티 이동
            }
        });
    }
}