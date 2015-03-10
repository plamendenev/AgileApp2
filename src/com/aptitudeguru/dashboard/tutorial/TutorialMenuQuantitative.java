package com.aptitudeguru.dashboard.tutorial;

import com.aptitudeguru.dashboard.page.main.MainPage_Base;

import android.os.Bundle;
import androidhive.dashboard.R;

public class TutorialMenuQuantitative extends MainPage_Base {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.news_feed_layout);
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q1, "sec1.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q2, "sec2.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q4, "sec4.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q5, "sec5.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q6, "sec6.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q7, "sec7.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q8, "sec8.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q10, "sec10.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q11, "sec11.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q12, "sec12.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q13, "sec13.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q15, "sec15.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q16, "sec16.pdf");
		HyperTutorialPDFReader.bindPDFButton(this, R.id.btn_q17, "sec17.pdf");
	}

}
