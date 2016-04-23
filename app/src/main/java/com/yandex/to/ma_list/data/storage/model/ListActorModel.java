package com.yandex.to.ma_list.data.storage.model;

import android.graphics.drawable.Drawable;

public class ListActorModel {
    private String mName;
    private String mTags;
    private Drawable mImage;
    private String mInfo;

    public ListActorModel(String mName, String mTags, Drawable mImage, String mInfo){
        this.mName = mName;
        this.mTags = mTags;
        this.mImage = mImage;
        this.mInfo = mInfo;
    }

    public String getName(){
        return mName;
    }
    public String getTags(){
        return mTags;
    }
    public Drawable getImage(){
        return mImage;
    }
    public String getInfo(){
        return mInfo;
    }
}
