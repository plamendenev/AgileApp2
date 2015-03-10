package com.aptitudeguru.dashboard.model;

public class TestModelDBMS extends TestModel_Base {

	public TestModelDBMS() {
		super();
	}

	public TestModelDBMS(int id, String ques, String option1, String option2, String option3, String option4, String sol) {
		super(id, ques, option1, option2, option3, option4, sol);
	}

	public TestModelDBMS(String ques, String option1, String option2, String option3, String option4, String sol) {
		super(ques, option1, option2, option3, option4, sol);
	}

}
