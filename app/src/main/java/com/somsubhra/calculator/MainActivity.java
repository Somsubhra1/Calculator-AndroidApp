package com.somsubhra.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView result;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnEq,btnPoint,btnMin,btnMul,btnDiv,btnClr;
    private float number1 = 0, number2 = 0;
    private String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Created by Somsubhra Das", Toast.LENGTH_LONG).show();


        btn0 = findViewById(R.id.btn0); btn1 = findViewById(R.id.btn1); btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3); btn4 = findViewById(R.id.btn4); btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6); btn7 = findViewById(R.id.btn7); btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9); btnAdd = findViewById(R.id.btnAdd); btnEq = findViewById(R.id.btnEq);
        btnPoint = findViewById(R.id.btnPoint); btnMin = findViewById(R.id.btnMin); btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv); btnClr = findViewById(R.id.btnClr); result = findViewById(R.id.result);

        btn0.setOnClickListener(this);btn1.setOnClickListener(this);btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);btn4.setOnClickListener(this);btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);btn7.setOnClickListener(this);btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);btnAdd.setOnClickListener(this);btnMin.setOnClickListener(this);
        btnMul.setOnClickListener(this);btnDiv.setOnClickListener(this);btnClr.setOnClickListener(this);
        btnEq.setOnClickListener(this);btnPoint.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Float answer = 0.0f;
        switch (view.getId()) {
            case R.id.btnClr:
                result.setText("");
                number1 = 0.0f;
                number2 = 0.0f;
                break;
            case R.id.btn0:
                result.setText(result.getText().toString()+"0");
                break;
            case R.id.btn1:
                result.setText(result.getText().toString()+"1");
                break;
            case R.id.btn2:
                result.setText(result.getText().toString()+"2");
                break;
            case R.id.btn3:
                result.setText(result.getText().toString()+"3");
                break;
            case R.id.btn4:
                result.setText(result.getText().toString()+"4");
                break;
            case R.id.btn5:
                result.setText(result.getText().toString()+"5");
                break;
            case R.id.btn6:
                result.setText(result.getText().toString()+"6");
                break;
            case R.id.btn7:
                result.setText(result.getText().toString()+"7");
                break;
            case R.id.btn8:
                result.setText(result.getText().toString()+"8");
                break;
            case R.id.btn9:
                result.setText(result.getText().toString()+"9");
                break;
            case R.id.btnPoint:
                result.setText(result.getText().toString()+".");
                break;
            case R.id.btnAdd:
                number1 = Float.parseFloat(result.getText().toString());
                oper = "+";
                result.setText("");
                break;
            case R.id.btnMin:
                number1 = Float.parseFloat(result.getText().toString());
                oper = "-";
                result.setText("");
                break;
            case R.id.btnMul:
                number1 = Float.parseFloat(result.getText().toString());
                oper = "*";
                result.setText("");
                break;
            case R.id.btnDiv:
                number1 = Float.parseFloat(result.getText().toString());
                oper = "/";
                result.setText("");
                break;
            case R.id.btnEq:
                number2 = Float.parseFloat(result.getText().toString());
                switch (oper) {
                    case "+":
                        answer = number1 + number2;
                        break;
                    case "-":
                        answer = number1 - number2;
                        break;
                    case "*":
                        answer = number1 * number2;
                        break;
                    case "/":
                        if(number2 == 0) {
                            String text="Can't divide "+number1+" by 0";
                            result.setText(text);
                            return;
                        }
                        answer = number1 / number2;
                        break;
                }
                result.setText(String.valueOf(answer));
                break;
        }

    }
}
