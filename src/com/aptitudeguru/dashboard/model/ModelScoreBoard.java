package com.aptitudeguru.dashboard.model;

public class ModelScoreBoard {

	int _sbid;
	String _sbsection;
	String _sbsubsection;
	String _sbdatetime;
	String _sbscore;
	String _sbtt;

	public ModelScoreBoard() {

	}

	public ModelScoreBoard(int sbid, String sbsection, String sbsubsection, String sbdatetime, String sbscore, String sbtt) {
		this._sbid = sbid;
		this._sbsection = sbsection;
		this._sbsubsection = sbsubsection;
		this._sbdatetime = sbdatetime;
		this._sbscore = sbscore;
		this._sbtt = sbtt;

	}

	public ModelScoreBoard(String sbsection, String sbsubsection, String sbdatetime, String sbscore, String sbtt) {

		this._sbsection = sbsection;
		this._sbsubsection = sbsubsection;
		this._sbdatetime = sbdatetime;
		this._sbscore = sbscore;
		this._sbtt = sbtt;
	}

	public int getID() {
		return this._sbid;
	}

	public String gettt() {
		return this._sbtt;
	}

	public void setID(int quantsid) {
		this._sbid = quantsid;
	}

	public void settt(String sbtt) {
		this._sbtt = sbtt;
	}

	public String getSection() {
		return this._sbsection;
	}

	public void setSection(String quantsques) {
		this._sbsection = quantsques;
	}

	public String getSubsection() {
		return this._sbsubsection;
	}

	public void setSubsection(String quantscat) {
		this._sbsubsection = quantscat;
	}

	public String getDatetime() {
		return this._sbdatetime;
	}

	public String getScore() {
		return this._sbscore;
	}

	public void setdatetime(String sol) {
		this._sbdatetime = sol;
	}

	public void setScore(String option1) {
		this._sbscore = option1;
	}

}
