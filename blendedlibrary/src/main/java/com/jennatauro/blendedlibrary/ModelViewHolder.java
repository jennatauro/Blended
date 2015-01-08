package com.jennatauro.blendedlibrary;

import android.view.View;

/**
 * Created by jennatauro on 2015-01-05.
 */
public interface ModelViewHolder<VH> {

    public VH createViewHolder(View view, BlendedRecyclerViewAdapter adapter);

    public void bindViewHolder(BlendedRecyclerViewAdapter.RecyclerViewBaseHolder vh);

    public String getHeaderTitle();

    public int getResourceLayoutId();
}
