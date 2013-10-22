package com.example.didyoufeelit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class OpenHoriztonalView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pager_main);
		HorizontalPagerAdapter adapter = new HorizontalPagerAdapter();
		ViewPager myPager = (ViewPager) findViewById(R.id.viewpager);
		myPager.setAdapter(adapter);
		myPager.setCurrentItem(0);
	}
}