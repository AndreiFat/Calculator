package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView show_result = findViewById(R.id.viewResults);

        float receivedSum = getIntent().getFloatExtra("result",0);
        show_result.setText("Show results: "+receivedSum);
    }
    public void onClickSendNumbers(View view){
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        Intent intentToCalculate = new Intent(this, Calculate.class);

        intentToCalculate.putExtra("number1", number1.getText().toString());
        intentToCalculate.putExtra("number2", number2.getText().toString());
        startActivity(intentToCalculate);

    }
}