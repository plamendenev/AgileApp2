package com.aptitudeguru.dashboard.junit;




import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.content.Intent;
import android.test.InstrumentationTestCase;
import android.test.TouchUtils;
import android.util.Log;
import android.widget.Button;
import androidhive.dashboard.R;

import com.aptitudeguru.dashboard.TestPage;
import com.aptitudeguru.dashboard.page.main.MainPageHome;
import com.aptitudeguru.dashboard.page.test.TestChooiceQuantitative;

public class QuantitativeTest extends InstrumentationTestCase {
	MainPageHome app;


	public void setUp() throws Exception {
		Intent intent = new Intent(this.getInstrumentation().getContext(), MainPageHome.class);
		//intent.putExtra("cat", "q1");
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		app = (MainPageHome) this.getInstrumentation().startActivitySync(intent);
	}

	protected void tearDown() throws Exception {
		// TODO 自动生成的方法存根
		super.tearDown();
		if (app != null) {
			app.finish();
			app = null;
		}
	}	
	private void doJumpTest(Activity activity, int btnID, Class<?> destClass) {
		Button button = (Button) activity.findViewById(btnID);
		Log.e("null!!!", new String(new Boolean(button == null).toString()));
		assertNotNull(button);

		TouchUtils.clickView(this, button);
		ActivityManager manager = (ActivityManager) activity
				.getSystemService(Context.ACTIVITY_SERVICE);
		RunningTaskInfo info = manager.getRunningTasks(1).get(0);
		Log.e("dest!!!", destClass.getName());
		Log.e("actual!!!", info.topActivity.getClassName());
		assertEquals(destClass.getName(), info.topActivity.getClassName());
		
	}

    public void testActivities() throws Exception {
		this.doJumpTest(app, R.id.btn_quants, TestChooiceQuantitative.class);
	}



}
