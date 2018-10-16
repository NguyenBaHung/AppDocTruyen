package com.example.nbhung318.btreadbook.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nbhung318.btreadbook.R;
import com.example.nbhung318.btreadbook.entity.StoryVietName;
import com.example.nbhung318.btreadbook.view.OnItemClickListener;

import java.util.List;

public class StoryVietNamAdapter extends RecyclerView.Adapter<StoryVietNamAdapter.ViewHolder> {
    private OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    private LayoutInflater inflater;
    private Context context;
    private List<StoryVietName> storiesVietNames;

    public StoryVietNamAdapter(Context context, List<StoryVietName> storiesVietNames){
        this.context = context;
        this.storiesVietNames = storiesVietNames;
        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = inflater.inflate(R.layout.item_story,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        StoryVietName storyVietName = storiesVietNames.get(position);
        viewHolder.imgAvatar.setImageResource(storyVietName.getImage());
        viewHolder.txtNameStory.setText(storyVietName.getNameStory());
        viewHolder.txtStyle.setText(storyVietName.getStyle());
        viewHolder.itemView.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClicked(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return storiesVietNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAvatar;
        private TextView txtNameStory;
        private TextView txtStyle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            txtNameStory = itemView.findViewById(R.id.txtNameStory);
            txtStyle = itemView.findViewById(R.id.txtStyle);
        }
    }

}
