package com.mykal.memorycalculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MemoryCalculator extends Activity {
    double x, y, z;
    TextView textView;
    Button addButton, subButton, multButton, divButton, equalsButtons, decimalButton, openParaButton, closeParaButton;
    Button nineButton, eightButton, sevenButton, sixButton, fiveButton, fourButton, threeButton, twoButton, oneButton;
    Button clearButton, upButton, downButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_calculator);

        textView.findViewById(R.id.number_field);
        clearButton.findViewById(R.id.clearButton);
        upButton.findViewById(R.id.upButton);
        downButton.findViewById(R.id.downButton);
        addButton.findViewById(R.id.abbButton);
        subButton.findViewById(R.id.subtractButton);
        multButton.findViewById(R.id.multiplyButton);
        divButton.findViewById(R.id.divideButton);
        equalsButtons.findViewById(R.id.equalsButton);
        decimalButton.findViewById(R.id.decimalButton);
        openParaButton.findViewById(R.id.openParenthesisButton);
        closeParaButton.findViewById(R.id.closeParenthesisButton);
        nineButton.findViewById(R.id.nineButton);
        eightButton.findViewById(R.id.eightButton);
        sevenButton.findViewById(R.id.sevenButton);
        sixButton.findViewById(R.id.sixButton);
        fiveButton.findViewById(R.id.fiveButton);
        fourButton.findViewById(R.id.fourButton);
        threeButton.findViewById(R.id.threeButton);
        twoButton.findViewById(R.id.twoButton);
        oneButton.findViewById(R.id.oneButton);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memory_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }


    public double add(double a, double b) {
        x = a;
        y = b;

        z = x + y;

        return z;
    }

    public double sub(double a, double b) {
        x = a;
        y = b;

        z = a - b;

        return z;
    }

    public double mult(double a, double b) {
        x = a;
        y = b;

        z = a * b;

        return z;
    }

    public double div(double a, double b) {
        x = a;
        y = b;

        z = a / b;

        return z;
    }
}
