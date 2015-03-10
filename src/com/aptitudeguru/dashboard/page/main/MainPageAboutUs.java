package com.aptitudeguru.dashboard.page.main;

import android.os.Bundle;
import androidhive.dashboard.R;

public class MainPageAboutUs extends MainPage_Base {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		//HighlightPoint
		super.onCreate(savedInstanceState, R.layout.aboutus);
		super.btn_about.setOnClickListener(null);
	}

}
