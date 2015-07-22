package com.mykal.memorycalculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MemoryCalculator extends Activity {
    double x, y, z;
    String text, answer;
    String[] parts;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_calculator);

        final ArrayList<String> memory = new ArrayList<>();

        final EditText numberField = (EditText) findViewById(R.id.number_field);
        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().clear();
            }
        });
        Button upButton = (Button) findViewById(R.id.upButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < memory.size()) {
                    numberField.getEditableText().clear();
                    numberField.setText(memory.get((memory.size() - 1) - (i)));
                    i++;
                } else {
                    return;
                }
            }
        });
        Button downButton = (Button) findViewById(R.id.downButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().clear();
                //numberField.getEditableText().append(memory.get(i.size()));
            }
        });
        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("+");
            }
        });
        Button subButton = (Button) findViewById(R.id.subtractButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("-");
            }
        });
        Button multButton = (Button) findViewById(R.id.multiplyButton);
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("*");
            }
        });
        Button divButton = (Button) findViewById(R.id.divideButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("/");
            }
        });
        Button equalsButtons = (Button) findViewById(R.id.equalsButton);
        equalsButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = numberField.getText().toString();
                if (text.contains("+")) {
                    parts = text.split("\\+");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    add(x, y);
                    answer = Double.toString(z);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("-")) {
                    parts = text.split("\\-");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    sub(x, y);
                    answer = Double.toString(z);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("*")) {
                    parts = text.split("\\*");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    mult(x, y);
                    answer = Double.toString(z);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("/")) {
                    parts = text.split(("\\/"));
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    div(x, y);
                    answer = Double.toString(z);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                }
            }
        });
        Button decimalButton = (Button) findViewById(R.id.decimalButton);
        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append(".");
            }
        });
        Button openParaButton = (Button) findViewById(R.id.openParenthesisButton);
        openParaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("(");
            }
        });
        Button closeParaButton = (Button) findViewById(R.id.closeParenthesisButton);
        closeParaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append(")");
            }
        });
        Button nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("9");
            }
        });
        Button eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("8");
            }
        });
        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("7");
            }
        });
        Button sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("6");
            }
        });
        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("5");
            }
        });
        Button fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("4");
            }
        });
        Button threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("3");
            }
        });
        Button twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("2");
            }
        });
        Button oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("1");
            }
        });
        Button zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("0");
            }
        });
        Button deleteButton = (Button) findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText().delete(numberField.length() - 1, numberField.length()));
            }
        });
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
