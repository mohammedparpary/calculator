package com.testapp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text1 = findViewById(R.id.fnum1);
        EditText text2 = findViewById(R.id.fnum2);
        Button btnPlus = findViewById(R.id.bplus);
        Button btnMinus = findViewById(R.id.bminus);
        Button btnMult = findViewById(R.id.bmult);
        Button btnDiv = findViewById(R.id.bdiv);
        TextView tvResult = findViewById(R.id.result);

        // code of btn plus

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int number1 = Integer.parseInt(text1.getText().toString().trim());
             int number2 = Integer.parseInt(text2.getText().toString().trim());
             int result = number1 + number2;
             tvResult.setText("result is " + result);
            }

            // code of btn minus

        });btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int number1 = Integer.parseInt(text1.getText().toString().trim());
             int number2 = Integer.parseInt(text2.getText().toString().trim());
             int result = number1 - number2;
             tvResult.setText("result is "+ result);
            }

            // code of btn multiplication

        });btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int number1 = Integer.parseInt(text1.getText().toString().trim());
             int number2 = Integer.parseInt(text2.getText().toString().trim());
             int result = number1 * number2;
             tvResult.setText("result is "+ result);
            }

            // code of btn Division

        });btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int number1 = Integer.parseInt(text1.getText().toString().trim());
             int number2 = Integer.parseInt(text2.getText().toString().trim());
             int result = number1 / number2;
             tvResult.setText("result is "+ result);
            }
        });
    }
}