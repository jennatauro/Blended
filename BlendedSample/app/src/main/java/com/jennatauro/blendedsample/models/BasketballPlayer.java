package com.jennatauro.blendedsample.models;

import android.view.View;

import com.jennatauro.blendedlibrary.BlendedRecyclerViewAdapter;
import com.jennatauro.blendedsample.R;
import com.jennatauro.blendedsample.viewholders.BasketballPlayerViewHolder;


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
    public Object createViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
        return new BasketballPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(BlendedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
        ((BasketballPlayerViewHolder) vh).basketballPlayerName.setText(getmName());
    }

    @Override
    public String getHeaderTitle() {
        return "BASKETBALL PLAYERS";
    }

    @Override
    public int getResourceLayoutId() {
        return R.layout.list_item_basketball_player;
    }
}
