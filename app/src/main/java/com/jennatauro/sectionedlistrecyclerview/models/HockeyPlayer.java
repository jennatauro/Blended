package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.R;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;
import com.jennatauro.sectionedlistrecyclerview.viewholders.HockeyPlayerViewHolder;
import com.jennatauro.sectionedlistrecyclerview.viewholders.SoccerPlayerViewHolder;

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
        return new HockeyPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
        ((HockeyPlayerViewHolder) vh).hockeyPlayerName.setText(getmName());
    }

    @Override
    public String getHeaderTitle() {
        return "HOCKEY PLAYERS";
    }

    @Override
    public int getResourceLayoutId() {
        return R.layout.list_item_hockey_player;
    }
}
