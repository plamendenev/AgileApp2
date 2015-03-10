package com.aptitudeguru.dashboard.junit;

import junit.framework.TestFailure;

import com.aptitudeguru.dashboard.Language;
import com.aptitudeguru.dashboard.TestPagevl;
import com.aptitudeguru.dashboard.page.main.MainPageAboutUs;
import com.aptitudeguru.dashboard.page.main.MainPageHelp;
import com.aptitudeguru.dashboard.page.main.MainPageHome;
import com.aptitudeguru.dashboard.page.test.TestChooiceQuantitative;
import com.aptitudeguru.dashboard.page.test.TestChooiceVerbal;

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
import androidhive.dashboard.R;

public class JUnit_Home2VerbalMenu extends InstrumentationTestCase {

	ActivityMonitor monitor;
	Activity app;

	@Override
	protected void setUp() throws Exception {
		monitor = this.getInstrumentation().addMonitor((IntentFilter)null, null, false);
		Intent intent = new Intent(this.getInstrumentation().getContext(), MainPageHome.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		app = this.getInstrumentation().startActivitySync(intent);
		Log.e("DEBUG", monitor.getLastActivity().getClass().getName());
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

	private void doJumpTest(Activity activity, int btnID, Class<?> destClass) {
		Button button = (Button) activity.findViewById(btnID);
		assertNotNull(button);

		TouchUtils.clickView(this, button);
		ActivityManager manager = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
		RunningTaskInfo info = manager.getRunningTasks(1).get(0);
		assertEquals(destClass.getName(), info.topActivity.getClassName());
		assertEquals(destClass.getName(), this.getLastActivityClassName());
	}

	public void testActivities() throws Exception {
		this.doJumpTest(app, R.id.btn_v1, TestChooiceVerbal.class);
	}

}
