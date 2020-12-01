package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {


    TextView textView ;
    String expr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textView);
        expr="";

    }
    public void op(View view)
    {

        Button b = (Button)view;
        String btext = (String) b.getText();

        if(btext.equals("="))
        {
            Expression expression = new Expression(expr);
            expr = String.valueOf(expression.calculate());
            textView.setText(expr);
        }
        else if(btext.equals("C"))
        {
            expr="";
            textView.setText(expr);
        }
        else
        {
            expr = expr + btext;

            textView.setText(expr);
        }


    }
}
