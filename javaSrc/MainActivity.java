package com.example.alamin.calculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private CalculatorService calService; //declare object of CalculatorService class
    private TextView textView;
    private EditText editText;
    private Button oNe, tWo, tHree, fOur, fIve, sIx, sEven, eIght, nIne, zEro, dOt; //all digits declare here
    private Button add, subtract, multiply, divide, percent, sqrt, sqr, eQual, clr; // all signs declare here
    private Button log, currency, scientific, numberC; //other layouts declare here
    private boolean isAddClicked, isSubtractClicked, isMultiplyClicked, isDivideClicked, isEqualClicked,
            isSqrClicked, isSqrtClicked, isPercentClicked;
    private double numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calService = new CalculatorService(); //initialize memory for CalculatorService class

        setupUIView(); //implement method to get UI/user interface data, which are coming from activity_main.xml
        //implements all digits below
        zEro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + zEro.getText().toString());
                textView.setText(editText.getText().toString());
                if (editText.getText().toString().equals("0")) {
                    editText.setText(null);
                    textView.setText(null);
                }
            }
        });
        oNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + oNe.getText().toString());
                textView.setText(textView.getText().toString() + oNe.getText().toString());
            }
        });
        tWo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + tWo.getText().toString());
                textView.setText(textView.getText().toString() + tWo.getText().toString());
            }
        });
        tHree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + tHree.getText().toString());
                textView.setText(textView.getText().toString() + tHree.getText().toString());
            }
        });
        fOur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + fOur.getText().toString());
                textView.setText(textView.getText().toString() + fOur.getText().toString());
            }
        });
        fIve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + fIve.getText().toString());
                textView.setText(textView.getText().toString() + fIve.getText().toString());
            }
        });
        sIx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + sIx.getText().toString());
                textView.setText(textView.getText().toString() + sIx.getText().toString());
            }
        });
        sEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + sEven.getText().toString());
                textView.setText(textView.getText().toString() + sEven.getText().toString());
            }
        });
        eIght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + eIght.getText().toString());
                textView.setText(textView.getText().toString() + eIght.getText().toString());

            }
        });
        nIne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();
                editText.setText(editText.getText().toString() + nIne.getText().toString());
                textView.setText(textView.getText().toString() + nIne.getText().toString());
            }
        });
        dOt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isEqualClicked || isSqrtClicked || isSqrClicked || isPercentClicked)
                    clearScreen();

                if (editText.getText().toString().equalsIgnoreCase("")) {
                    editText.setText("0" + dOt.getText().toString());
                    textView.setText(textView.getText().toString() + editText.getText().toString());
                } else if (editText.getText().toString().contains(".")) {
                    dOt.clearComposingText();
                } else {
                    editText.setText(editText.getText().toString() + dOt.getText().toString());
                    textView.setText(textView.getText().toString() + dOt.getText().toString());

                }


            }
        });
        //implement all signs here
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(editText.getText().toString() + add.getText().toString());
                editText.setText(null);

                //select single operator to perform
                isAddClicked = true;
                isDivideClicked = false;
                isSubtractClicked = false;
                isMultiplyClicked = false;

                //disable fuctional buttons
                if (isEqualClicked) {
                    isEqualClicked = false;
                }
                if (isSqrClicked) {
                    isSqrClicked = false;
                }
                if (isSqrtClicked) {
                    isSqrtClicked = false;
                }
                if (isPercentClicked) {
                    isPercentClicked = false;
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(editText.getText().toString() + subtract.getText().toString());
                editText.setText(null);

                //select single operator to perform
                isDivideClicked = false;
                isAddClicked = false;
                isSubtractClicked = true;
                isMultiplyClicked = false;

                //disable fuctional buttons
                if (isEqualClicked) {
                    isEqualClicked = false;
                }
                if (isSqrClicked) {
                    isSqrClicked = false;
                }
                if (isSqrtClicked) {
                    isSqrtClicked = false;
                }
                if (isPercentClicked) {
                    isPercentClicked = false;
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(editText.getText().toString() + multiply.getText().toString());
                editText.setText(null);

                //select single operator to perform
                isDivideClicked = false;
                isAddClicked = false;
                isSubtractClicked = false;
                isMultiplyClicked = true;

                //disable fuctional buttons
                if (isEqualClicked) {
                    isEqualClicked = false;
                }
                if (isSqrClicked) {
                    isSqrClicked = false;
                }
                if (isSqrtClicked) {
                    isSqrtClicked = false;
                }
                if (isPercentClicked) {
                    isPercentClicked = false;
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(editText.getText().toString() + divide.getText().toString());
                editText.setText(null);

                //select single operator to perform
                isDivideClicked = true;
                isAddClicked = false;
                isSubtractClicked = false;
                isMultiplyClicked = false;

                //disable fuctional buttons
                if (isEqualClicked) {
                    isEqualClicked = false;
                }
                if (isSqrClicked) {
                    isSqrClicked = false;
                }
                if (isSqrtClicked) {
                    isSqrtClicked = false;
                }
                if (isPercentClicked) {
                    isPercentClicked = false;
                }
            }
        });
        //functional buttons implementation
        eQual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberB = 0.0;
                } else {
                    numberB = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                } //convert number type string to double
                if (isAddClicked) {
                    editText.setText(calService.calculateAddition(numberA, numberB)); //show result on screen
                    isAddClicked = false;
                } else if (isSubtractClicked) {
                    editText.setText(calService.calculateSubtraction(numberA, numberB)); //show result on screen
                    isSubtractClicked = false;
                } else if (isMultiplyClicked) {
                    editText.setText(calService.calculateMultiplication(numberA, numberB)); //show result on screen
                    isMultiplyClicked = false;
                } else if (isDivideClicked) {
                    editText.setText(calService.calculateDivision(numberA, numberB)); //show result on screen
                } else {
                    editText.setText(textView.getText().toString());
                    textView.setText(editText.getText().toString() + eQual.getText().toString());
                }
                isEqualClicked = true;
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearScreen();
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText("\u221A" + String.valueOf(numberA));
                editText.setText(calService.calculateSqrt(numberA));
                isSqrtClicked = true;
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(String.valueOf(numberA) + "\u00B2");
                editText.setText(calService.calculateSqr(numberA));
                isSqrClicked = true;
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equalsIgnoreCase("")) {
                    numberA = 0.0;
                } else {
                    numberA = Double.parseDouble(editText.getText().toString()); //convert number type string to double
                }
                textView.setText(String.valueOf(numberA) + "%");
                editText.setText(calService.calculatePercent(numberA));
                isPercentClicked = true;
            }
        });

        //other activities button implementation
        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScientificActivity.class);
                startActivity(intent);
            }
        });
        numberC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NumberConvert.class);
                startActivity(intent);
            }
        });
    }

    private void setupUIView() { //getting user data by implementing xml properties

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        //all digits initialize here
        //oNe, tWo, tHree, fOur, fIve, sIx, sEven, eIght, nIne, zEro, dOt
        oNe = findViewById(R.id.one);
        tWo = findViewById(R.id.two);
        tHree = findViewById(R.id.three);
        fOur = findViewById(R.id.four);
        fIve = findViewById(R.id.five);
        sIx = findViewById(R.id.six);
        sEven = findViewById(R.id.seven);
        eIght = findViewById(R.id.eight);
        nIne = findViewById(R.id.nine);
        zEro = findViewById(R.id.zero);
        dOt = findViewById(R.id.dot);

        //all signs initialize here
        //add, subtract, multiply, divide, percent, sqrt, sqr, eQual, clr
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.division);
        percent = findViewById(R.id.percent);
        sqrt = findViewById(R.id.sqrt);
        sqr = findViewById(R.id.sqr);
        eQual = findViewById(R.id.equal);
        clr = findViewById(R.id.clr);

        //other layouts initialize here
        //log, currency, scientific, numberC
        log = findViewById(R.id.log);
        scientific = findViewById(R.id.science);
        currency = findViewById(R.id.currency);
        numberC = findViewById(R.id.number);
    }

    private void clearScreen() {
        numberA = 0.0;
        numberB = 0.0;
        isAddClicked = false;
        isSubtractClicked = false;
        isMultiplyClicked = false;
        isDivideClicked = false;
        isEqualClicked = false;
        isSqrClicked = false;
        isSqrtClicked = false;
        isPercentClicked = false;
        textView.setText(null);
        editText.setText(null);
    }
}
