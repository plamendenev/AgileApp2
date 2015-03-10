package com.aptitudeguru.dashboard.junit;

import java.util.List;
import com.aptitudeguru.dashboard.TestPagevl;
import com.aptitudeguru.dashboard.showscorevl;
import com.aptitudeguru.dashboard.lib.DatabaseHandler;
import com.aptitudeguru.dashboard.model.TestModelFavourite;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.test.InstrumentationTestCase;
import android.test.TouchUtils;
import android.util.Log;
import android.widget.Button;
import androidhive.dashboard.R;

public class JUnit_VL_ResultView extends InstrumentationTestCase {

	ActivityMonitor monitor;
	Activity app;
	
	//User's Ans
	int[] ans = {
			1, 1, 1, 1, 2, 2, 2, 2, 3, 3,
			3, 3, 4, 4, 4, 4, 0, 0, 0, 0,
			1, 1, 1, 1, 2, 2, 2, 2, 3, 3,
			3, 3, 4, 4, 4, 4, 0, 0, 0, 0,
			};
	//Correct Ans
	int[] givenans = {
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1
			};

	int[] a = {
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1
			};
	
	@Override
	protected void setUp() throws Exception {
		monitor = this.getInstrumentation().addMonitor((IntentFilter)null, null, false);
		Intent i = new Intent(this.getInstrumentation().getContext(), showscorevl.class);
		i.putExtra("cat", "v1");
		i.putExtra("test", "testing");
		i.putExtra("score", ans);
		i.putExtra("givenans", givenans);
		i.putExtra("allid", a);
		i.putExtra("tt", "12.12");
		i.putExtra("category", "v1");
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		app = this.getInstrumentation().startActivitySync(i);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (app != null) {
			app.finish();
			app = null;
		}
	}
	
	private Activity getLastActivity() {
		return monitor.getLastActivity();
	}
	
	private String getLastActivityClassName() {
		return this.getLastActivity().getClass().getName();
	}

	@SuppressLint("NewApi")
	public void testActivities() throws Exception {

		Button btn_score1 = (Button) app.findViewById(R.id.score1);
		Button btn_score2 = (Button) app.findViewById(R.id.score2);
		Button btn_score3 = (Button) app.findViewById(R.id.score3);
		Button btn_score4 = (Button) app.findViewById(R.id.score4);
		Button btn_score5 = (Button) app.findViewById(R.id.score5);
		Button btn_score6 = (Button) app.findViewById(R.id.score6);
		Button btn_score7 = (Button) app.findViewById(R.id.score7);
		Button btn_score8 = (Button) app.findViewById(R.id.score8);
		Button btn_score9 = (Button) app.findViewById(R.id.score9);
		Button btn_score10 = (Button) app.findViewById(R.id.score10);
		Button btn_score11 = (Button) app.findViewById(R.id.score11);
		Button btn_score12 = (Button) app.findViewById(R.id.score12);
		Button btn_score13 = (Button) app.findViewById(R.id.score13);
		Button btn_score14 = (Button) app.findViewById(R.id.score14);
		Button btn_score15 = (Button) app.findViewById(R.id.score15);
		Button btn_score16 = (Button) app.findViewById(R.id.score16);
		Button btn_score17 = (Button) app.findViewById(R.id.score17);
		Button btn_score18 = (Button) app.findViewById(R.id.score18);
		Button btn_score19 = (Button) app.findViewById(R.id.score19);
		Button btn_score20 = (Button) app.findViewById(R.id.score20);
		
		assertEquals(Color.GREEN , ((ColorDrawable)btn_score1.getBackground()).getColor());
		assertEquals(Color.GREEN , ((ColorDrawable)btn_score2.getBackground()).getColor());
		assertEquals(Color.GREEN , ((ColorDrawable)btn_score3.getBackground()).getColor());
		assertEquals(Color.GREEN , ((ColorDrawable)btn_score4.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score5.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score6.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score7.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score8.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score9.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score10.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score11.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score12.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score13.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score14.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score15.getBackground()).getColor());
		assertEquals(Color.RED , ((ColorDrawable)btn_score16.getBackground()).getColor());
		assertEquals(Color.BLUE , ((ColorDrawable)btn_score17.getBackground()).getColor());
		assertEquals(Color.BLUE , ((ColorDrawable)btn_score18.getBackground()).getColor());
		assertEquals(Color.BLUE , ((ColorDrawable)btn_score19.getBackground()).getColor());
		assertEquals(Color.BLUE , ((ColorDrawable)btn_score20.getBackground()).getColor());
	}

}
