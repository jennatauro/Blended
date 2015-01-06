package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class HockeyPlayer extends Player{

    private int mHockeyGoals;

    public int getmHockeyGoals() {
        return mHockeyGoals;
    }

    public void setmHockeyGoals(int mHockeyGoals) {
        this.mHockeyGoals = mHockeyGoals;
    }


    @Override
    public Object createViewHolder(View view, SectionedRecyclerViewAdapter adapter) {
        return null;
    }

    @Override
    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {

    }
}
