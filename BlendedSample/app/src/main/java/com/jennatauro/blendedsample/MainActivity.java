package com.jennatauro.blendedsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.jennatauro.blendedlibrary.BlendedRecyclerViewAdapter;
import com.jennatauro.blendedlibrary.ModelViewHolder;
import com.jennatauro.blendedsample.models.BasketballPlayer;
import com.jennatauro.blendedsample.models.HockeyPlayer;
import com.jennatauro.blendedsample.models.SoccerPlayer;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity<T extends ModelViewHolder> extends ActionBarActivity {

    RecyclerView mRecyclerView;

    BlendedRecyclerViewAdapter mBlendedRecyclerViewAdapter;

    List<T> mPlayers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPlayersList();

        mBlendedRecyclerViewAdapter = new BlendedRecyclerViewAdapter();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mBlendedRecyclerViewAdapter);
        mRecyclerView.addItemDecoration(new StickyRecyclerHeadersDecoration(mBlendedRecyclerViewAdapter));

        mBlendedRecyclerViewAdapter.replace(mPlayers);
    }

    private void setupPlayersList() {

        SoccerPlayer soccerPlayer1 = new SoccerPlayer();
        soccerPlayer1.setmName("Lionel Messi");

        SoccerPlayer soccerPlayer2 = new SoccerPlayer();
        soccerPlayer2.setmName("Cristiano Ronaldo");

        SoccerPlayer soccerPlayer3 = new SoccerPlayer();
        soccerPlayer3.setmName("Neymar Jr");

        SoccerPlayer soccerPlayer4 = new SoccerPlayer();
        soccerPlayer4.setmName("James Rodriguez");

        mPlayers.add((T) soccerPlayer1);
        mPlayers.add((T) soccerPlayer2);
        mPlayers.add((T) soccerPlayer3);
        mPlayers.add((T) soccerPlayer4);

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer();
        hockeyPlayer1.setmName("Sidney Crosby");

        HockeyPlayer hockeyPlayer2 = new HockeyPlayer();
        hockeyPlayer2.setmName("Wayne Gretzky");

        HockeyPlayer hockeyPlayer3 = new HockeyPlayer();
        hockeyPlayer3.setmName("Alexander Ovechkin");

        HockeyPlayer hockeyPlayer4 = new HockeyPlayer();
        hockeyPlayer4.setmName("Bobby Orr");

        mPlayers.add((T) hockeyPlayer1);
        mPlayers.add((T) hockeyPlayer2);
        mPlayers.add((T) hockeyPlayer3);
        mPlayers.add((T) hockeyPlayer4);

        BasketballPlayer basketballPlayer1 = new BasketballPlayer();
        basketballPlayer1.setmName("Kyle Lowry");

        BasketballPlayer basketballPlayer2 = new BasketballPlayer();
        basketballPlayer2.setmName("Kobe Bryant");

        BasketballPlayer basketballPlayer3 = new BasketballPlayer();
        basketballPlayer3.setmName("LeBron James");

        BasketballPlayer basketballPlayer4 = new BasketballPlayer();
        basketballPlayer4.setmName("Dwight Howard");

        mPlayers.add((T) basketballPlayer1);
        mPlayers.add((T) basketballPlayer2);
        mPlayers.add((T) basketballPlayer3);
        mPlayers.add((T) basketballPlayer4);

    }

}
