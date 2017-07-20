package com.reactbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by @iamBedant on 03/05/17.
 */

public class NavigationModule extends ReactContextBaseJavaModule {

    public NavigationModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }



    @Override
    public String getName() {
        return "AndroidRouting";
    }

    @ReactMethod
    public void launchNativeActivity(String extraString){
        Intent intent = new Intent(getCurrentActivity(),ActivityTwo.class);
        intent.putExtra("extraString",extraString);
        getCurrentActivity().startActivity(intent);
    }
}
