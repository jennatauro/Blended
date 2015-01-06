package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class BasketballPlayer extends Player{

    private int mBaskets;

    public int getmBaskets() {
        return mBaskets;
    }

    public void setmBaskets(int mBaskets) {
        this.mBaskets = mBaskets;
    }

    @Override
    public Object createViewHolder(View view, SectionedRecyclerViewAdapter adapter) {
        return null;
    }

    @Override
    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {

    }
}
