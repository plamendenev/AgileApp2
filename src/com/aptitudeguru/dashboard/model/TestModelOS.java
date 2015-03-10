package com.aptitudeguru.dashboard.model;

public class TestModelOS extends TestModel_Base {

	public TestModelOS() {
		super();
	}

	public TestModelOS(int id, String ques, String option1, String option2, String option3, String option4, String sol) {
		super(id, ques, option1, option2, option3, option4, sol);
	}

	public TestModelOS(String ques, String option1, String option2, String option3, String option4, String sol) {
		super(ques, option1, option2, option3, option4, sol);
	}

}
