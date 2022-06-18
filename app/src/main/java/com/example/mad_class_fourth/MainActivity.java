package com.example.mad_class_fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt , edt1 ;
    Button btn , btn1 , btn2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.num1);
        edt1 =findViewById(R.id.num2);
        btn = findViewById(R.id.add);
        btn1 = findViewById(R.id.subtract);
        btn2 = findViewById(R.id.multiply);
        txt = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(edt.getText().toString());
                int number1= Integer.parseInt(edt1.getText().toString());
                int add = addNumbers(number , number1);
                txt.setText(Integer.toString(add));

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(edt.getText().toString());
                int number1= Integer.parseInt(edt1.getText().toString());
                int sub=subtractNumbers(number, number1);
                txt.setText(Integer.toString(sub));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(edt.getText().toString());
                int number1= Integer.parseInt(edt1.getText().toString());
                int multi=multiplyNumbers(number, number1);
                txt.setText(Integer.toString(multi));
            }
        });

    }

    int addNumbers(int a , int b){
        int c = a+b;
        return c;
    }

    int subtractNumbers(int a, int b){
        int bigNumber = 0;
        int smallNumber = 0;
        if(a>b){
            bigNumber =a;
            smallNumber=b;
        }
        else{
            bigNumber =b;
            smallNumber=a;
        }
        return bigNumber - smallNumber;
    }

    int multiplyNumbers(int a, int b){
        int c=a*b;
        return c;
    }
}