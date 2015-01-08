package com.jennatauro.blendedsample.models;

import android.view.View;

import com.jennatauro.blendedlibrary.BlendedRecyclerViewAdapter;
import com.jennatauro.blendedsample.R;
import com.jennatauro.blendedsample.viewholders.HockeyPlayerViewHolder;


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
    public Object createViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
        return new HockeyPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(BlendedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
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
