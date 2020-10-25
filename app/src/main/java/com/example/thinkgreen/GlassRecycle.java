package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
}