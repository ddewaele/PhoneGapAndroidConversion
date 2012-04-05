package com.ecs.phonegap.android.conversion;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class Room12Activity extends DroidGap {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/room12/index.html");
    }
	
}