package com.example.alamin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CalculatorService calService;
    TextView textView;
    private Button oNe, tWo, tHree, fOur, fIve, sIx, sEven, eIght, nIne, zEro, dOt; //all digits declare here
    private Button add, subtract, multiply, divide, percent, sqrt, sqr, eQual; // all signs declare here
    private Button log, currency, scientific, numberC, clr; //other layouts declare here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView(); //calling method

        //implements all digits below
        zEro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + zEro.getText().toString());
            }
        });
        oNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + oNe.getText().toString());
            }
        });
        tWo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + tWo.getText().toString());
            }
        });
        tHree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + tHree.getText().toString());
            }
        });
        fOur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + fOur.getText().toString());
            }
        });
        fIve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + fIve.getText().toString());
            }
        });
        sIx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + sIx.getText().toString());
            }
        });
        sEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + sEven.getText().toString());
            }
        });
        eIght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + eIght.getText().toString());
            }
        });
        nIne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + nIne.getText().toString());
            }
        });
        dOt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + dOt.getText().toString());
            }
        });

        //implement all signs here
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + add.getText().toString());
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + subtract.getText().toString());
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + multiply.getText().toString());
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + divide.getText().toString());
            }
        });

        //functional buttons implementation
        eQual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //i will write code later
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //i will write code later
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //i will write code later
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //i will write code later
            }
        });

        //other activities button implementation
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, LogarithmActivity.class);
                startActivity(intent);
            }
        });
        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ScientificActivity.class);
                startActivity(intent);
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CurrencyActivity.class);
                startActivity(intent);
            }
        });
        numberC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, NumberConvert.class);
                startActivity(intent);
            }
        });
    }

    private void setupUIView(){

        textView= findViewById(R.id.display);

        //all digits initialize here
        //oNe, tWo, tHree, fOur, fIve, sIx, sEven, eIght, nIne, zEro, dOt
        oNe= findViewById(R.id.one);
        tWo= findViewById(R.id.two);
        tHree= findViewById(R.id.three);
        fOur= findViewById(R.id.four);
        fIve= findViewById(R.id.five);
        sIx= findViewById(R.id.six);
        sEven= findViewById(R.id.seven);
        eIght= findViewById(R.id.eight);
        nIne= findViewById(R.id.nine);
        zEro= findViewById(R.id.zero);
        dOt= findViewById(R.id.dot);

        //all signs initialize here
        //add, subtract, multiply, divide, percent, sqrt, sqr, eQual, clr
        add= findViewById(R.id.add);
        subtract= findViewById(R.id.subtract);
        multiply= findViewById(R.id.multiply);
        divide= findViewById(R.id.division);
        percent= findViewById(R.id.percent);
        sqrt= findViewById(R.id.sqrt);
        sqr= findViewById(R.id.sqr);
        eQual= findViewById(R.id.equal);
        clr= findViewById(R.id.clr);

        //other layouts initialize here
        //log, currency, scientific, numberC
        log= findViewById(R.id.log);
        scientific= findViewById(R.id.science);
        currency= findViewById(R.id.currency);
        numberC= findViewById(R.id.number);
    }

}
