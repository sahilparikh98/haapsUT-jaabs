package com.jaabs.alanzeng.happsut;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by sparikh98 on 10/22/16.
 */

@ParseClassName("Post")
public class Post extends ParseObject {

    //private Tags postTags;

    public Post()
    {

    }

    public void setStartTime(int startTime) {
        put("startTime", startTime);
    }

    public void setEndTime(int endTime) {
        put("endTime", endTime);
    }

    public void setDescription(String description) {
        put("description", description);
    }

    public void setFromOrg(ParseUser fromOrg) {
        put("fromOrg", fromOrg);
    }

    public void setLocation(String location) {
        put("location", location);
    }

    public void setDate(int date) {
        put("date", date);
    }

    public void setName(String name) {
        put("name", name);
    }

    public void setPostTags(PostTags postTags) {
        put("toTags", postTags);
    }
}
