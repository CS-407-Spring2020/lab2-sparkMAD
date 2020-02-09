package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2= (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
//        String s = textView2.getText().toString();
//        Double result = Double.parseDouble(s);
//        Double result = i*.77;
        Double str = intent.getDoubleExtra("message", 0);
        textView2.setText("Pounds: " + str);

    }
}
