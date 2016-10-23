package com.jaabs.alanzeng.happsut;

import com.onesignal.OneSignal;
import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by sparikh98 on 10/22/16.
 */

/**
 * @author sparikh98
 * a class that creates the main application's internet connected activity
 */
public class happsUTApplication extends Application {
    public void onCreate()
    {
        super.onCreate();
        OneSignal.startInit(this).init();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Post.class);
        ParseObject.registerSubclass(PostTags.class);
        ParseObject.registerSubclass(Tag.class);
        ParseObject.registerSubclass(UserTags.class);
        Parse.Configuration config = new Parse.Configuration.Builder(getApplicationContext()).applicationId("happsut1").server("https://happsut-jaabs-server.herokuapp.com/parse").build();
        Parse.initialize(config);


        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);

    }

}
