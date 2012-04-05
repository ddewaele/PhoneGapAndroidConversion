package com.ecs.phonegap.android.conversion;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class EmployeeDirectoryActivity extends DroidGap {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/employeedirectory/index.html");
    }
	
}