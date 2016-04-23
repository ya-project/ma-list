package com.yandex.to.ma_list.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yandex.to.ma_list.R;
import com.yandex.to.ma_list.data.storage.model.ListActorModel;
import com.yandex.to.ma_list.ui.adapters.ListActorAdapter;

import java.util.ArrayList;

public class ActorsListActivity extends AppCompatActivity {

    RecyclerView mRecycler;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    ArrayList<ListActorModel> mActors = new ArrayList<ListActorModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actors_list);

        generateData();

        mRecycler = (RecyclerView) findViewById(R.id.actors_recycler);

        mLayoutManager = new LinearLayoutManager(this);
        mRecycler.setLayoutManager(mLayoutManager);

        mAdapter = new ListActorAdapter(mActors);
        mRecycler.setAdapter(mAdapter);
    }

    private void generateData(){
        for(int i = 1; i <= 10; i++)
            mActors.add(new ListActorModel("Test man", "hip-hope, dance, something", getResources().getDrawable(R.drawable.real_av), "4 альбома, 9 песен"));
    }
}
