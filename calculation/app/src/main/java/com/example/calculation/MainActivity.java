package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input_tv;
    TextView input2;
    Button btn[] = new Button[16];
    int num1 = 0;
    int num2 = 0;
    int a = 0;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        input_tv();
        input2();
    }

    private void init(){
        btn[0] = findViewById(R.id.button0);
        btn[1] = findViewById(R.id.button1);
        btn[2] = findViewById(R.id.button2);
        btn[3] = findViewById(R.id.button3);
        btn[4] = findViewById(R.id.button4);
        btn[5] = findViewById(R.id.button5);
        btn[6] = findViewById(R.id.button6);
        btn[7] = findViewById(R.id.button7);
        btn[8] = findViewById(R.id.button8);
        btn[9] = findViewById(R.id.button9);
        btn[10] = findViewById(R.id.pulsbutton);
        btn[11] = findViewById(R.id.minusbutton);
        btn[12] = findViewById(R.id.Multiplication);
        btn[13] = findViewById(R.id.division);
        btn[14] = findViewById(R.id.buttonC);
        btn[15] = findViewById(R.id.result);
        input_tv = findViewById(R.id.input_tv);
        input2 = findViewById(R.id.input2);
    }

    private void input_tv() {
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "0");
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "1");
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "2");
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "3");
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "4");
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "5");
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "6");
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "7");
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "8");
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText(input_tv.getText().toString() + "9");
            }
        });
        btn[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_tv.setText("");
                input2.setText("");
            }
        });
        btn[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(input_tv.getText().toString());
                input2.append(input_tv.getText().toString());

                switch (a){
                    case 1: result = num1+num2;
                    case 2: result = num1+num2;
                    case 3: result = num1+num2;
                    case 4: result = num1+num2;
                }
                input_tv.setText(String.valueOf(result));
            }
        });
    }

    private void input2() {
        btn[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input_tv.getText().toString().trim());
                input_tv.setText(input_tv.getText().toString() + "+");
                input2.setText(input_tv.getText().toString());
                input_tv.setText("");
                a = 1;
            }
        });
        btn[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input_tv.getText().toString().trim());
                input_tv.setText(input_tv.getText().toString() + "-");
                input2.setText(input_tv.getText().toString());
                input_tv.setText("");
                a = 2;
            }
        });
        btn[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input_tv.getText().toString().trim());
                input_tv.setText(input_tv.getText().toString() + "*");
                input2.setText(input_tv.getText().toString());
                input_tv.setText("");
                a = 3;
            }
        });
        btn[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(input_tv.getText().toString().trim());
                input_tv.setText(input_tv.getText().toString() + "/");
                input2.setText(input_tv.getText().toString());
                input_tv.setText("");
                a = 4;
            }
        });
    }
}