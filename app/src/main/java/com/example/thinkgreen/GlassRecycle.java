package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GlassRecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glass_recycle);


        TextView textView = (TextView) findViewById(R.id.nonrecglass);
        String para = "Tempered Glass" +
                "\n Windowpanes" +
                "\n Porcelain" +
                "\n Ceramics" +
                "\n Windshields" +
                "\n Glass China" +
                "\n Tableware" +
                "\n Mirrors" +
                "\n Light Bulbs" +
                "\n Crystal" +
                "\n Heat Resistant Glass" +
                "\n Pyrex Dishes";
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