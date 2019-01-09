package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {
    private RecyclerView mNumbersRecyclerView;
    private WordAdapter mNumbersAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        mNumbersRecyclerView = (RecyclerView) findViewById(R.id.numbersRecyclerView);
        mNumbersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        updateUI();
    }

    private void updateUI() {
        List<Word> numbers = new ArrayList<>();

        numbers.add(new Word("1","lutti",R.drawable.number_one));
        numbers.add(new Word("2","otiiko",R.drawable.number_two));
        numbers.add(new Word("3","tolookosu",R.drawable.number_three));
        numbers.add(new Word("4","oyyisa",R.drawable.number_four));
        numbers.add(new Word("5","massokka",R.drawable.number_five));
        numbers.add(new Word("6","temmokka",R.drawable.number_six));
        numbers.add(new Word("7","kenekaku",R.drawable.number_seven));
        numbers.add(new Word("8","kawinta",R.drawable.number_eight));
        numbers.add(new Word("9","wo’e",R.drawable.number_nine));
        numbers.add(new Word("10","na’aacha",R.drawable.number_ten));

        mNumbersAdapter = new WordAdapter(numbers,R.color.category_numbers);
        mNumbersRecyclerView.setAdapter(mNumbersAdapter);
    }
}
