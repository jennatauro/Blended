package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.R;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;
import com.jennatauro.sectionedlistrecyclerview.viewholders.BasketballPlayerViewHolder;

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
