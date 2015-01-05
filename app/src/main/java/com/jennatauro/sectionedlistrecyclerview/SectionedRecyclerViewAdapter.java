package com.jennatauro.sectionedlistrecyclerview;

import android.location.Location;
import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.jennatauro.sectionedlistrecyclerview.models.SoccerPlayer;
import com.jennatauro.sectionedlistrecyclerview.viewholders.SoccerPlayerViewHolder;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SectionedRecyclerViewAdapter<T, VH extends SectionedRecyclerViewAdapter.RecyclerViewBaseHolder> extends RecyclerView.Adapter<VH> implements ViewAdapter<T>, StickyRecyclerHeadersAdapter {

    List<T> mItems;

    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_soccer_player, viewGroup, false);
        SoccerPlayerViewHolder viewHolder = new SoccerPlayerViewHolder(view, this);

        // set the view's size, margins, padding and layout parameters
        return (VH) viewHolder;
    }

    @Override
    public void onBindViewHolder(VH vh, int i) {
        SoccerPlayer soccerPlayer = (SoccerPlayer) mItems.get(i);
        ((SoccerPlayerViewHolder) vh).soccerPlayerName.setText(soccerPlayer.getmName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public void replace(List<T> objects) {
        mItems = objects;
        notifyDataSetChanged();
    }

    @Override
    public long getHeaderId(int i) {
        return i+1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.header, viewGroup, false);
        return new RecyclerView.ViewHolder(view) {
        };
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView = (TextView) viewHolder.itemView;
        textView.setAllCaps(true);
        textView.setPadding(20, 20, 20, 20);
        textView.setTextSize(15);

        SoccerPlayer playa = (SoccerPlayer) mItems.get(i);
        textView.setText("Header");
    }

    public static class RecyclerViewBaseHolder extends RecyclerView.ViewHolder {
        SectionedRecyclerViewAdapter mAdapter;

        public RecyclerViewBaseHolder(View view, SectionedRecyclerViewAdapter adapter) {
            super(view);
            ButterKnife.inject(this, view);
            mAdapter = adapter;
        }
    }
}
