package com.jennatauro.blendedsample.models;

import android.view.View;

import com.jennatauro.blendedlibrary.BlendedRecyclerViewAdapter;
import com.jennatauro.blendedsample.R;
import com.jennatauro.blendedsample.viewholders.SoccerPlayerViewHolder;

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
    public Object createViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
        return new SoccerPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(BlendedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
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
