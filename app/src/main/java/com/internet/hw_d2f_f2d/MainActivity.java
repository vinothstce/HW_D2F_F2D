package com.internet.hw_d2f_f2d;

import android.app.AlertDialog.Builder;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText1;
    Button button1;
    TextView result;
    RadioButton fb, cb;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button1);
        result = (TextView) findViewById(R.id.result);
        fb = (RadioButton) findViewById(R.id.fb);
        cb = (RadioButton) findViewById(R.id.cb);
        cl = (ConstraintLayout) findViewById(R.id.ll);

        button1.setOnClickListener(this);
    }

    //Button onclick method
    public void onClick(View v)
    {
        double a = Double.parseDouble(String.valueOf(editText1.getText()));
        if(fb.isChecked())
        {
            result.setText(c2f(a) + "degree F");
            cl.setBackgroundColor(Color.CYAN);
            return;
        }
        else
        {
            result.setText(f2c(a)+"degree C");
            cl.setBackgroundColor(Color.YELLOW);
            return;
        }

    }
    //Celcius to Fahrenhiet method
    public double c2f(double c)
    {
        return (c*9)/5+32;
    }

    //Fahrenheit to Celcius method
    public double f2c(double f)
    {
        return (f-32)*5/9;
    }
    //Method to display message in a panel dialog
    public void showMessage(String title, String Message)
    {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
