package com.jennatauro.sectioned_list_recycler_view_library;

import android.view.View;

/**
 * Created by jennatauro on 2015-01-05.
 */
public interface ModelViewHolder<VH> {

    public VH createViewHolder(View view, SectionedRecyclerViewAdapter adapter);

    public void bindViewHolder(SectionedRecyclerViewAdapter.RecyclerViewBaseHolder vh);

    public String getHeaderTitle();

    public int getResourceLayoutId();
}
