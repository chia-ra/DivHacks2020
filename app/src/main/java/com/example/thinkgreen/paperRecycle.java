package com.example.thinkgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class paperRecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_recycle);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoPaper);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, PAPERS);
        textView.setThreshold(1);
        textView.setAdapter(adapter);
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                List<String> list = Arrays.asList(PAPERS);
                TextView tvDisplay = (TextView)findViewById(R.id.tv5);
                if (list.contains(selection)) {
                    tvDisplay.setText("Good News! " + selection + " is/are recyclable with normal items.");
                }
                else
                    tvDisplay.setText("Unfortunately, " + selection + " is not recyclable at normal facilities.");
            }
        });
    }
    private static final String[] PAPERS = new String[] {
            "Cardboard", "Printer Paper", "Magazines", "Newspaper", "Envelopes", "Paper Bags"
    };


}