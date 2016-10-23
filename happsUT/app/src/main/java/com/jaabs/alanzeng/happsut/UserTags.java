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

    private String tag;
    private String email;

    public UserTags() {
    }

    public void setTag(String tag)
    {
        put("tag", tag);
    }

    public void setOfUser(String user)
    {
        put("userEmail", user);
    }



}
