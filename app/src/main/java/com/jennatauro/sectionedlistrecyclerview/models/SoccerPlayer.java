package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.R;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;
import com.jennatauro.sectionedlistrecyclerview.viewholders.SoccerPlayerViewHolder;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SoccerPlayer extends Player{

    private int mSoccerGoals;

    public int getmSoccerGoals() {
        return mSoccerGoals;
    }

    public void setmSoccerGoals(int mSoccerGoals) {
        this.mSoccerGoals = mSoccerGoals;
    }

    @Override
    public Object createViewHolder(View view, SectionedRecyclerViewAdapter adapter) {
        return new SoccerPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
        ((SoccerPlayerViewHolder) vh).soccerPlayerName.setText(getmName());
    }

    @Override
    public String getHeaderTitle() {
        return "SOCCER PLAYERS";
    }

    @Override
    public int getResourceLayoutId() {
        return R.layout.list_item_soccer_player;
    }
}
