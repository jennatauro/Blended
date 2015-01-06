package com.jennatauro.sectionedlistrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jennatauro.sectionedlistrecyclerview.models.SectionListItemObject;
import com.jennatauro.sectionedlistrecyclerview.models.SoccerPlayer;
import com.jennatauro.sectionedlistrecyclerview.viewholders.SoccerPlayerViewHolder;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SectionedRecyclerViewAdapter<T extends SectionListItemObject, VH extends SectionedRecyclerViewAdapter.RecyclerViewBaseHolder> extends RecyclerView.Adapter<VH> implements ViewAdapter<T>, StickyRecyclerHeadersAdapter {

    List<T> mItems;

    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        T item = mItems.get(i);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(item.getListItemResource(), viewGroup, false);

        return (VH) item.createViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(VH vh, int i) {
        mItems.get(i).bindViewHolder(vh);
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
