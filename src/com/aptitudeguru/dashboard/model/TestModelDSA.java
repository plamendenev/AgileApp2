package com.aptitudeguru.dashboard.model;

public class TestModelDSA extends TestModel_Base {

	public TestModelDSA() {
		super();
	}

	public TestModelDSA(int id, String ques, String option1, String option2, String option3, String option4, String sol) {
		super(id, ques, option1, option2, option3, option4, sol);
	}

	public TestModelDSA(String ques, String option1, String option2, String option3, String option4, String sol) {
		super(ques, option1, option2, option3, option4, sol);
	}

}
