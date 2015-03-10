package com.aptitudeguru.dashboard.page.main;

import com.aptitudeguru.dashboard.tutorial.HyperTutorialPDFReader;
import com.aptitudeguru.dashboard.tutorial.TutorialMenuQuantitative;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import androidhive.dashboard.R;

public class MainPageTutorial extends MainPage_Base implements OnTouchListener {

	final static float STEP = 200;
	TextView mytv;
	float mRatio = 1.0f;
	int mBaseDist;
	float mBaseRatio;
	float fontsize = 13;

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getPointerCount() == 2) {
			int action = event.getAction();
			int pureaction = action & MotionEvent.ACTION_MASK;
			if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
				mBaseDist = getDistance(event);
				mBaseRatio = mRatio;
			} else {
				float delta = (getDistance(event) - mBaseDist) / STEP;
				float multi = (float) Math.pow(2, delta);
				mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
				mytv.setTextSize(mRatio + 13);
			}
		}
		return true;
	}

	int getDistance(MotionEvent event) {
		int dx = (int) (event.getX(0) - event.getX(1));
		int dy = (int) (event.getY(0) - event.getY(1));
		return (int) (Math.sqrt(dx * dx + dy * dy));
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		return false;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.tutorial_layout);
		super.btn_tutorial.setOnClickListener(null);

		Button btn_quants = (Button) findViewById(R.id.btn_score_quants);
		
		btn_quants.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), TutorialMenuQuantitative.class);
				startActivity(i);
			}
		});
		
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_c, "ctuts.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_cpp, "cpp.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_java, "java.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_html, "HTML.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_os, "OS.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_dbms, "database.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_datastructure, "DataStructure.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_score_interview, "Interview.pdf");
	}

}
