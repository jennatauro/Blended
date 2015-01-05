package com.jennatauro.sectionedlistrecyclerview.viewholders;

import android.view.View;
import android.widget.TextView;

import com.jennatauro.sectionedlistrecyclerview.R;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SoccerPlayerViewHolder extends SectionedRecyclerViewAdapter.RecyclerViewBaseHolder {

    @InjectView(R.id.soccer_player_name)
    public TextView soccerPlayerName;

    public SoccerPlayerViewHolder(View view, SectionedRecyclerViewAdapter adapter) {
        super(view, adapter);
        ButterKnife.inject(this, view);
    }
}