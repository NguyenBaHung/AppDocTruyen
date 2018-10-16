package com.example.nbhung318.btreadbook.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nbhung318.btreadbook.R;
import com.example.nbhung318.btreadbook.entity.Story;

import java.io.Serializable;

public class DetailsActivity extends AppCompatActivity {
    private ImageView imgAnh;
    private TextView txtTen;
    private TextView txtNoiDung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initComponent();

    }

    public void initComponent(){
        imgAnh = findViewById(R.id.imgAnh);
        txtTen = findViewById(R.id.txtTen);
        txtNoiDung = findViewById(R.id.txtNoiDung);

        Intent intent = getIntent();
        Story story = (Story) intent.getSerializableExtra("a");
        imgAnh.setImageResource(story.getImage());
        txtTen.setText(story.getNameStory());
        txtNoiDung.setText(story.getContent());

    }
}
