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
}