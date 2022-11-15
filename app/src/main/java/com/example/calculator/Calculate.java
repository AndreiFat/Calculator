package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        String receivedNumber1 = getIntent().getStringExtra("number1");
        String receivedNumber2 = getIntent().getStringExtra("number2");

        TextView number1View = findViewById(R.id.showNumber1);
        TextView number2View = findViewById(R.id.showNumber2);

        number1View.setText("Number 1: " + receivedNumber1);
        number2View.setText("Number 2: " + receivedNumber2);
    }

    public void onClickSum(View view) {
        Intent intentToMainActivity = new Intent(this, MainActivity.class);
        String receivedNumber1 = getIntent().getStringExtra("number1");
        String receivedNumber2 = getIntent().getStringExtra("number2");

        if (receivedNumber1 != null && receivedNumber2 != null) {
            float sum = Float.parseFloat(receivedNumber1) + Float.parseFloat(receivedNumber2);
            intentToMainActivity.putExtra("result", sum);
            startActivity(intentToMainActivity);
        } else {
            startActivity(intentToMainActivity);
        }
    }

    public void onClickSubstract(View view) {
        Intent intentToMainActivity = new Intent(this, MainActivity.class);

        String receivedNumber1 = getIntent().getStringExtra("number1");
        String receivedNumber2 = getIntent().getStringExtra("number2");

        if (receivedNumber1 != null && receivedNumber2 != null) {
            float subtract = Float.parseFloat(receivedNumber1) - Float.parseFloat(receivedNumber2);
            intentToMainActivity.putExtra("result", subtract);
            startActivity(intentToMainActivity);
        } else {
            startActivity(intentToMainActivity);
        }

    }

    public void onClickMultiply(View view) {
        Intent intentToMainActivity = new Intent(this, MainActivity.class);

        String receivedNumber1 = getIntent().getStringExtra("number1");
        String receivedNumber2 = getIntent().getStringExtra("number2");

        if (receivedNumber1 != null && receivedNumber2 != null) {
            float multiply = Float.parseFloat(receivedNumber1) * Float.parseFloat(receivedNumber2);
            intentToMainActivity.putExtra("result", multiply);
            startActivity(intentToMainActivity);
        } else {
            startActivity(intentToMainActivity);
        }
    }

    public void onClickDivide(View view) {
        Intent intentToMainActivity = new Intent(this, MainActivity.class);

        String receivedNumber1 = getIntent().getStringExtra("number1");
        String receivedNumber2 = getIntent().getStringExtra("number2");

        if (receivedNumber1 != null && receivedNumber2 != null) {
            float divide = Float.parseFloat(receivedNumber1) / Float.parseFloat(receivedNumber2);
            intentToMainActivity.putExtra("result", divide);
            startActivity(intentToMainActivity);
        } else {
            startActivity(intentToMainActivity);
        }
    }
}