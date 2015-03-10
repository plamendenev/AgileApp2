package com.aptitudeguru.dashboard;

public class Hint {
	
	int _hintid;
	
	String _sol;

	
	public Hint() {

	}

	
	public Hint(int hintid, String sol) {
		this._hintid = hintid;
		
		this._sol = sol;
	}

	public Hint( String sol) {

		
		this._sol = sol;
	}

	
	public int getID() {
		return this._hintid;
	}

	
	public void setID(int hintid) {
		this._hintid = hintid;
	}

	
	
	public String getSol() {
		return this._sol;
	}

	public void setSol(String sol) {
		this._sol = sol;
	}

	
}
