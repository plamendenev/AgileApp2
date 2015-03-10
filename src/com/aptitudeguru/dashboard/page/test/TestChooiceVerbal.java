package com.aptitudeguru.dashboard.page.test;

import com.aptitudeguru.dashboard.TestPagevl;
import com.aptitudeguru.dashboard.page.main.MainPage_Base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class TestChooiceVerbal extends MainPage_Base {
	
	private void bindQButton(Button btn, final String cat) {
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//TODO change class
				Intent i = new Intent(getApplicationContext(), TestPagevl.class);
				i.putExtra("cat", cat);
				i.putExtra("start", 1);
//				i.putExtra("test", "timeouttest");
				startActivity(i);
			}
		});
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.messages_layout);
		
		//HighlightPoint
		Button btn_v1 = (Button) findViewById(R.id.btn_v1);
		Button btn_v2 = (Button) findViewById(R.id.btn_v2);
		Button btn_v3 = (Button) findViewById(R.id.btn_v3);
		Button btn_v4 = (Button) findViewById(R.id.btn_v4);
		Button btn_v5 = (Button) findViewById(R.id.btn_v5);
		Button btn_v6 = (Button) findViewById(R.id.btn_v6);
		Button btn_v7 = (Button) findViewById(R.id.btn_v7);

		bindQButton(btn_v1, "v1");
		bindQButton(btn_v2, "v2");
		bindQButton(btn_v3, "v3");
		bindQButton(btn_v4, "v4");
		bindQButton(btn_v5, "v5");
		bindQButton(btn_v6, "v6");
		bindQButton(btn_v7, "v7");

	}
	
}
