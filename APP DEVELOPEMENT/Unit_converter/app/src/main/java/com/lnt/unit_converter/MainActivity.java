package com.lnt.unit_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.support.
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity   {
    Spinner fromspinner,tospinner;
    Button btnconvert;
    TextView editfrom,editto,ConvertedValue,btninput;
    TextView m,km,cm,mm,y,f,i,mi;
    String[] converter = { "Meter", "KiloMeter", "CentiMeter", "MilliMeter", "Mile","Yard","Foot","Inch"};
    int pos=0;
    int pos2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.length_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromspinner = (Spinner) findViewById(R.id.spinner);
        fromspinner.setAdapter(adapter);

        tospinner = (Spinner) findViewById(R.id.spinner3);
        tospinner.setAdapter(adapter);

        btninput = (EditText)findViewById(R.id.input);
        ConvertedValue = (EditText)findViewById(R.id.convertedvalue);
        btnconvert = (Button)findViewById(R.id.button2);
        editfrom = (TextView)findViewById(R.id.textView);
        editto = (TextView)findViewById(R.id.textView2);

        fromspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                Object item = parent.getItemAtPosition(position);
                String getfromdata = fromspinner.getSelectedItem().toString();
                 editfrom.setText(getfromdata);
                 pos=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Select a Valid Option", Toast.LENGTH_LONG).show();
            }
        });

        tospinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                Object item = parent.getItemAtPosition(position);
                String gettodata = tospinner.getSelectedItem().toString();
                editto.setText(gettodata);
                pos2=position;

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Select a Valid Option", Toast.LENGTH_LONG).show();
            }
        });

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btninput = (EditText) findViewById(R.id.input);
                String userinputpos = btninput.getText().toString();

                if (TextUtils.isEmpty(userinputpos)) {
                    btninput.setError("Empty User data");
                    return;
                }
                double meter, kiloMeter, centiMeter, milliMeter, mile, yard, foot, inch;
                //*******************************Meter***************************
                if (pos == 0 && pos2 == 0) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    meter = meter;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 0 && pos2 == 1) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = meter / 1000;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 0 && pos2 == 2) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    centiMeter = meter * 100;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 0 && pos2 == 3) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    milliMeter = meter * 1000;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 0 && pos2 == 4) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    mile = meter * 0.000621371;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 0 && pos2 == 5) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    yard = meter * 1.09361;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 0 && pos2 == 6) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    foot = meter * 3.28084;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 0 && pos2 == 7) {
                    meter = Float.parseFloat(btninput.getText().toString());
                    inch = meter * 39.3701;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText(" " + inch);
                }
                //*******************************KiloMeter***************************

                if (pos == 1 && pos2 == 0) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    meter = kiloMeter * 1000;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 1 && pos2 == 1) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = kiloMeter;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 1 && pos2 == 2) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    centiMeter = kiloMeter / 100000;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 1 && pos2 == 3) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    milliMeter = kiloMeter / 100000;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 1 && pos2 == 4) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    mile= kiloMeter * 0.621371;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 1 && pos2 == 5) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    yard= kiloMeter * 1093.613;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 1 && pos2 == 6) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    foot= kiloMeter * 3280.839;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 1 && pos2 == 7) {
                    kiloMeter = Float.parseFloat(btninput.getText().toString());
                    inch= kiloMeter * 3280.839;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
                //*******************************CentiMeter***************************

                if (pos == 2 && pos2 == 0) {
                    centiMeter= Float.parseFloat(btninput.getText().toString());
                    meter = centiMeter * 0.001;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 2 && pos2 == 1) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = centiMeter * 0.00001;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 2 && pos2 == 2) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    centiMeter = centiMeter;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 2 && pos2 == 3) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    milliMeter = centiMeter * 10;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 2 && pos2 == 4) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    mile= centiMeter * 0.00000621371;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 2 && pos2 == 5) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    yard= centiMeter * 0.0109;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 2 && pos2 == 6) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    foot= centiMeter * 0.00328;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 2 && pos2 == 7) {
                    centiMeter = Float.parseFloat(btninput.getText().toString());
                    inch= centiMeter / 2.54;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }

                //*******************************MilliMeter***************************
                if (pos == 3 && pos2 == 0) {
                    milliMeter= Float.parseFloat(btninput.getText().toString());
                    meter = milliMeter * 0.001;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 3 && pos2 == 1) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = milliMeter * 0.00001;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 3 && pos2 == 2) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    centiMeter = milliMeter*10;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 3 && pos2 == 3) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    milliMeter = milliMeter;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 3 && pos2 == 4) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    mile= milliMeter * 6.2137e-7;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 3 && pos2 == 5) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    yard= milliMeter * 0.00057;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 3 && pos2 == 6) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    foot= milliMeter * 0.0001894;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 3 && pos2 == 7) {
                    milliMeter = Float.parseFloat(btninput.getText().toString());
                    inch= milliMeter * 0.03937;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
                //*******************************Mile***************************
                if (pos == 4 && pos2 == 0) {
                    mile= Float.parseFloat(btninput.getText().toString());
                    meter = mile * 1609.341;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 4 && pos2 == 1) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = mile * 1.609;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 4 && pos2 == 2) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    centiMeter = mile*160934.1;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 4 && pos2 == 3) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    milliMeter = mile*1609340.9;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 4 && pos2 == 4) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    mile= mile;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 4 && pos2 == 5) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    yard= mile * 1759.9966;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 4 && pos2 == 6) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    foot= mile * 5279.99;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 4 && pos2 == 7) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    inch= mile * 63359.87;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
                //*******************************Yard***************************
                if (pos == 5 && pos2 == 0) {
                    mile= Float.parseFloat(btninput.getText().toString());
                    meter = mile * 1609.341;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 5 && pos2 == 1) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = mile * 1.609;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 5 && pos2 == 2) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    centiMeter = mile*160934.1;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 5 && pos2 == 3) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    milliMeter = mile*1609340.9;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 5 && pos2 == 4) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    mile= mile;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 5 && pos2 == 5) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    yard= mile * 1759.9966;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 5 && pos2 == 6) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    foot= mile * 5279.99;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 5 && pos2 == 7) {
                    mile = Float.parseFloat(btninput.getText().toString());
                    inch= mile * 63359.87;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
                //*******************************Foot***************************
                if (pos == 6 && pos2 == 0) {
                    foot= Float.parseFloat(btninput.getText().toString());
                    meter = foot * 0.3048;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 6 && pos2 == 1) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = foot * 0.0003047;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 6 && pos2 == 2) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    centiMeter = foot*30.478;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 6 && pos2 == 3) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    milliMeter = foot*304.8;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 6 && pos2 == 4) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    mile= foot*0.000189;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 6 && pos2 == 5) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    yard= foot * 0.3333;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 6 && pos2 == 6) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    foot= foot ;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 6 && pos2 == 7) {
                    foot = Float.parseFloat(btninput.getText().toString());
                    inch= foot * 12;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
                //*******************************Inch***************************
                if (pos == 7 && pos2 == 0) {
                    inch= Float.parseFloat(btninput.getText().toString());
                    meter = inch * 0.02534;
                    m = (EditText) findViewById(R.id.convertedvalue);
                    m.setText("" + meter);
                }
                if (pos == 7 && pos2 == 1) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    kiloMeter = inch * 2.539995125740004479e-5;
                    km = (EditText) findViewById(R.id.convertedvalue);
                    km.setText("" + kiloMeter);
                }
                if (pos == 7 && pos2 == 2) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    centiMeter = inch*2.53999;
                    cm = (EditText) findViewById(R.id.convertedvalue);
                    cm.setText("" + centiMeter);
                }
                if (pos == 7 && pos2 == 3) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    milliMeter = inch*25.3999;
                    mm = (EditText) findViewById(R.id.convertedvalue);
                    mm.setText("" + milliMeter);
                }
                if (pos == 7 && pos2 == 4) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    mile= inch*1.57883795e-5;
                    mi = (EditText) findViewById(R.id.convertedvalue);
                    mi.setText("" + mile);
                }
                if (pos == 7 && pos2 == 5) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    yard= inch * 0.027777;
                    y = (EditText) findViewById(R.id.convertedvalue);
                    y.setText("" + yard);
                }
                if (pos == 7 && pos2 == 6) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    foot= inch*0.083333;
                    f = (EditText) findViewById(R.id.convertedvalue);
                    f.setText("" + foot);
                }
                if (pos == 7 && pos2 == 7) {
                    inch = Float.parseFloat(btninput.getText().toString());
                    inch= inch;
                    i = (EditText) findViewById(R.id.convertedvalue);
                    i.setText("" + inch);
                }
            }
        });
    }

}