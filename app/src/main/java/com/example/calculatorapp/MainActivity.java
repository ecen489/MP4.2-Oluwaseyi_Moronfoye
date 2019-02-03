package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;



//problem with double didgits you need to fix this 
public class MainActivity extends AppCompatActivity {

    Boolean functionSelect = false;
    String A = "";
    String B = "";
    Character funct;
    Boolean submitted = false;
    Boolean text = false;

    public Float addition(Float A, Float B)
    {
        return A + B;
    }

    public Float subtraction(Float A, Float B)
    {
        return A - B;
    }

    public Float multiplication(Float A, Float B)
    {
        return A * B;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclickadd(View view) {
        if(!functionSelect && text)
        {
            functionSelect = true;
            TextView et = (TextView) findViewById(R.id.editText);
            if(submitted)
            {
                et.setText("");
                submitted = false;
            }
            String enteredText = String.valueOf(et.getText());
            String nEnteredT = enteredText + " + ";
            funct = '+';
            et.setText(nEnteredT);
//        Toast.makeText(this,"")
        }
        else
        {
//            Toast.makeText(this,"")
        }


    }

    public void btnclicksub(View view) { // i need to add the same if else that i put for add here
        if(!functionSelect && text)
        {

            functionSelect = true;
            TextView et = (TextView) findViewById(R.id.editText);
            if(submitted)
            {
                et.setText("");
                submitted = false;
            }
            String enteredText = String.valueOf(et.getText());
            String nEnteredT = enteredText + " - ";
            funct = '-';
            et.setText(nEnteredT);
//        Toast.makeText(this,"")
        }
        else
        {
//            Toast.makeText(this,"")
        }
    }

    public void btnclick7(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "7";
        else
            B = B+ "7";
        String nEnteredT = enteredText + "7";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick4(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "4";
        else
            B = B+ "4";
        String nEnteredT = enteredText + "4";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick1(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "1";
        else
            B = B+ "1";
        String nEnteredT = enteredText + "1";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick0(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "0";
        else
            B = B+ "0";
        String nEnteredT = enteredText + "0";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick2(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "2";
        else
            B = B + "2";
        String nEnteredT = enteredText + "2";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick3(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "3";
        else
            B = B + "3";
        String nEnteredT = enteredText + "3";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclickMul(View view) { // i need to add the same if else that i put for add here
        if(!functionSelect && text)
        {
            functionSelect = true;
            TextView et = (TextView) findViewById(R.id.editText);
            if(submitted)
            {
                et.setText("");
                submitted = false;
            }
            String enteredText = String.valueOf(et.getText());
            String nEnteredT = enteredText + " X ";
            funct = 'X';
            et.setText(nEnteredT);
//        Toast.makeText(this,"")
        }
        else
        {
//            Toast.makeText(this,"")
        }
    }

    public void btnClickSubmit(View view) {
        if(functionSelect && (B.length() != 0))
        {
            TextView et = (TextView) findViewById(R.id.editText);
            float argument1;
            float argument2;
            String answer;
            switch(funct)
            {
                case '+':
                       argument1 = Float.parseFloat(A);
                       argument2 = Float.parseFloat(B);
                       answer = Float.toString(addition(argument1, argument2));
                       et.setText(answer);
                       break;
                case '-':
                    argument1 = Float.parseFloat(A);
                    argument2 = Float.parseFloat(B);
                    answer = Float.toString(subtraction(argument1, argument2));
                    et.setText(answer);
                    break;

                case 'X':
                    argument1 = Float.parseFloat(A);
                    argument2 = Float.parseFloat(B);
                    answer = Float.toString(multiplication(argument1, argument2));
                    et.setText(answer);
                    break;

            }
            functionSelect = false;
            submitted = true;
            text = false;
            A = "";
            B = "";

//            Toast.makeText(this,"the answer is " + answer,)
        }
        else
        {
//            Toast.makeText(this,"Please chooses a valid function",)
        }
    }

    public void btnclick8(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "8";
        else
            B = B+ "8";
        String nEnteredT = enteredText + "8";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick5(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "5";
        else
            B = B+ "5";
        String nEnteredT = enteredText + "5";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick9(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "9";
        else
            B = B+ "9";
        String nEnteredT = enteredText + "9";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclick6(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }
        text = true;
        String enteredText = String.valueOf(et.getText());
        if(!functionSelect)
            A = A + "6";
        else
            B = B + "6";
        String nEnteredT = enteredText + "6";
        et.setText(nEnteredT);
//        Toast.makeText(this,"")
    }

    public void btnclickClear(View view) {
        TextView et = (TextView) findViewById(R.id.editText);
        et.setText("");
        A = "";
        B = "";
        functionSelect = false;
        submitted = false;
        text = false;

    }

    public void btnclickpoint(View view) {
        Boolean flag = false;
        TextView et = (TextView) findViewById(R.id.editText);
        if(submitted)
        {
            et.setText("");
            submitted = false;
        }

        String enteredText = String.valueOf(et.getText());
        if(!functionSelect && text)
        {
            A = A + ".";
            flag = true;
        }
        else if(functionSelect && (B.length() != 0))
        {
            flag = true;
            B = B + ".";
        }
        if(flag)
        {
            text = true;
            String nEnteredT = enteredText + ".";
            et.setText(nEnteredT);
//        Toast.makeText(this,"")
        }

    }
}
