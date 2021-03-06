package com.jennatauro.blendedsample.viewholders;

import android.view.View;
import android.widget.TextView;


import com.jennatauro.blendedlibrary.BlendedRecyclerViewAdapter;
import com.jennatauro.blendedsample.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class HockeyPlayerViewHolder extends BlendedRecyclerViewAdapter.RecyclerViewBaseHolder {

    @InjectView(R.id.hockey_player_name)
    public TextView hockeyPlayerName;

    public HockeyPlayerViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
        super(view, adapter);
        ButterKnife.inject(this, view);
    }
}

