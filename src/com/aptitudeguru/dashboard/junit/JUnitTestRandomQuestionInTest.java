package com.aptitudeguru.dashboard.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.aptitudeguru.dashboard.lib.DatabaseHandler;
import com.aptitudeguru.dashboard.page.main.MainPageHelp;
import com.aptitudeguru.dashboard.page.main.MainPageHome;

import android.content.Context;
import android.content.Intent;
import android.test.InstrumentationTestCase;

public class JUnitTestRandomQuestionInTest extends InstrumentationTestCase {

	
	@Test
	public void testRandomQuestions() throws Exception{
		
		Context context = this.getInstrumentation().getContext();
		DatabaseHandler db = new DatabaseHandler(context);
		
		assertNotSame("The lists should not be the same!", db.getAllQuants(), db.getAllQuantsInRandom());		
	}	
}
