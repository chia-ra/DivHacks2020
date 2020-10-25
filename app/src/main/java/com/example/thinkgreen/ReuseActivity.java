package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReuseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reuse);
    }

    public void metalMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, MetalReuse.class);
        startActivity(intent);
    }
    public void paperMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, ReuseActivity.class);
        startActivity(intent);
    }
    public void plasticMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, ReuseActivity.class);
        startActivity(intent);
    }
    public void otherMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent(this, ReuseActivity.class);
        startActivity(intent);
    }

}