package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MetalRecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal_recycle);


        TextView textView = (TextView) findViewById(R.id.tvNonRec);
        String para = "Paint Cans" +
                "\n Motor Oil Cans" +
                "\n Pots and Pans" +
                "\n Propane Gas Tanks" +
                "\n Fluorescent Bulbs" +
                "\n CFL bulbs" +
                "\n Old Thermostats" +
                "\n Toys and Jewelry" +
                "\n Batteries" +
                "\n Certain Car Parts" +
                "\n TV/Computer Monitors" +
                "\n Radioactive Metal";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
    public void calculator(View view) {
        // Do something in response to button click
        EditText et1=findViewById(R.id.editTextNumber);
        EditText et2=findViewById(R.id.editTextNumber2);
        String temp=et1.getText().toString();
        String temp2=et2.getText().toString();
        int value=0;
        if (!"".equals(temp)){
            value+=Integer.parseInt(temp) * 5;
        }
        if (!"".equals(temp2)){
            value+=Integer.parseInt(temp2) * 10;
        }
        TextView t = (TextView)findViewById(R.id.textView6);
        t.setText("Exchange for " + value + "¢");

    }
}