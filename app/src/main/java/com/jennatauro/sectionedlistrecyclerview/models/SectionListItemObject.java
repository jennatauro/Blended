package com.jennatauro.sectionedlistrecyclerview.models;

import android.view.View;

import com.jennatauro.sectionedlistrecyclerview.ModelViewHolder;
import com.jennatauro.sectionedlistrecyclerview.SectionedRecyclerViewAdapter;

/**
 * Created by jennatauro on 2015-01-05.
 */
public abstract class SectionListItemObject implements ModelViewHolder {

    private int listItemResource;
    private String listHeaderTitle;


    public String getListHeaderTitle() {
        return listHeaderTitle;
    }

    public void setListHeaderTitle(String listHeaderTitle) {
        this.listHeaderTitle = listHeaderTitle;
    }

    public int getListItemResource() {
        return listItemResource;
    }

    public void setListItemResource(int listItemResource) {
        this.listItemResource = listItemResource;
    }

}
