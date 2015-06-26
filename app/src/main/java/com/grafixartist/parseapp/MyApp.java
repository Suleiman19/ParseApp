package com.grafixartist.parseapp;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by Suleiman on 24-06-2015.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "Application ID", "Client Key");
        FacebookSdk.sdkInitialize(getApplicationContext());
        ParseFacebookUtils.initialize(this);
    }

}
