package com.aptitudeguru.dashboard.junit;

import java.util.List;

import com.aptitudeguru.dashboard.TestPagevl;
import com.aptitudeguru.dashboard.lib.DatabaseHandler;
import com.aptitudeguru.dashboard.model.TestModelFavourite;

import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Intent;
import android.content.IntentFilter;
import android.test.InstrumentationTestCase;
import android.test.TouchUtils;
import android.util.Log;
import android.widget.Button;
import androidhive.dashboard.R;

public class JUnit_TestPageVL_AddFav extends InstrumentationTestCase {

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
		DatabaseHandler db = new DatabaseHandler(this.getInstrumentation().getContext());
		Button button = (Button) app.findViewById(R.id.btn_fav);
		assertNotNull(button);
		assertEquals(TestPagevl.class.getName(), this.getLastActivityClassName());
		//remove all fav
		List<TestModelFavourite> flist = db.getAllFav();
		for(TestModelFavourite v:flist) {
			db.deletefav(v);			
		}
		TouchUtils.clickView(this, button);
		assertEquals(1, db.getAllFav().size());
	}

}
