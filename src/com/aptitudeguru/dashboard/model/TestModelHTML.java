package com.aptitudeguru.dashboard.model;

public class TestModelHTML extends TestModel_Base {

	public TestModelHTML() {
		super();
	}

	public TestModelHTML(int id, String ques, String option1, String option2, String option3, String option4, String sol) {
		super(id, ques, option1, option2, option3, option4, sol);
	}

	public TestModelHTML(String ques, String option1, String option2, String option3, String option4, String sol) {
		super(ques, option1, option2, option3, option4, sol);
	}

}
