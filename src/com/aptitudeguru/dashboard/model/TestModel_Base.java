package com.aptitudeguru.dashboard.model;

public class TestModel_Base {
	
	int id;
	String ques;
	String cat;
	String option1;
	String option2;
	String option3;
	String option4;
	String sol;
	
	public TestModel_Base() {
		
	}
	
	public TestModel_Base(int id, String ques, String cat, String option1, String option2, String option3, String option4, String sol) {
		this.id = id;
		this.ques = ques;
		this.cat = cat;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.sol = sol;
	}

	public TestModel_Base(String ques, String cat, String option1, String option2, String option3, String option4, String sol) {
		this(0, ques, cat, option1, option2, option3, option4, sol);
	}

	public TestModel_Base(int id, String ques, String option1, String option2, String option3, String option4, String sol) {
		this(id, ques, null, option1, option2, option3, option4, sol);
	}
	
	public TestModel_Base(String ques, String option1, String option2, String option3, String option4, String sol) {
		this(ques, null, option1, option2, option3, option4, sol);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getSol() {
		return sol;
	}

	public void setSol(String sol) {
		this.sol = sol;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = true;
		TestModel_Base om = (TestModel_Base) o;
		result = result && this.ques.equals(om.ques);
		result = result && this.option1.equals(om.option1);
		result = result && this.option2.equals(om.option2);
		result = result && this.option3.equals(om.option3);
		result = result && this.option4.equals(om.option4);
		return result;
	}
	
}
