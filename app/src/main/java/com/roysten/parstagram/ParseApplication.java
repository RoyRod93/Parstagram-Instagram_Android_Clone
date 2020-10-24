package com.roysten.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your Parse Model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mkn6DabHFTywtpyz57NwGrRBN3CQYGls6GS6fCDZ")
                .clientKey("gHohJUwxmIOIyG0KxgXuV8Mud3zms1LwaDmyxMdA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
