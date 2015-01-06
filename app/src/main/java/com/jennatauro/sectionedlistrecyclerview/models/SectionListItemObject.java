package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.ModelViewHolder;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;

/**
 * Created by jennatauro on 2015-01-05.
 */
public abstract class SectionListItemObject implements ModelViewHolder {

    private int listItemResource;

    public int getListItemResource() {
        return listItemResource;
    }

    public void setListItemResource(int listItemResource) {
        this.listItemResource = listItemResource;
    }

}
