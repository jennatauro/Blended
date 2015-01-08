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
public class SoccerPlayerViewHolder extends BlendedRecyclerViewAdapter.RecyclerViewBaseHolder {

    @InjectView(R.id.soccer_player_name)
    public TextView soccerPlayerName;

    public SoccerPlayerViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
        super(view, adapter);
        ButterKnife.inject(this, view);
    }
}
