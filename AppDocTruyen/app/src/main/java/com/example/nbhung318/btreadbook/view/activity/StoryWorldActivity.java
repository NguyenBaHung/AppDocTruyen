package com.example.nbhung318.btreadbook.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.nbhung318.btreadbook.R;
import com.example.nbhung318.btreadbook.entity.Story;
import com.example.nbhung318.btreadbook.entity.StoryManager;
import com.example.nbhung318.btreadbook.entity.StoryWorld;
import com.example.nbhung318.btreadbook.view.OnItemClickListener;
import com.example.nbhung318.btreadbook.view.adapter.StoryWorldAdapter;

public class StoryWorldActivity extends AppCompatActivity implements OnItemClickListener{
    private RecyclerView rcvStoryWorld;
    private StoryWorldAdapter storyWorldAdapter;
    private StoryManager storyManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_world);
        initComponent();
    }

    public void initComponent() {
        rcvStoryWorld = findViewById(R.id.rcvStoryWorld);
        storyManager = new StoryManager();
        storyManager.addStoryWorld();
        storyWorldAdapter = new StoryWorldAdapter(this,storyManager.getStoriesWorld());
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcvStoryWorld.setAdapter(storyWorldAdapter);
        rcvStoryWorld.setLayoutManager(layoutManager);

        storyWorldAdapter.setOnItemClickListener(this);
    }


    @Override
    public void onItemClicked(int position) {
        Story storyWorld = storyManager.getStoriesWorld().get(position);
        Intent intent = new Intent(StoryWorldActivity.this, DetailsActivity.class);
        intent.putExtra("a",storyWorld);
        startActivity(intent);
    }

}
