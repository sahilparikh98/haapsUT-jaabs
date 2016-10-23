package com.jaabs.alanzeng.happsut;

import com.onesignal.OneSignal;
import android.app.Application;
import com.parse.Parse;

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
        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("happsut1").server("https://happsut-jaabs-server.herokuapp.com/parse").build());


    }

}
