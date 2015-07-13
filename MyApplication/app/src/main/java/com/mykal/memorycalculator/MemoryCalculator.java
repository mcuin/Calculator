package com.mykal.memorycalculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MemoryCalculator extends Activity {
    double x, y, z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_calculator);
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
