package com.example.nbhung318.btreadbook.entity;

public class StoryWorld extends Story {

    public StoryWorld(int image, String nameStory, String content, String style) {
        super(image, nameStory, content, style);
    }

    @Override
    public String getStyle() {
        return style;
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public int getImage() {
        return image;
    }

    @Override
    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String getNameStory() {
        return nameStory;
    }

    @Override
    public void setNameStory(String nameStory) {
        this.nameStory = nameStory;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
