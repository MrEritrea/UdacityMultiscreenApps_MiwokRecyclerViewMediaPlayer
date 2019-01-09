package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {
    private RecyclerView mPhrasesRecyclerView;
    private WordAdapter mPhrasesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        mPhrasesRecyclerView = (RecyclerView) findViewById(R.id.phrasesRecyclerView);
        mPhrasesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        updateUI();
    }

    private void updateUI() {
        List<Word> phrases = new ArrayList<>();

        phrases.add(new Word("Where are you going","minto wuksus"));
        phrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Word("My name is…","oyaaset..."));
        phrases.add(new Word("How are you feeling?","michәksәs?"));
        phrases.add(new Word("I’m feeling good","kuchi achit"));
        phrases.add(new Word("Are you coming?","әәnәs'aa?"));
        phrases.add(new Word("Yes I’m coming","hәә’ әәnәm"));
        phrases.add(new Word("I’m coming","әәnәm"));
        phrases.add(new Word("Let’s go","yoowutis"));
        phrases.add(new Word("Come here","әnni'nem"));

        mPhrasesAdapter = new WordAdapter(phrases, R.color.category_phrases);
        mPhrasesRecyclerView.setAdapter(mPhrasesAdapter);
    }
}
