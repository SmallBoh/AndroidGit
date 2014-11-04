package com.example.fragment_one;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;




public class MainActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_main);
		ImageView img  = (ImageView) findViewById(TRIM_MEMORY_UI_HIDDEN);
				
	}


}
