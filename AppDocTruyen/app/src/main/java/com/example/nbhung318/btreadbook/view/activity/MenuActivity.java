package com.example.nbhung318.btreadbook.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.nbhung318.btreadbook.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cvStoryVietNam;
    CardView cvStoryWorld;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponent();
    }

    private void initComponent() {
        cvStoryVietNam = findViewById(R.id.cvStoryVietNam);
        cvStoryWorld = findViewById(R.id.cvStoryWorld);

        cvStoryVietNam.setOnClickListener(this);
        cvStoryWorld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cvStoryVietNam:
                Intent intentStoryVN = new Intent(MenuActivity.this,StoryVietNamActivity.class);
                startActivity(intentStoryVN);
                break;
            case R.id.cvStoryWorld:
                Intent intentStoryWorld = new Intent(MenuActivity.this,StoryWorldActivity.class);
                startActivity(intentStoryWorld);
                break;
            default:
                break;
        }
    }
}
