package com.jaabs.alanzeng.happsut;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by sparikh98 on 10/23/16.
 */

@ParseClassName("Tag")
public class Tag extends ParseObject {

    public Tag(){

    }

    public void setTagName(String name)
    {
        put("tagName", name);
    }
}
