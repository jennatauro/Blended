package com.jennatauro.sample.models;

import android.view.View;

import com.jennatauro.sample.R;
import com.jennatauro.sample.viewholders.BasketballPlayerViewHolder;
import com.jennatauro.sectioned_list_recycler_view_library.SectionedRecyclerViewAdapter;

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
        return new BasketballPlayerViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
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
