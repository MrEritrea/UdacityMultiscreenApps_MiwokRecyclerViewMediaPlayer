package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by amandajones on 12/21/17.
 */

public class WordViewHolder extends RecyclerView.ViewHolder {
    private TextView mDefaultWordTextView;
    private TextView mMiwokWordTextView;
    private ImageView mWordImageView;
    private Word mWord;

    public WordViewHolder(View itemView, int colorResourceId) {
        super(itemView);
        mDefaultWordTextView = (TextView) itemView.findViewById(R.id.textViewDefaultWord);
        mMiwokWordTextView = (TextView) itemView.findViewById(R.id.textViewMiwokWord);
        mWordImageView = (ImageView) itemView.findViewById(R.id.imageViewWord);
        LinearLayout textContainer = (LinearLayout) itemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(itemView.getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);
    }

    public void bindWord(Word word) {
        mWord = word;
        mDefaultWordTextView.setText(mWord.getDefaultTranslation());
        mMiwokWordTextView.setText(mWord.getMiwokTranslation());
        if(word.hasImage()) {
            mWordImageView.setImageResource(mWord.getImageResourceId());
        }
    }
}

