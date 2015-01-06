package com.jennatauro.sectionedlistrecyclerview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jennatauro.sectionedlistrecyclerview.models.SectionListItemObject;
import com.jennatauro.sectionedlistrecyclerview.models.SoccerPlayer;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity<T extends SectionListItemObject> extends ActionBarActivity {

    RecyclerView mRecyclerView;

    SectionedRecyclerViewAdapter mSectionedRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionedRecyclerViewAdapter = new SectionedRecyclerViewAdapter();

        SoccerPlayer soccerPlayer1 = new SoccerPlayer();
        soccerPlayer1.setmName("YO");
        soccerPlayer1.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer2 = new SoccerPlayer();
        soccerPlayer2.setmName("YO2");
        soccerPlayer2.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer3 = new SoccerPlayer();
        soccerPlayer3.setmName("YO3");
        soccerPlayer3.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer4 = new SoccerPlayer();
        soccerPlayer4.setmName("YO4");
        soccerPlayer4.setListItemResource(R.layout.list_item_soccer_player);

        List<T> players = new ArrayList<>();
        players.add((T) soccerPlayer1);
        players.add((T) soccerPlayer2);
        players.add((T) soccerPlayer3);
        players.add((T) soccerPlayer4);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mSectionedRecyclerViewAdapter);
        mRecyclerView.addItemDecoration(new StickyRecyclerHeadersDecoration(mSectionedRecyclerViewAdapter));

        mSectionedRecyclerViewAdapter.replace(players);
    }

}
