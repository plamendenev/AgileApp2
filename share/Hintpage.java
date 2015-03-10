package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import androidhive.dashboard.R;

public class Hintpage extends Activity {
	TextView t1, t2;
	String ques, op1, op2, op3, op4, sol;
	int a[] = new int[100];
	int index, current, id;
	final Context context = this;
	DatabaseHandler db = new DatabaseHandler(this);

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
			setContentView(R.layout.hint);
			t1 = (TextView) findViewById(R.id.quest_1);
			t2 = (TextView) findViewById(R.id.solution);
			Button btn_home = (Button) findViewById(R.id.btn_home);

			
			Button btn_score = (Button) findViewById(R.id.btn_score);

			
			Button btn_help = (Button) findViewById(R.id.btn_about);
			
			btn_help.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
						Help.class);

					startActivity(i);
				}
			});

			btn_home.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							AndroidDashboardDesignActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
				}
			});

			
			btn_score.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
				 
					Intent i = new Intent(getApplicationContext(),
							scoremenu.class);
					startActivity(i);
				}
			});

		
			

			

		

			

			
			
				
				Hint f = db.getHint(id);
				
				
				sol = f.getSol();
				t1.setText(ques);
				t2.setText("solution :" + sol);


		}

	}
