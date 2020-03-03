package com.example.vkontakte_recyclerview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import android.os.Build;

public class FeedModel{
    private String Name;
    private String Time;
    private String postText;
    private String likes;
    private int uploaderpic;
    private int postpic;
    private String comments;
    private String shares;
    private String views;



    public FeedModel(String name, String time,String postText, String likes, int uploaderpic,int postpic,String comments,String shares,String views) {
        Name = name;
        Time = time;
        this.postText = postText;
        this.likes = likes;
        this.uploaderpic = uploaderpic;
        this.postpic = postpic;
        this.comments = comments;
        this.shares = shares;
        this.views = views;
    }


    @RequiresApi(api = Build.VERSION_CODES.Q)
    protected FeedModel(Parcel in){
        this.Name = in.readString();
        this.Time = in.readString();
        this.postText = in.readString();
        this.likes = in.readString();
        this.uploaderpic = in.readInt();
        this.postpic = in.readInt();
        this.comments = in.readString();
        this.shares = in.readString();
        this.views = in.readString();


    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public void writeToParcel(Parcel dest,int flags){
        dest.writeString(this.Name);
        dest.writeString(this.Time);
        dest.writeString(this.postText);
        dest.writeString(this.likes);
        dest.writeInt(this.uploaderpic);
        dest.writeInt(this.postpic);
        dest.writeString(this.comments);
        dest.writeString(this.shares);
        dest.writeString(this.views);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPostText(){
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }


    public int getUploaderpic() {
        return uploaderpic;
    }

    public void setUploaderpic(int uploaderpic) {
        this.uploaderpic = uploaderpic;
    }

    public int getPostpic() {
        return postpic;
    }

    public void setPostpic(int postpic) {
        this.postpic = postpic;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }
}
