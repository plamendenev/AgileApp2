package com.aptitudeguru.dashboard.page.main;

import android.os.Bundle;
import androidhive.dashboard.R;

public class MainPageHelp extends MainPage_Base {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		//HighlightPoint
		super.onCreate(savedInstanceState, R.layout.help);
		super.btn_help.setOnClickListener(null);
	}

}
