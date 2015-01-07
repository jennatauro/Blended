package com.jennatauro.sample.models;

import android.view.View;

import com.jennatauro.sample.R;
import com.jennatauro.sample.viewholders.HockeyPlayerViewHolder;
import com.jennatauro.sectioned_list_recycler_view_library.SectionedRecyclerViewAdapter;

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
