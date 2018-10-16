package com.example.nbhung318.btreadbook.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nbhung318.btreadbook.R;
import com.example.nbhung318.btreadbook.entity.StoryWorld;
import com.example.nbhung318.btreadbook.view.OnItemClickListener;

import java.util.List;

public class StoryWorldAdapter extends RecyclerView.Adapter<StoryWorldAdapter.ViewHolder> {
    private OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    private LayoutInflater inflater;
    private Context context;
    private List<StoryWorld> storiesWorlds;

    public StoryWorldAdapter(Context context, List<StoryWorld> storiesWorlds){
        this.context = context;
        this.storiesWorlds = storiesWorlds;
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
        StoryWorld storyWorld = storiesWorlds.get(position);
        viewHolder.imgAvatar.setImageResource(storyWorld.getImage());
        viewHolder.txtNameStory.setText(storyWorld.getNameStory());
        viewHolder.txtStyle.setText(storyWorld.getStyle());
        Log.d("Main", "onBindViewHolder: " + storyWorld.getImage() + storyWorld.getStyle());
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
        return storiesWorlds.size();
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
