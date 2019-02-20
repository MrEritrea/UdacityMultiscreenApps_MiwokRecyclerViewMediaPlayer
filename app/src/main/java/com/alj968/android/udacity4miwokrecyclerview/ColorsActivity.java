package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {
    private RecyclerView mColorsRecyclerView;
    private WordAdapter mColorsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        mColorsRecyclerView = (RecyclerView) findViewById(R.id.colorsRecyclerView);
        mColorsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        updateUI();
    }

    private void updateUI(){
        List<Word> colors =  new ArrayList<>();
        colors.add(new Word("red","weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colors.add(new Word("green","chokokki", R.drawable.color_green, R.raw.color_green));
        colors.add(new Word("brown","ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Word("gray","ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Word("black","kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new Word("white","kelelli", R.drawable.color_white, R.raw.color_white));
        colors.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        mColorsAdapter = new WordAdapter(colors,R.color.category_colors);
        mColorsRecyclerView.setAdapter(mColorsAdapter);
    }

}
