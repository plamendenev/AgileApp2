package com.aptitudeguru.dashboard.junit;

import java.util.List;

import com.aptitudeguru.dashboard.TestPagevl;
import com.aptitudeguru.dashboard.TestPause;
import com.aptitudeguru.dashboard.showscorevl;
import com.aptitudeguru.dashboard.lib.DatabaseHandler;
import com.aptitudeguru.dashboard.model.TestModelFavourite;
import com.aptitudeguru.dashboard.Calender;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.test.InstrumentationTestCase;
import android.test.TouchUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class JUnit_VL_PauseAndResume extends InstrumentationTestCase {

	ActivityMonitor monitor;
	Activity app;

	@Override
	protected void setUp() throws Exception {
		monitor = this.getInstrumentation().addMonitor((IntentFilter)null, null, false);
		Intent intent = new Intent(this.getInstrumentation().getContext(), TestPagevl.class);
		intent.putExtra("cat", "v1");
		intent.putExtra("test", "testing");
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		app = this.getInstrumentation().startActivitySync(intent);
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

	public void testActivities() throws Exception {
		TestPagevl tpvl = (TestPagevl) app;
		Button button = (Button) app.findViewById(R.id.btn_pause);
		assertNotNull(button);
		assertEquals(TestPagevl.class.getName(), this.getLastActivityClassName());
		//Press PAUSE
		TouchUtils.clickView(this, button);
//		ActivityManager manager = (ActivityManager) app.getSystemService(Context.ACTIVITY_SERVICE);
//		RunningTaskInfo info = manager.getRunningTasks(1).get(0);
//		Log.e("DEBUG 123", this.getLastActivityClassName());
//		Log.e("DEBUG 124", info.topActivity.getClassName());
		assertEquals(TestPause.class.getName(), this.getLastActivityClassName());
		String time1 = ((TextView)tpvl.findViewById(R.id.timer)).getText().toString();
		Thread.sleep(2000);
		String time2 = ((TextView)tpvl.findViewById(R.id.timer)).getText().toString();
		assertEquals(time1, time2);
		
		TestPause tp = (TestPause) getLastActivity();
		Button btn_re = (Button) tp.findViewById(R.id.btn_resume);
		assertNotNull(btn_re);
		//Press RESUME
		TouchUtils.clickView(this, btn_re);
		String time3 = ((TextView)tpvl.findViewById(R.id.timer)).getText().toString();
		Thread.sleep(2000);
		String time4 = ((TextView)tpvl.findViewById(R.id.timer)).getText().toString();
		assertFalse(time3.endsWith(time4));
	}

}
