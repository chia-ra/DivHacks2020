package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
    }
    public void metalMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, MetalRecycle.class);
        startActivity(intent);
    }
    public void paperMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, paperRecycle.class);
        startActivity(intent);
    }
    public void plasticMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, PlasticRecycle.class);
        startActivity(intent);
    }
    public void glassMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, GlassRecycle.class);
        startActivity(intent);
    }
}