package com.aptitudeguru.dashboard.junit;

import com.aptitudeguru.dashboard.page.main.MainPageHelp;
import com.aptitudeguru.dashboard.page.main.MainPageHome;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.Intent;
import android.test.InstrumentationTestCase;
import android.test.TouchUtils;
import android.widget.Button;
import androidhive.dashboard.R;

public class JUnit_SimpleExample extends InstrumentationTestCase {

	MainPageHome app;

	@Override
	protected void setUp() throws Exception {
		Intent intent = new Intent(this.getInstrumentation().getContext(), MainPageHelp.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		app = (MainPageHome) this.getInstrumentation().startActivitySync(intent);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (app != null) {
			app.finish();
			app = null;
		}
	}

	private void doJumpTest(Activity activity, int btnID, Class<?> destClass) {
		Button button = (Button) activity.findViewById(btnID);
		assertNotNull(button);

		TouchUtils.clickView(this, button);
		ActivityManager manager = (ActivityManager) activity
				.getSystemService(Context.ACTIVITY_SERVICE);
		RunningTaskInfo info = manager.getRunningTasks(1).get(0);
		assertEquals(destClass.getName(), info.topActivity.getClassName());
		// Log.e("Debug!!!", info.topActivity.getClassName());
	}

	public void testActivities() throws Exception {
		this.doJumpTest(app, R.id.btn_help, MainPageHome.class);
	}

}
