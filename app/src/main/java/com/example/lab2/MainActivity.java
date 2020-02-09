package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
//        Log.i("Info","Button pressed");
        EditText myTextField = (EditText) findViewById(R.id.SearchText);
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
//    String str = myTextField.getText().toString();
//    goToActivity2(str);
        String s = myTextField.getText().toString();
        Double i = Double.parseDouble(s);
        Double result = i*.77;
        goToActivity2(result);
    }

    public void goToActivity2(Double a) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", a);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
