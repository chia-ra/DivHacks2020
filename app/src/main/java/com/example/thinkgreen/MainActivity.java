package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user touches the recycle button */
    public void recycleMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, RecycleActivity.class);
        startActivity(intent);
    }
    /** Called when the user touches the reuse button */
    public void reuseMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent (this, ReuseActivity.class);
        startActivity(intent);
    }
}