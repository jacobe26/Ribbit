package com.ecosystems.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "MCf7R7XyVJvlNzmVSbAoi1MxSGxYI5wHfj3ciLfh",
                "pk1AVrViW1dnR1cC8jddW6ZzZojq98prgB1VPNAZ");
    }
}
