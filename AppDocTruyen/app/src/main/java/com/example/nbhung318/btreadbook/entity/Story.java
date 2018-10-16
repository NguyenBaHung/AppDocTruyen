package com.example.nbhung318.btreadbook.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class Story implements Serializable {
    protected int image;
    protected String nameStory;
    protected String content;
    protected String style;

    public Story(int image, String nameStory, String content, String style) {
        this.image = image;
        this.nameStory = nameStory;
        this.content = content;
        this.style = style;
    }

    public abstract String getStyle();

    public abstract void setStyle(String style);

    public abstract int getImage();

    public abstract void setImage(int image);

    public abstract String getNameStory();

    public abstract void setNameStory(String nameStory);


    public abstract String getContent();

    public abstract void setContent(String content);
}
