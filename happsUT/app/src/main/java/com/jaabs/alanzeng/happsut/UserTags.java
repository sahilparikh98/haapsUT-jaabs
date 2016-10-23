package com.jaabs.alanzeng.happsut;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseRelation;
import com.parse.ParseUser;

/**
 * Created by sparikh98 on 10/23/16.
 */

@ParseClassName("UserTags")
public class UserTags extends ParseObject {

    private ParseRelation<Tag> toTags;
    private ParseUser ofUser;

    public UserTags() {
    }

    public void addTag(Tag tag)
    {
        toTags.add(tag);
    }

    public void setOfUser(ParseUser user)
    {
        put("ofUser", user);
    }



}
