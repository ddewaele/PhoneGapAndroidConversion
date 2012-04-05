package com.ecs.phonegap.android.conversion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button launchRoom12;
	Button launchEmployeeDirectory;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		launchRoom12 = (Button)findViewById(R.id.btn_room12);
		launchEmployeeDirectory = (Button)findViewById(R.id.btn_employeeDirectory);
		
		launchRoom12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), Room12Activity.class));
			}
		});
		
		launchEmployeeDirectory.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), EmployeeDirectoryActivity.class));
			}
		});
		
		
	}
}
