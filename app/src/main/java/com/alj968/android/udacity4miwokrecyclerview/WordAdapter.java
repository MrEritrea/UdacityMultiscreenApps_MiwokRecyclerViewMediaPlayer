package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by amandajones on 12/21/17.
 */

public class WordAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private List<Word> mWords;
    private int mColorResourceId;

    public WordAdapter(List<Word> words, int colorResourceId) {
        mWords = words;
        mColorResourceId = colorResourceId;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: Check if "parent.getContext" actually works!
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.word_list_item, parent, false);
        return new WordViewHolder(view, mColorResourceId);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        Word word = mWords.get(position);
        holder.bindWord(word);
    }

    @Override
    public int getItemCount() {
        return mWords.size();
    }

}

