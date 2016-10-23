package com.jaabs.alanzeng.happsut;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseRelation;
import com.parse.ParseUser;

/**
 * Created by sparikh98 on 10/23/16.
 */

@ParseClassName("PostTags")
public class PostTags extends ParseObject {

    private ParseRelation<Tag> toTags;
    private ParseUser ofOrg;

    public PostTags() {
    }

    public void addTag(Tag tag)
    {
        toTags.add(tag);
    }

    public void setOfOrg(ParseUser user) {
        put("ofOrg", user);
    }
}
