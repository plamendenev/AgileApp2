package com.aptitudeguru.dashboard.page.test;

import com.aptitudeguru.dashboard.TestPage;
import com.aptitudeguru.dashboard.page.main.MainPage_Base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class TestChooiceQuantitative extends MainPage_Base {
	
	private void bindQButton(Button btn, final String cat) {
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), TestPage.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.news_feed_layout);
		if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
			// Activity was brought to front and not created,
			// Thus finishing this will get us to the last viewed activity
			finish();
			return;
		}

		//HighlightPoint
		Button btn_q1 = (Button) findViewById(R.id.btn_q1);
		Button btn_q2 = (Button) findViewById(R.id.btn_q2);
		Button btn_q4 = (Button) findViewById(R.id.btn_q4);
		Button btn_q5 = (Button) findViewById(R.id.btn_q5);
		Button btn_q6 = (Button) findViewById(R.id.btn_q6);
		Button btn_q7 = (Button) findViewById(R.id.btn_q7);
		Button btn_q8 = (Button) findViewById(R.id.btn_q8);
		Button btn_q10 = (Button) findViewById(R.id.btn_q10);
		Button btn_q11 = (Button) findViewById(R.id.btn_q11);
		Button btn_q12 = (Button) findViewById(R.id.btn_q12);
		Button btn_q13 = (Button) findViewById(R.id.btn_q13);
		Button btn_q15 = (Button) findViewById(R.id.btn_q15);
		Button btn_q16 = (Button) findViewById(R.id.btn_q16);
		Button btn_q17 = (Button) findViewById(R.id.btn_q17);

		bindQButton(btn_q1, "q1");
		bindQButton(btn_q2, "q2");
		bindQButton(btn_q4, "q4");
		bindQButton(btn_q5, "q5");
		bindQButton(btn_q6, "q6");
		bindQButton(btn_q7, "q7");
		bindQButton(btn_q8, "q8");
		bindQButton(btn_q10, "q10");
		bindQButton(btn_q11, "q11");
		bindQButton(btn_q12, "q12");
		bindQButton(btn_q13, "q13");
		bindQButton(btn_q15, "q15");
		bindQButton(btn_q16, "q16");
		bindQButton(btn_q17, "q17");

	}

}
