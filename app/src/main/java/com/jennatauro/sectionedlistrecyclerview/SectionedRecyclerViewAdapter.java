package com.jennatauro.sectionedlistrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SectionedRecyclerViewAdapter<T, VH extends SectionedRecyclerViewAdapter.RecyclerViewBaseHolder> extends RecyclerView.Adapter<VH> implements ViewAdapter<T> {


    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(VH vh, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void replace(List<T> objects) {

    }

    public static class RecyclerViewBaseHolder extends RecyclerView.ViewHolder {
        SectionedRecyclerViewAdapter mAdapter;

        public RecyclerViewBaseHolder(View view, SectionedRecyclerViewAdapter adapter) {
            super(view);
            mAdapter = adapter;
        }
    }
}
