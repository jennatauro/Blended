package com.jennatauro.sectionedlistrecyclerview.models;

import com.jennatauro.sectionedlistrecyclerview.ModelViewHolder;

/**
 * Created by jennatauro on 2015-01-05.
 */
public abstract class Player extends SectionListItemObject implements ModelViewHolder {

    private String mName;
    private String mTeam;

    public String getmTeam() {
        return mTeam;
    }

    public void setmTeam(String mTeam) {
        this.mTeam = mTeam;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

}
