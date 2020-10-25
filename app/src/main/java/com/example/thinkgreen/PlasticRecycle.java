package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlasticRecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic_recycle);

        TextView textView = (TextView) findViewById(R.id.scrollerplas);
        String para = "Plastic Film(e.g. bags)" +
                "\n Water Jugs" +
                "\n Ink Cartridges" +
                "\n CD Cases" +
                "\n Polystyrene Containers" +
                "\n Plastic Utensils" +
                "\n Styrofoam" +
                "\n Keyboards" +
                "\n Paper Cups with Plastic Coating" +
                "\n Fiberglass" +
                "\n Foams" +
                "\n Vinyl";
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