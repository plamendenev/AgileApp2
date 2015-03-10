package com.aptitudeguru.dashboard.model;

public class TestModelJava extends TestModel_Base {

	public TestModelJava() {
		super();
	}

	public TestModelJava(int id, String ques, String cat, String option1, String option2, String option3, String option4, String sol) {
		super(id, ques, cat, option1, option2, option3, option4, sol);
	}

	public TestModelJava(String ques, String cat, String option1, String option2, String option3, String option4, String sol) {
		super(ques, cat, option1, option2, option3, option4, sol);
	}

}
