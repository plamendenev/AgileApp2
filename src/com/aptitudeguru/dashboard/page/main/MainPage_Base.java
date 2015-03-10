package com.aptitudeguru.dashboard.page.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class MainPage_Base extends Activity {

	Button btn_home;
	Button btn_fav;
	Button btn_score;
	Button btn_tutorial;
	Button btn_about;
	Button btn_help;
	
	public void onCreate(Bundle savedInstanceState, int layoutResID) {
		super.onCreate(savedInstanceState);
		this.setContentView(layoutResID);

		btn_home = (Button) findViewById(R.id.btn_home);
		btn_fav = (Button) findViewById(R.id.btn_fav);
		btn_score = (Button) findViewById(R.id.btn_score);
		btn_tutorial = (Button) findViewById(R.id.btn_soundon);
		btn_about = (Button) findViewById(R.id.btn_about);
		btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageHome.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		btn_fav.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageFavourite.class);
//				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		btn_score.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageScoreMenu.class);
//				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		btn_tutorial.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageTutorial.class);
//				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		btn_about.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageAboutUs.class);
//				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		btn_help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), MainPageHelp.class);
//				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

	}
}
