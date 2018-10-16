package com.example.nbhung318.btreadbook.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nbhung318.btreadbook.R;
import com.example.nbhung318.btreadbook.entity.Story;
import com.example.nbhung318.btreadbook.entity.StoryManager;
import com.example.nbhung318.btreadbook.view.OnItemClickListener;
import com.example.nbhung318.btreadbook.view.adapter.StoryVietNamAdapter;

public class StoryVietNamActivity extends AppCompatActivity implements OnItemClickListener{
    private RecyclerView rcvStoryVietNam;
    private StoryVietNamAdapter storyAdapter;
    private StoryManager storyManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_vietnam);
        initComponent();
    }

    public void initComponent() {
        rcvStoryVietNam = findViewById(R.id.rcvStoryVietNam);
        storyManager = new StoryManager();
        storyManager.addStoryVietNam();
        storyAdapter = new StoryVietNamAdapter(this,storyManager.getStoriesVietNam());

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcvStoryVietNam.setAdapter(storyAdapter);
        rcvStoryVietNam.setLayoutManager(layoutManager);

        storyAdapter.setOnItemClickListener(this);
    }


    @Override
    public void onItemClicked(int position) {
        Story story = storyManager.getStoriesVietNam().get(position);
        Intent intent = new Intent(StoryVietNamActivity.this, DetailsActivity.class);
        intent.putExtra("a",story);
        startActivity(intent);
    }
}
