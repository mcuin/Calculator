package com.mykal.memorycalculator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MemoryCalculator extends Activity {
    double x, y, z;
    String text, answer;
    String[] parts;
    int i = 1;

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
                    memoryToast();
                }
            }
        });
        Button downButton = (Button) findViewById(R.id.downButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(i);
                System.out.println(memory.size());
                if (i <= memory.size() || i > 0) {
                    numberField.getEditableText().clear();
                    numberField.setText(memory.get((memory.size() - 2) + (i)));
                    i--;
                } else {
                    memoryToast();
                }
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
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("-")) {
                    parts = text.split("\\-");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    sub(x, y);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("*")) {
                    parts = text.split("\\*");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    mult(x, y);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("/")) {
                    parts = text.split(("/"));
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    div(x, y);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("\u221a")) {
                    parts = text.split("\\u221a");
                    x = Double.parseDouble(parts[1]);
                    sqRoot(x);
                    memory.add(answer);
                    numberField.getEditableText().clear();
                    numberField.getEditableText().append(answer);
                } else if (text.contains("^")) {
                    parts = text.split("\\^");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    square(x, y);
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
        Button sqRootButton = (Button) findViewById(R.id.sqRootButton);
        sqRootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().insert(0, "\u221a");
            }
        });
        Button sqButton = (Button) findViewById(R.id.squareButton);
        sqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.getEditableText().append("^");
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    public String add(double a, double b) {

        z = a + b;

        decimalCheck(z);

        return answer;
    }

    public String sub(double a, double b) {

        z = a - b;

        decimalCheck(z);

        return answer;
    }

    public String mult(double a, double b) {

        z = a * b;

        decimalCheck(z);

        return answer;
    }

    public String div(double a, double b) {

        z = a / b;

        decimalCheck(z);

        return answer;
    }

    public String sqRoot(double a) {

        z = Math.sqrt(a);

        decimalCheck(z);

        return answer;
    }

    public String square(double a, double b) {

        z = Math.pow(a, b);

        decimalCheck(z);

        return answer;
    }

    public String decimalCheck(double a) {

        answer = Double.toString(a);
        parts = answer.split("\\.");
        if (parts[1].equals("0")) {
            answer = parts[0];
        }

        return answer;
    }

    public void memoryToast() {
        Context context = getApplicationContext();
        CharSequence toastText = "No numbers in memory.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }
}
