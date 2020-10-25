package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PlasticRecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic_recycle);

        TextView textView = (TextView) findViewById(R.id.scrollerplas);
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
}