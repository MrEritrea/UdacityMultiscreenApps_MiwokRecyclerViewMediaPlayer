package com.alj968.android.udacity4miwokrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView = (TextView) findViewById(R.id.numbersTextView);
        numbersTextView.setOnClickListener(this);

        TextView familyTextView = (TextView) findViewById(R.id.familyTextView);
        familyTextView.setOnClickListener(this);

        TextView colorsTextView = (TextView) findViewById(R.id.colorsTextView);
        colorsTextView.setOnClickListener(this);

        TextView phrasesTextView = (TextView) findViewById(R.id.phrasesTextView);
        phrasesTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case R.id.numbersTextView:
                i = new Intent(this, NumbersActivity.class);
                break;
            case R.id.familyTextView:
                i = new Intent(this, FamilyActivity.class);
                break;
            case R.id.colorsTextView:
                i = new Intent(this, ColorsActivity.class);
                break;
            case R.id.phrasesTextView:
                i = new Intent(this, PhrasesActivity.class);
                break;

        }
        startActivity(i);

    }
}
