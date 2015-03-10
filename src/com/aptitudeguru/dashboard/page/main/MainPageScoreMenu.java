package com.aptitudeguru.dashboard.page.main;

import com.aptitudeguru.dashboard.TestScore;
import com.aptitudeguru.dashboard.cppscore;
import com.aptitudeguru.dashboard.cscore;
import com.aptitudeguru.dashboard.javascore;
import com.aptitudeguru.dashboard.quantsscore;
import com.aptitudeguru.dashboard.vlscore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class MainPageScoreMenu extends MainPage_Base {
	private Button b1;
	
	private void bindButton(Button btn, final String cat, final Class<?> act) {
		if(cat == null) {
			btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent i = new Intent(getApplicationContext(), act);
					startActivity(i);
				}
			});
		}
		else {
			btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent i = new Intent(getApplicationContext(), act);
					i.putExtra("cat", cat);
					startActivity(i);
				}
			});
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//HighlightPoint
		super.onCreate(savedInstanceState, R.layout.scoremenu);
		super.btn_score.setOnClickListener(null);
//		
		Button btn_quants = (Button) findViewById(R.id.btn_score_quants);
		Button btn_vl = (Button) findViewById(R.id.btn_score_verbal);
		Button btn_c = (Button) findViewById(R.id.btn_score_c);
		Button btn_cpp = (Button) findViewById(R.id.btn_score_cpp);
		Button btn_java = (Button) findViewById(R.id.btn_score_java);
		Button btn_os = (Button) findViewById(R.id.btn_score_os);
		Button btn_dbms = (Button) findViewById(R.id.btn_score_dbms);
		Button btn_dsa = (Button) findViewById(R.id.btn_score_datastructure);
		Button btn_html = (Button) findViewById(R.id.btn_score_html);
		Button btn_allinone = (Button) findViewById(R.id.btn_score_allinone);

		btn_quants.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), quantsscore.class);
				startActivity(i);
			}
		});
		
		btn_vl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), vlscore.class);
				startActivity(i);
			}
		});
		
		btn_c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), cscore.class);
				startActivity(i);
			}
		});
		
		btn_java.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), javascore.class);
				startActivity(i);
			}
		});

		btn_cpp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), cppscore.class);
				startActivity(i);
			}
		});

		btn_os.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String cat = "os";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
		
		btn_dbms.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String cat = "dbms";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		btn_dsa.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String cat = "dsa";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

		btn_html.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String cat = "html";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
		
		btn_allinone.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String cat = "allinone";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	}

}
