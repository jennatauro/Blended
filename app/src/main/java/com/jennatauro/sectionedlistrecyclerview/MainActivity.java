package com.jennatauro.sectionedlistrecyclerview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jennatauro.sectionedlistrecyclerview.models.HockeyPlayer;
import com.jennatauro.sectionedlistrecyclerview.models.SectionListItemObject;
import com.jennatauro.sectionedlistrecyclerview.models.SoccerPlayer;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity<T extends SectionListItemObject> extends ActionBarActivity {

    RecyclerView mRecyclerView;

    SectionedRecyclerViewAdapter mSectionedRecyclerViewAdapter;

    List<T> mPlayers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPlayersList();

        mSectionedRecyclerViewAdapter = new SectionedRecyclerViewAdapter();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mSectionedRecyclerViewAdapter);
        mRecyclerView.addItemDecoration(new StickyRecyclerHeadersDecoration(mSectionedRecyclerViewAdapter));

        mSectionedRecyclerViewAdapter.replace(mPlayers);
    }

    private void setupPlayersList() {

        SoccerPlayer soccerPlayer1 = new SoccerPlayer();
        soccerPlayer1.setmName("Lionel Messi");
        soccerPlayer1.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer2 = new SoccerPlayer();
        soccerPlayer2.setmName("Cristiano Ronaldo");
        soccerPlayer2.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer3 = new SoccerPlayer();
        soccerPlayer3.setmName("Neymar Jr");
        soccerPlayer3.setListItemResource(R.layout.list_item_soccer_player);

        SoccerPlayer soccerPlayer4 = new SoccerPlayer();
        soccerPlayer4.setmName("James Rodriguez");
        soccerPlayer4.setListItemResource(R.layout.list_item_soccer_player);

        mPlayers.add((T) soccerPlayer1);
        mPlayers.add((T) soccerPlayer2);
        mPlayers.add((T) soccerPlayer3);
        mPlayers.add((T) soccerPlayer4);

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer();
        hockeyPlayer1.setmName("Sidney Crosby");
        hockeyPlayer1.setListItemResource(R.layout.list_item_hockey_player);

        HockeyPlayer hockeyPlayer2 = new HockeyPlayer();
        hockeyPlayer2.setmName("Wayne Gretzky");
        hockeyPlayer2.setListItemResource(R.layout.list_item_hockey_player);

        HockeyPlayer hockeyPlayer3 = new HockeyPlayer();
        hockeyPlayer3.setmName("Alexander Ovechkin");
        hockeyPlayer3.setListItemResource(R.layout.list_item_hockey_player);

        HockeyPlayer hockeyPlayer4 = new HockeyPlayer();
        hockeyPlayer4.setmName("Bobby Orr");
        hockeyPlayer4.setListItemResource(R.layout.list_item_hockey_player);

        mPlayers.add((T) hockeyPlayer1);
        mPlayers.add((T) hockeyPlayer2);
        mPlayers.add((T) hockeyPlayer3);
        mPlayers.add((T) hockeyPlayer4);

    }

}
