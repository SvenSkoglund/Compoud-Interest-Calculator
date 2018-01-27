package com.svensapps.compoudintersestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
public EditText principal;
public EditText interestRate;
public EditText compoundsPerYear;
public EditText years;
public Button calculateButton;
public Button clearButton;
public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principal = (EditText) findViewById(R.id.principalText);
        interestRate = (EditText) findViewById(R.id.interestRateText);
        compoundsPerYear = (EditText) findViewById(R.id.compoundsPerYearText);
        years = (EditText) findViewById(R.id.yearsText);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        clearButton = (Button) findViewById(R.id.clearButton);
        result = (TextView)findViewById(R.id.resultText);


    }


    public void calculate (double pricipal, double interestRate, double compoudsPerYear, double years){
        double answer = Math.pow(pricipal*(1+(interestRate/compoudsPerYear)),(compoudsPerYear*years));
        result.setText("Value in " + years + "years = "+answer);
    }
}
