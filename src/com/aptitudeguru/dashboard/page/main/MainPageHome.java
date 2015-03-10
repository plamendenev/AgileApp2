package com.aptitudeguru.dashboard.page.main;

import android.annotation.SuppressLint;
import android.app.AlertDialog;

import java.io.*;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;

import com.aptitudeguru.dashboard.AllInOne;
import com.aptitudeguru.dashboard.ComputerFundamentals;
import com.aptitudeguru.dashboard.Language;
import com.aptitudeguru.dashboard.Puzzles;
import com.aptitudeguru.dashboard.lib.DatabaseHandler;
import com.aptitudeguru.dashboard.page.test.TestChooiceQuantitative;
import com.aptitudeguru.dashboard.page.test.TestChooiceVerbal;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class MainPageHome extends MainPage_Base {
	
//	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "aptitudedatabase";
//	private static final String TABLE_QUANTS = "quants";
	
	final Context context = this;

	private static void copydb(InputStream inputstream, OutputStream outputStream) throws IOException {
		byte[] buffer = new byte[1024];
		int length = 0;
		while ((length = inputstream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		inputstream.close();
		outputStream.close();
	}

	@Override
	public void onBackPressed() {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		TextView title = new TextView(context);
		title.setText("Aptitude App");
		title.setBackgroundColor(Color.DKGRAY);
		title.setPadding(10, 10, 10, 10);
		title.setGravity(Gravity.CENTER);
		title.setTextColor(Color.WHITE);
		title.setTextSize(20);
		alertDialogBuilder.setCustomTitle(title);
		alertDialogBuilder.setMessage("Click yes to exit!").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int id) {

				finish();
				System.exit(0);

			}
		}).setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int id) {

				dialog.cancel();
			}
		});
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}

	@SuppressLint("SdCardPath")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		//HighlightPoint
		super.onCreate(savedInstanceState, R.layout.dashboard_layout);
		super.btn_home.setOnClickListener(null);

//		DatabaseHandler db = new DatabaseHandler(this);
		new DatabaseHandler(this);
		try {
			String datapath = "/data/data/" + getPackageName() + "/databases";
			File f = new File(datapath);
			if (!f.exists()) {
				f.mkdirs();
				f.createNewFile();
				copydb(getBaseContext().getAssets().open(DATABASE_NAME), new FileOutputStream(datapath + "/" + DATABASE_NAME));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Button btn_quants = (Button) findViewById(R.id.btn_quants);
		Button btn_language = (Button) findViewById(R.id.btn_language);
		Button btn_verbal = (Button) findViewById(R.id.btn_verbal);
		Button btn_compfun = (Button) findViewById(R.id.btn_compfun);
		Button btn_puzzles = (Button) findViewById(R.id.btn_puzzles);
		Button btn_allinone = (Button) findViewById(R.id.btn_allinone);

		btn_quants.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), TestChooiceQuantitative.class);
				startActivity(i);
			}
		});

		btn_language.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), Language.class);
				startActivity(i);
			}
		});

		btn_verbal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), TestChooiceVerbal.class);
				startActivity(i);
			}
		});

		btn_compfun.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), ComputerFundamentals.class);
				startActivity(i);
			}
		});

		btn_puzzles.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), Puzzles.class);
				startActivity(i);
//				Intent intent = new Intent(getApplicationContext(), Tutorial.class);
////				Log.e("CAO!!!", getFilesDir().getAbsolutePath());
//			    intent.putExtra(Tutorial.EXTRA_PDFFILENAME, getFilesDir().getAbsolutePath() + "/ctuts.pdf");
//			    startActivity(intent);
			}
		});

		btn_allinone.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), AllInOne.class);
				startActivity(i);
			}
		});

		//
		// db.addClanguage(new
		// CTable("Which of the following is the correct order of evaluation for the below expression?z = x + y * z / 4 % 2 - 1","c3","* / % + - =","	= * / % + -","	/ * % - + =	D.	* % / - + =","A"));

		// db.addClanguage(new
		// CTable("Which of the following correctly shows the hierarchy of arithmetic operations in C?","c4","	/ + * -	","	* - / ","	+ - / *	","/ * + -","D"));

		// db.addClanguage(new
		// CTable("Which of the following is the correct usage of conditional operators used in C?","c4","a>b ? c=30 : c=40;","	a>b ? c=30;","max = a>b ? a>c?a:c:b>c?b:c","return (a>b)?(a:b)","C"));

		// db.addClanguage(new
		// CTable("Which of the following is the correct order if calling functions in the below code?a = f1(23, 14) * f2(12/4) + f3();","c4","f1, f2, f3","f3, f2, f1","Order may vary from compiler to compiler","None of above","C"));

		// db.addClanguage(new
		// CTable("Which of the following are unary operators in C?1.	!  2.	sizeof  3.	~  4.	&&","c4","	1, 2","	1, 3","2, 4	","1, 2, 3","D"));

	}
}