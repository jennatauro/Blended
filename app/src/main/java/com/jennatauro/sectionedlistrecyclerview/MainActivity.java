package com.jennatauro.sectionedlistrecyclerview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.jennatauro.sectionedlistrecyclerview.models.SoccerPlayer;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    RecyclerView mRecyclerView;

    SectionedRecyclerViewAdapter mSectionedRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionedRecyclerViewAdapter = new SectionedRecyclerViewAdapter();

        SoccerPlayer soccerPlayer1 = new SoccerPlayer();
        soccerPlayer1.setmName("YO");

        SoccerPlayer soccerPlayer2 = new SoccerPlayer();
        soccerPlayer2.setmName("YO2");

        SoccerPlayer soccerPlayer3 = new SoccerPlayer();
        soccerPlayer3.setmName("YO3");

        SoccerPlayer soccerPlayer4 = new SoccerPlayer();
        soccerPlayer4.setmName("YO4");

        List<SoccerPlayer> soccerPlayers = new ArrayList<>();
        soccerPlayers.add(soccerPlayer1);
        soccerPlayers.add(soccerPlayer2);
        soccerPlayers.add(soccerPlayer3);
        soccerPlayers.add(soccerPlayer4);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mSectionedRecyclerViewAdapter);

        mSectionedRecyclerViewAdapter.replace(soccerPlayers);
    }

}
