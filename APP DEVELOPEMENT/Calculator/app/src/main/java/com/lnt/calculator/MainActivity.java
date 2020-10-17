package com.lnt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button CL,percentile,erase,divide,seven,eight,nine,multiply,four,five,six,minus,one,two,three,plus,zero,d_zero,dot,equal;
    EditText edit_cal;
    boolean Addition_cal, mult_cal, sub_cal,div_cal,percentile_cal;
    float mValueOne, mValueTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CL = (Button) findViewById(R.id.Back);
        percentile = (Button) findViewById(R.id.percentile);
        erase = (Button) findViewById(R.id.erase);
        divide = (Button) findViewById(R.id.divide);
        seven = (Button) findViewById(R.id.sieben);
        eight = (Button) findViewById(R.id.acht);
        nine = (Button) findViewById(R.id.neun);
        multiply = (Button) findViewById(R.id.multiply);
        four = (Button) findViewById(R.id.fear);
        five = (Button) findViewById(R.id.funf);
        six = (Button) findViewById(R.id.sechs);
        minus = (Button) findViewById(R.id.minus);
        one = (Button) findViewById(R.id.eine);
        two = (Button) findViewById(R.id.zwie);
        three = (Button) findViewById(R.id.drie);
        plus = (Button) findViewById(R.id.plus);
        zero = (Button) findViewById(R.id.zero);
        d_zero = (Button) findViewById(R.id.d_zero);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        edit_cal=(EditText) findViewById(R.id.TextView);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+".");
            }
        });
        d_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"00");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText(edit_cal.getText()+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_cal==null)
                {
                    edit_cal.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(edit_cal.getText()+" ");
                    Addition_cal=true;
                    edit_cal.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edit_cal.getText()+"");
                sub_cal=true;
                edit_cal.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edit_cal.getText()+"");
                mult_cal=true;
                edit_cal.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edit_cal.getText()+"");
                div_cal=true;
                edit_cal.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo=Float.parseFloat(edit_cal.getText()+"");
                if(Addition_cal==true)
                {
                    edit_cal.setText(mValueOne+ mValueTwo+"");
                    Addition_cal=false;
                }
                if(sub_cal==true)
                {
                    edit_cal.setText(mValueOne- mValueTwo+"");
                    sub_cal=false;
                }
                if(mult_cal==true)
                {
                    edit_cal.setText(mValueOne*mValueTwo+"");
                    mult_cal=false;
                }
                if(div_cal==true)
                {
                    edit_cal.setText(mValueOne / mValueTwo+"");
                    div_cal=false;
                }
                if(percentile_cal==true)
                {
                    edit_cal.setText(mValueOne % mValueTwo+"");
                    percentile_cal=false;
                }
            }
        });
        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_cal.setText("");
            }
        });
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = edit_cal.getText().toString();
                if(number.length()>0){
                    number=number.substring(0,number.length()-1);
                }
                edit_cal.setText(number);
                edit_cal.setSelection(edit_cal.getText().length());
            }
        });
        percentile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edit_cal.getText()+"");
                percentile_cal=true;
                edit_cal.setText(null);
            }
        });
    }
}