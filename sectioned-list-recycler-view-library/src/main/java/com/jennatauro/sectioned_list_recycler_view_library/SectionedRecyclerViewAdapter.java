package com.jennatauro.sectioned_list_recycler_view_library;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by jennatauro on 2015-01-05.
 */
public class SectionedRecyclerViewAdapter<T extends ModelViewHolder, VH extends SectionedRecyclerViewAdapter.RecyclerViewBaseHolder> extends RecyclerView.Adapter<VH> implements ViewAdapter<T>, StickyRecyclerHeadersAdapter {

    List<T> mItems;

    int mPosition;


    @Override
    public int getItemViewType(int position) {
        mPosition = position;
        return mItems.get(position).getResourceLayoutId();
    }


    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);

        return (VH) mItems.get(mPosition).createViewHolder(view, this);
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
        return mItems.get(i).getResourceLayoutId();
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

        textView.setText(mItems.get(i).getHeaderTitle());
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
