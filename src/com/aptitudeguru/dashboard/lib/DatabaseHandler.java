package com.aptitudeguru.dashboard.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.example.taptap.DBH;







import com.aptitudeguru.dashboard.Hint;
import com.aptitudeguru.dashboard.model.TestModelFavourite;
import com.aptitudeguru.dashboard.model.TestModelJava;
import com.aptitudeguru.dashboard.model.TestModelC;
import com.aptitudeguru.dashboard.model.TestModelCpp;
import com.aptitudeguru.dashboard.model.TestModelDBMS;
import com.aptitudeguru.dashboard.model.TestModelDSA;
import com.aptitudeguru.dashboard.model.TestModelHTML;
import com.aptitudeguru.dashboard.model.TestModelOS;
import com.aptitudeguru.dashboard.model.ModelPuzzle;
import com.aptitudeguru.dashboard.model.TestModelQuants;
import com.aptitudeguru.dashboard.model.TestModelVL;
import com.aptitudeguru.dashboard.model.ModelScoreBoard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;

	private static final String DATABASE_NAME = "aptitudedatabase";

	private static final String TABLE_QUANTS = "quants";
	private static final String TABLE_CLANGUAGE = "clanguage";
	private static final String TABLE_CPPLANGUAGE = "cpplanguage";
	private static final String TABLE_JAVALANGUAGE = "javalanguage";
	private static final String TABLE_HTMLLANGUAGE = "htmllanguage";
	private static final String TABLE_VL = "vl";
	private static final String TABLE_OS = "os";
	private static final String TABLE_DBMS = "dbms";
	private static final String TABLE_DSA = "dsa";
	private static final String TABLE_TUTORIAL = "tutorial";
	private static final String TABLE_FAVOURITE = "favourite";
	private static final String TABLE_SBTABLE = "sbtable";
	private static final String TABLE_PUZZLETABLE = "PuzzleTable";

	private static final String KEY_PUZZLEID = "puzzleid";
	private static final String KEY_PUZZLEQUES = "puzzleques";
	private static final String KEY_PUZZLESOL = "sol";

	private static final String KEY_SBID = "sbid";
	private static final String KEY_SBSECTION = "sbsection";
	private static final String KEY_SBSUBSECTION = "sbsubsection";
	private static final String KEY_SBDATETIME = "sbdatetime";
	private static final String KEY_SBSCORE = "sbscore";
	private static final String KEY_SBTT = "sbtt";

	private static final String KEY_QUANTSID = "quantsid";
	private static final String KEY_QUANTSQUES = "quantsques";
	private static final String KEY_QUANTSCAT = "quantscat";
	private static final String KEY_OPTION1 = "option1";
	private static final String KEY_OPTION2 = "option2";
	private static final String KEY_OPTION3 = "option3";
	private static final String KEY_OPTION4 = "option4";
	private static final String KEY_QUANTSSOL = "sol";

	// c language table
	private static final String KEY_CLANGUAGEID = "cid";
	private static final String KEY_CLANGUAGEQUES = "cques";
	private static final String KEY_CCAT = "ccat";
	private static final String KEY_CSOL = "sol";

	// cpp language table
	private static final String KEY_CPPLANGUAGEID = "cppid";
	private static final String KEY_CPPLANGUAGEQUES = "cppques";
	private static final String KEY_CPPCAT = "cppcat";
	private static final String KEY_CPPSOL = "sol";

	// java language table
	private static final String KEY_JAVALANGUAGEID = "javaid";
	private static final String KEY_JAVALANGUAGEQUES = "javaques";
	private static final String KEY_JAVACAT = "javacat";
	private static final String KEY_JAVASOL = "sol";

	// html language table
	private static final String KEY_HTMLLANGUAGEID = "hmtlid";
	private static final String KEY_HTMLLANGUAGEQUES = "htmlques";
	// private static final String KEY_HTMLCAT = "htmlcat";
	private static final String KEY_HTMLSOL = "sol";

	// verbal and logicallanguage table
	private static final String KEY_VLID = "vlid";
	private static final String KEY_VLQUES = "vlques";
	private static final String KEY_VLCAT = "vlcat";
	private static final String KEY_VLSOL = "sol";

	// os table
	private static final String KEY_OSID = "osid";
	private static final String KEY_OSQUES = "osques";
	// private static final String KEY_OSCAT = "oscat";
	private static final String KEY_OSSOL = "sol";

	// dbms table
	private static final String KEY_DBMSID = "dbmsid";
	private static final String KEY_DBMSQUES = "dbmsques";
	// private static final String KEY_OSCAT = "oscat";
	private static final String KEY_DBMSSOL = "sol";

	// dSA table
	private static final String KEY_DSAID = "dsaid";
	private static final String KEY_DSAQUES = "dsaques";
	// private static final String KEY_OSCAT = "oscat";
	private static final String KEY_DSASOL = "sol";

	// tutorial table
	private static final String KEY_TUTID = "tutorialid";
	private static final String KEY_TUTQUES = "tutorialques";
	private static final String KEY_TUTCAT = "tutorialcat";

	// fav table
	private static final String KEY_FAVOURITEID = "favouritelid";
	private static final String KEY_FAVOURITEQUES = "favouriteques";
	// private static final String KEY_HTMLCAT = "htmlcat";
	private static final String KEY_FAVOURITESOL = "sol";

	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_QUANTS_TABLE = "CREATE TABLE " + TABLE_QUANTS + "(" + KEY_QUANTSID + " INTEGER PRIMARY KEY," + KEY_QUANTSQUES + " TEXT," + KEY_QUANTSCAT + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_QUANTSSOL + " TEXT" + ")";

		String CREATE_CLANGUAGE_TABLE = "CREATE TABLE " + TABLE_CLANGUAGE + "(" + KEY_CLANGUAGEID + " INTEGER PRIMARY KEY," + KEY_CLANGUAGEQUES + " TEXT," + KEY_CCAT + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_CSOL + " TEXT" + ")";

		String CREATE_CPPLANGUAGE_TABLE = "CREATE TABLE " + TABLE_CPPLANGUAGE + "(" + KEY_CPPLANGUAGEID + " INTEGER PRIMARY KEY," + KEY_CPPLANGUAGEQUES + " TEXT," + KEY_CPPCAT + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_CPPSOL + " TEXT" + ")";

		String CREATE_JAVALANGUAGE_TABLE = "CREATE TABLE " + TABLE_JAVALANGUAGE + "(" + KEY_JAVALANGUAGEID + " INTEGER PRIMARY KEY," + KEY_JAVALANGUAGEQUES + " TEXT," + KEY_JAVACAT + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_JAVASOL + " TEXT" + ")";
		String CREATE_HTMLLANGUAGE_TABLE = "CREATE TABLE " + TABLE_HTMLLANGUAGE + "(" + KEY_HTMLLANGUAGEID + " INTEGER PRIMARY KEY," + KEY_HTMLLANGUAGEQUES + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_HTMLSOL + " TEXT" + ")";

		String CREATE_VL_TABLE = "CREATE TABLE " + TABLE_VL + "(" + KEY_VLID + " INTEGER PRIMARY KEY," + KEY_VLQUES + " TEXT," + KEY_VLCAT + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_VLSOL + " TEXT" + ")";
		String CREATE_OS_TABLE = "CREATE TABLE " + TABLE_OS + "(" + KEY_OSID + " INTEGER PRIMARY KEY," + KEY_OSQUES + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_OSSOL + " TEXT" + ")";

		String CREATE_DBMS_TABLE = "CREATE TABLE " + TABLE_DBMS + "(" + KEY_DBMSID + " INTEGER PRIMARY KEY," + KEY_DBMSQUES + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_DBMSSOL + " TEXT" + ")";

		String CREATE_DSA_TABLE = "CREATE TABLE " + TABLE_DSA + "(" + KEY_DSAID + " INTEGER PRIMARY KEY," + KEY_DSAQUES + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_DSASOL + " TEXT" + ")";

		String CREATE_TUTORIAL_TABLE = "CREATE TABLE " + TABLE_TUTORIAL + "(" + KEY_TUTID + " INTEGER PRIMARY KEY," + KEY_TUTCAT + " TEXT," + KEY_TUTQUES + " TEXT" + ")";

		String CREATE_FAVOURITE_TABLE = "CREATE TABLE " + TABLE_FAVOURITE + "(" + KEY_FAVOURITEID + " INTEGER PRIMARY KEY," + KEY_FAVOURITEQUES + " TEXT," + KEY_OPTION1 + " TEXT," + KEY_OPTION2 + " TEXT," + KEY_OPTION3 + " TEXT," + KEY_OPTION4 + " TEXT," + KEY_FAVOURITESOL + " TEXT" + ")";

		String CREATE_SBTABLE_TABLE = "CREATE TABLE " + TABLE_SBTABLE + "(" + KEY_SBID + " INTEGER PRIMARY KEY," + KEY_SBSECTION + " TEXT," + KEY_SBSUBSECTION + " TEXT," + KEY_SBDATETIME + " TEXT," + KEY_SBSCORE + " TEXT," + KEY_SBTT + " TEXT" + ")";

		String CREATE_PUZZLE_TABLE = "CREATE TABLE " + TABLE_PUZZLETABLE + "(" + KEY_PUZZLEID + " INTEGER PRIMARY KEY," + KEY_PUZZLEQUES + " TEXT," + KEY_PUZZLESOL + " TEXT" + ")";

		db.execSQL(CREATE_QUANTS_TABLE);
		db.execSQL(CREATE_CLANGUAGE_TABLE);
		db.execSQL(CREATE_CPPLANGUAGE_TABLE);
		db.execSQL(CREATE_JAVALANGUAGE_TABLE);
		db.execSQL(CREATE_HTMLLANGUAGE_TABLE);
		db.execSQL(CREATE_VL_TABLE);
		db.execSQL(CREATE_OS_TABLE);
		db.execSQL(CREATE_DBMS_TABLE);
		db.execSQL(CREATE_DSA_TABLE);
		db.execSQL(CREATE_TUTORIAL_TABLE);
		db.execSQL(CREATE_FAVOURITE_TABLE);
		db.execSQL(CREATE_SBTABLE_TABLE);
		db.execSQL(CREATE_PUZZLE_TABLE);
	}

	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUANTS);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLANGUAGE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_CPPLANGUAGE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_JAVALANGUAGE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_HTMLLANGUAGE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_VL);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_OS);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_DBMS);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_DSA);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TUTORIAL);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVOURITE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_SBTABLE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PUZZLETABLE);
		// Create tables again
		onCreate(db);

	}

	/**
	 * All CRUD(Create, Read, Update, Delete) Operations
	 */

	// Adding new PUZZLE TABLE(SBTABLE)
	public void addPuzzle(ModelPuzzle q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_PUZZLEQUES, q.getQues()); // Contact Name
		// values.put(KEY_OSCAT, quants.getCat());
		values.put(KEY_PUZZLESOL, q.getSol());

		// Contact Phone

		// Inserting Row

		db.insert(TABLE_PUZZLETABLE, null, values);

		db.close(); // Closing database connection
	}

	// Adding new SCORE TABLE(SBTABLE)
	public void addSbtable(ModelScoreBoard q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_SBSECTION, q.getSection()); // Contact Name
		// values.put(KEY_OSCAT, quants.getCat());
		values.put(KEY_SBSUBSECTION, q.getSubsection());
		values.put(KEY_SBDATETIME, q.getDatetime());
		values.put(KEY_SBSCORE, q.getScore());
		values.put(KEY_SBTT, q.gettt());

		// Contact Phone

		// Inserting Row
		db.insert(TABLE_SBTABLE, null, values);

		db.close(); // Closing database connection
	}

	// ADDING FAV

	// Adding new OS
	public void addFav(TestModelFavourite q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_FAVOURITEQUES, q.getQues()); // Contact Name

		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_FAVOURITESOL, q.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_FAVOURITE, null, values);

		db.close(); // Closing database connection
	}

	// Adding new TUTORIAL

	// Adding new QUANTS
	public void addQuants(TestModelQuants quants) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_QUANTSQUES, quants.getQues()); // Contact Name
		values.put(KEY_QUANTSCAT, quants.getCat());
		values.put(KEY_OPTION1, quants.getOption1());
		values.put(KEY_OPTION2, quants.getOption2());
		values.put(KEY_OPTION3, quants.getOption3());
		values.put(KEY_OPTION4, quants.getOption4());
		values.put(KEY_QUANTSSOL, quants.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_QUANTS, null, values);
		db.close(); // Closing database connection
	}

	// ADDING TO CLANG TABLE

	public void addClanguage(TestModelC c) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_CLANGUAGEQUES, c.getQues()); // Contact Name
		values.put(KEY_CCAT, c.getCat());
		values.put(KEY_OPTION1, c.getOption1());
		values.put(KEY_OPTION2, c.getOption2());
		values.put(KEY_OPTION3, c.getOption3());
		values.put(KEY_OPTION4, c.getOption4());
		values.put(KEY_CSOL, c.getSol());
		// Contact Phone

		// Inserting Row

		db.insert(TABLE_CLANGUAGE, null, values);
		db.close(); // Closing database connection
	}

	// ADDING TO CPPLANG TABLE

	public void addCpp(TestModelCpp cpp) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_CPPLANGUAGEQUES, cpp.getQues()); // Contact Name
		values.put(KEY_CPPCAT, cpp.getCat());
		values.put(KEY_OPTION1, cpp.getOption1());
		values.put(KEY_OPTION2, cpp.getOption2());
		values.put(KEY_OPTION3, cpp.getOption3());
		values.put(KEY_OPTION4, cpp.getOption4());
		values.put(KEY_CPPSOL, cpp.getSol());
		// Contact Phone

		// Inserting Row

		db.insert(TABLE_CPPLANGUAGE, null, values);

		db.close(); // Closing database connection
	}

	// ADDING TO JAVALANG TABLE

	public void addJava(TestModelJava j) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_JAVALANGUAGEQUES, j.getQues()); // Contact Name
		values.put(KEY_JAVACAT, j.getCat());
		values.put(KEY_OPTION1, j.getOption1());
		values.put(KEY_OPTION2, j.getOption2());
		values.put(KEY_OPTION3, j.getOption3());
		values.put(KEY_OPTION4, j.getOption4());
		values.put(KEY_JAVASOL, j.getSol());
		// Contact Phone

		// Inserting Row

		db.insert(TABLE_JAVALANGUAGE, null, values);

		db.close(); // Closing database connection
	}

	// ADDING TOHTMLLANG TABLE

	public void addHTMLlanguage(TestModelHTML j) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_HTMLLANGUAGEQUES, j.getQues()); // Contact Name
		// values.put(KEY_HTMLCAT, j.getCat());
		values.put(KEY_OPTION1, j.getOption1());
		values.put(KEY_OPTION2, j.getOption2());
		values.put(KEY_OPTION3, j.getOption3());
		values.put(KEY_OPTION4, j.getOption4());
		values.put(KEY_HTMLSOL, j.getSol());
		// Contact Phone

		// Inserting Row

		db.insert(TABLE_HTMLLANGUAGE, null, values);
		db.close(); // Closing database connection
	}

	// Adding new VER AND LOGIC
	public void addVL(TestModelVL quants) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_VLQUES, quants.getQues()); // Contact Name
		values.put(KEY_VLCAT, quants.getCat());
		values.put(KEY_OPTION1, quants.getOption1());
		values.put(KEY_OPTION2, quants.getOption2());
		values.put(KEY_OPTION3, quants.getOption3());
		values.put(KEY_OPTION4, quants.getOption4());
		values.put(KEY_VLSOL, quants.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_VL, null, values);

		db.close(); // Closing database connection
	}

	// Adding new OS
	public void addOS(TestModelOS q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_OSQUES, q.getQues()); // Contact Name
		// values.put(KEY_OSCAT, quants.getCat());
		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_OSSOL, q.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_OS, null, values);
		db.close(); // Closing database connection
	}

	// Adding new DBMS
	public void addDBMS(TestModelDBMS q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_DBMSQUES, q.getQues()); // Contact Name
		// values.put(KEY_OSCAT, quants.getCat());
		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_DBMSSOL, q.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_DBMS, null, values);
		db.close(); // Closing database connection
	}

	// Adding new DSA
	public void addDSA(TestModelDSA q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_DSAQUES, q.getQues()); // Contact Name
		// values.put(KEY_OSCAT, quants.getCat());
		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_DSASOL, q.getSol());
		// Contact Phone

		// Inserting Row
		db.insert(TABLE_DSA, null, values);
		db.close(); // Closing database connection
	}

	// Getting single sbtable score

	public ModelScoreBoard getSbtable(String cat) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_SBTABLE, new String[] { KEY_SBID, KEY_SBSECTION, KEY_SBSUBSECTION, KEY_SBDATETIME, KEY_SBSCORE }, KEY_SBSUBSECTION + "=?", new String[] { String.valueOf(cat) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		ModelScoreBoard v = new ModelScoreBoard(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5));
		// return contact
		return v;
	}

	// Getting single quants
	public TestModelQuants getQuants(int id, String cat) {
		SQLiteDatabase db = this.getReadableDatabase();
		// String where = "KEY_QUANTSID=? AND KEY_QUANTSCAT=? ";
		Cursor cursor = db.query(TABLE_QUANTS, new String[] { KEY_QUANTSID, KEY_QUANTSQUES, KEY_QUANTSCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_QUANTSSOL }, KEY_QUANTSID + "=?" + " AND " + KEY_QUANTSCAT + "=" + "'" + cat + "'", new String[] { String.valueOf(id) }, null, null, null, null);

		if (cursor != null)
			cursor.moveToFirst();

		TestModelQuants quants = new TestModelQuants(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		db.close();
		return quants;

	}

	public TestModelQuants getQuants(int id) {
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.query(TABLE_QUANTS, new String[] { KEY_QUANTSID, KEY_QUANTSQUES, KEY_QUANTSCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_QUANTSSOL }, KEY_QUANTSID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);

		if (cursor != null)
			cursor.moveToFirst();

		TestModelQuants quants = new TestModelQuants(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		db.close();
		return quants;

	}

	// Getting single c language
	public TestModelC getC(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_CLANGUAGE, new String[] { KEY_CLANGUAGEID, KEY_CLANGUAGEQUES, KEY_CCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_CSOL }, KEY_CLANGUAGEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelC c = new TestModelC(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return c;
	}

	public TestModelC getC(int id, String cat) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_CLANGUAGE, new String[] { KEY_CLANGUAGEID, KEY_CLANGUAGEQUES, KEY_CCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_CSOL }, KEY_CLANGUAGEID + "=?" + " AND " + KEY_CCAT + "=" + "'" + cat + "'", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelC c = new TestModelC(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return c;
	}

	// Getting single cpp language
	public TestModelCpp getCpp(int id, String cat) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_CPPLANGUAGE, new String[] { KEY_CPPLANGUAGEID, KEY_CPPLANGUAGEQUES, KEY_CPPCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_CPPSOL }, KEY_CPPLANGUAGEID + "=?" + " AND " + KEY_CPPCAT + "=" + "'" + cat + "'", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelCpp cpp = new TestModelCpp(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return cpp;
	}

	public TestModelCpp getCpp(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_CPPLANGUAGE, new String[] { KEY_CPPLANGUAGEID, KEY_CPPLANGUAGEQUES, KEY_CPPCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_CPPSOL }, KEY_CPPLANGUAGEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelCpp cpp = new TestModelCpp(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return cpp;
	}

	// Getting single java language
	public TestModelJava getJava(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_JAVALANGUAGE, new String[] { KEY_JAVALANGUAGEID, KEY_JAVALANGUAGEQUES, KEY_JAVACAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_JAVASOL }, KEY_JAVALANGUAGEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelJava j = new TestModelJava(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return j;
	}

	public TestModelJava getJava(int id, String cat) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_JAVALANGUAGE, new String[] { KEY_JAVALANGUAGEID, KEY_JAVALANGUAGEQUES, KEY_JAVACAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_JAVASOL }, KEY_JAVALANGUAGEID + "=?" + " AND " + KEY_JAVACAT + "=" + "'" + cat + "'", new String[] { String.valueOf(id) }, null, null, null, null);

		if (cursor != null)
			cursor.moveToFirst();

		TestModelJava j = new TestModelJava(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));

		// return contact
		return j;
	}

	// Getting single HTML language
	public TestModelHTML getHTML(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_HTMLLANGUAGE, new String[] { KEY_HTMLLANGUAGEID, KEY_HTMLLANGUAGEQUES, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_HTMLSOL }, KEY_HTMLLANGUAGEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelHTML j = new TestModelHTML(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
		// return contact
		return j;
	}

	// Getting single VER AND LOGIC
	public TestModelVL getVL(int id, String cat) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_VL, new String[] { KEY_VLID, KEY_VLQUES, KEY_VLCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_VLSOL }, KEY_VLID + "=?" + " AND " + KEY_VLCAT + "=" + "'" + cat + "'", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelVL v = new TestModelVL(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return v;
	}

	public TestModelVL getVL(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_VL, new String[] { KEY_VLID, KEY_VLQUES, KEY_VLCAT, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_VLSOL }, KEY_VLID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelVL v = new TestModelVL(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7));
		// return contact
		return v;
	}

	// Getting single OS
	public TestModelOS getOS(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_OS, new String[] { KEY_OSID, KEY_OSQUES, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_OSSOL }, KEY_OSID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelOS v = new TestModelOS(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
		// return contact
		return v;
	}

	// Getting single puzzle
	public ModelPuzzle getPuzzle(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_PUZZLETABLE, new String[] { KEY_PUZZLEID, KEY_PUZZLEQUES, KEY_PUZZLESOL }, KEY_PUZZLEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		ModelPuzzle v = new ModelPuzzle(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2));
		// return contact
		return v;
	}

	// Getting single DBMS
	public TestModelDBMS getDBMS(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_DBMS, new String[] { KEY_DBMSID, KEY_DBMSQUES, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_DBMSSOL }, KEY_DBMSID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelDBMS v = new TestModelDBMS(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
		// return contact
		return v;
	}

	// Getting single DSA
	public TestModelDSA getDSA(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_DSA, new String[] { KEY_DSAID, KEY_DSAQUES, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_DSASOL }, KEY_DSAID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelDSA v = new TestModelDSA(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
		// return contact
		return v;
	}

	// Getting single tuts

	//
	// Getting single fav
	public TestModelFavourite getFav(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_FAVOURITE, new String[] { KEY_FAVOURITEID, KEY_FAVOURITEQUES, KEY_OPTION1, KEY_OPTION2, KEY_OPTION3, KEY_OPTION4, KEY_FAVOURITESOL }, KEY_FAVOURITEID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		TestModelFavourite v = new TestModelFavourite(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
		// return contact
		return v;
	}

	public Hint getHint(int id) {
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.query(TABLE_QUANTS, new String[] {
				KEY_QUANTSID, KEY_QUANTSSOL }, KEY_QUANTSID
				+ "=?", new String[] { String.valueOf(id) }, null, null, null,
				null);
		if (cursor != null)
			cursor.moveToFirst();
		Hint v = new Hint(Integer.parseInt(cursor.getString(0)), cursor.getString(6));
		// return contact
		return v;
	}
	
	// Getting All sbtable
	public List<ModelScoreBoard> getAllsbtable(String cat) {
		List<ModelScoreBoard> quantsList = new ArrayList<ModelScoreBoard>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_SBTABLE + " where " + KEY_SBSUBSECTION + "=" + "'" + cat + "'";

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {

				ModelScoreBoard quants = new ModelScoreBoard();
				quants.setID(Integer.parseInt(cursor.getString(0)));
				quants.setSection(cursor.getString(1));
				quants.setSubsection(cursor.getString(2));
				quants.setdatetime(cursor.getString(3));
				quants.setScore(cursor.getString(4));
				quants.settt(cursor.getString(5));

				// Adding contact to list
				quantsList.add(quants);

			} while (cursor.moveToNext());
		}

		// return contact list
		db.close();
		return quantsList;
	}

	// Getting All Tuts

	// Getting All Quants
	public List<TestModelQuants> getAllQuants(String cat) {
		List<TestModelQuants> quantsList = new ArrayList<TestModelQuants>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUANTS + " where " + KEY_QUANTSCAT + "=" + "'" + cat + "'" + "ORDER BY RANDOM()";

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {

				TestModelQuants quants = new TestModelQuants();
				quants.setID(Integer.parseInt(cursor.getString(0)));
				quants.setQues(cursor.getString(1));
				quants.setCat(cursor.getString(2));
				quants.setOption1(cursor.getString(3));
				quants.setOption2(cursor.getString(4));
				quants.setOption3(cursor.getString(5));
				quants.setOption4(cursor.getString(6));
				quants.setSol(cursor.getString(7));
				// Adding contact to list
				quantsList.add(quants);

			} while (cursor.moveToNext());
		}

		// return contact list
		db.close();
		return quantsList;
	}

	public List<TestModelQuants> getAllQuants() {
		List<TestModelQuants> quantsList = new ArrayList<TestModelQuants>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUANTS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {

				TestModelQuants quants = new TestModelQuants();
				quants.setID(Integer.parseInt(cursor.getString(0)));
				quants.setQues(cursor.getString(1));
				quants.setCat(cursor.getString(2));
				quants.setOption1(cursor.getString(3));
				quants.setOption2(cursor.getString(4));
				quants.setOption3(cursor.getString(5));
				quants.setOption4(cursor.getString(6));
				quants.setSol(cursor.getString(7));
				// Adding contact to list
				quantsList.add(quants);

			} while (cursor.moveToNext());
		}

		// return contact list
		db.close();
		return quantsList;
	}
	
	
	//This method is used for the JUnit test which tests the randomness of the questions in a Quantitative test
	public List<TestModelQuants> getAllQuantsInRandom() {		
		List<TestModelQuants> quantsListRandom = new ArrayList<TestModelQuants>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUANTS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelQuants quants = new TestModelQuants();
				quants.setID(Integer.parseInt(cursor.getString(0)));
				quants.setQues(cursor.getString(1));
				quants.setCat(cursor.getString(2));
				quants.setOption1(cursor.getString(3));
				quants.setOption2(cursor.getString(4));
				quants.setOption3(cursor.getString(5));
				quants.setOption4(cursor.getString(6));
				quants.setSol(cursor.getString(7));
				// Adding contact to list
				quantsListRandom.add(quants);

			} while (cursor.moveToNext());
		}

		db.close();			
		Collections.shuffle(quantsListRandom);
		return quantsListRandom;
	}

	// Getting All C language
	public List<TestModelC> getAllC(String cat) {
		List<TestModelC> cList = new ArrayList<TestModelC>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_CLANGUAGE + " where " + KEY_CCAT + "=" + "'" + cat + "'";

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelC c = new TestModelC();
				c.setID(Integer.parseInt(cursor.getString(0)));
				c.setQues(cursor.getString(1));
				c.setCat(cursor.getString(2));
				c.setOption1(cursor.getString(3));
				c.setOption2(cursor.getString(4));
				c.setOption3(cursor.getString(5));
				c.setOption4(cursor.getString(6));
				c.setSol(cursor.getString(7));
				// Adding contact to list
				cList.add(c);
			} while (cursor.moveToNext());
		}

		// return contact list
		return cList;
	}

	public List<TestModelC> getAllC() {
		List<TestModelC> cList = new ArrayList<TestModelC>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_CLANGUAGE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelC c = new TestModelC();
				c.setID(Integer.parseInt(cursor.getString(0)));
				c.setQues(cursor.getString(1));
				c.setCat(cursor.getString(2));
				c.setOption1(cursor.getString(3));
				c.setOption2(cursor.getString(4));
				c.setOption3(cursor.getString(5));
				c.setOption4(cursor.getString(6));
				c.setSol(cursor.getString(7));
				// Adding contact to list
				cList.add(c);
			} while (cursor.moveToNext());
		}

		// return contact list
		return cList;
	}

	// Getting All Cpp language
	public List<TestModelCpp> getAllCpp(String cat) {
		List<TestModelCpp> cList = new ArrayList<TestModelCpp>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_CPPLANGUAGE + " where " + KEY_CPPCAT + "=" + "'" + cat + "'";

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelCpp cpp = new TestModelCpp();
				cpp.setID(Integer.parseInt(cursor.getString(0)));
				cpp.setQues(cursor.getString(1));
				cpp.setCat(cursor.getString(2));
				cpp.setOption1(cursor.getString(3));
				cpp.setOption2(cursor.getString(4));
				cpp.setOption3(cursor.getString(5));
				cpp.setOption4(cursor.getString(6));
				cpp.setSol(cursor.getString(7));
				// Adding contact to list
				cList.add(cpp);
			} while (cursor.moveToNext());
		}

		// return contact list
		return cList;
	}

	public List<TestModelCpp> getAllCpp() {
		List<TestModelCpp> cList = new ArrayList<TestModelCpp>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_CPPLANGUAGE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelCpp cpp = new TestModelCpp();
				cpp.setID(Integer.parseInt(cursor.getString(0)));
				cpp.setQues(cursor.getString(1));
				cpp.setCat(cursor.getString(2));
				cpp.setOption1(cursor.getString(3));
				cpp.setOption2(cursor.getString(4));
				cpp.setOption3(cursor.getString(5));
				cpp.setOption4(cursor.getString(6));
				cpp.setSol(cursor.getString(7));
				// Adding contact to list
				cList.add(cpp);
			} while (cursor.moveToNext());
		}

		// return contact list
		return cList;
	}

	// Getting All Java language
	public List<TestModelJava> getAllJava(String cat) {
		List<TestModelJava> jList = new ArrayList<TestModelJava>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_JAVALANGUAGE + " where " + KEY_JAVACAT + "=" + "'" + cat + "'";
		;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		if (cursor.moveToFirst()) {
			do {
				TestModelJava j = new TestModelJava();
				j.setID(Integer.parseInt(cursor.getString(0)));
				j.setQues(cursor.getString(1));
				j.setCat(cursor.getString(2));
				j.setOption1(cursor.getString(3));
				j.setOption2(cursor.getString(4));
				j.setOption3(cursor.getString(5));
				j.setOption4(cursor.getString(6));
				j.setSol(cursor.getString(7));
				// Adding contact to list
				jList.add(j);
			} while (cursor.moveToNext());
		}

		// return contact list
		return jList;
	}

	public List<TestModelJava> getAllJava() {
		List<TestModelJava> jList = new ArrayList<TestModelJava>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_JAVALANGUAGE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		if (cursor.moveToFirst()) {
			do {
				TestModelJava j = new TestModelJava();
				j.setID(Integer.parseInt(cursor.getString(0)));
				j.setQues(cursor.getString(1));
				j.setCat(cursor.getString(2));
				j.setOption1(cursor.getString(3));
				j.setOption2(cursor.getString(4));
				j.setOption3(cursor.getString(5));
				j.setOption4(cursor.getString(6));
				j.setSol(cursor.getString(7));
				// Adding contact to list
				jList.add(j);
			} while (cursor.moveToNext());
		}

		// return contact list
		return jList;
	}

	// Getting All HTML language
	public List<TestModelHTML> getAllHTML() {
		List<TestModelHTML> jList = new ArrayList<TestModelHTML>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_HTMLLANGUAGE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelHTML j = new TestModelHTML();
				j.setID(Integer.parseInt(cursor.getString(0)));
				j.setQues(cursor.getString(1));

				j.setOption1(cursor.getString(2));
				j.setOption2(cursor.getString(3));
				j.setOption3(cursor.getString(4));
				j.setOption4(cursor.getString(5));
				j.setSol(cursor.getString(6));
				// Adding contact to list
				jList.add(j);
			} while (cursor.moveToNext());
		}

		// return contact list
		return jList;
	}

	// Getting All VL
	public List<TestModelVL> getAllVL(String cat) {
		List<TestModelVL> VList = new ArrayList<TestModelVL>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_VL + " where " + KEY_VLCAT + "=" + "'" + cat + "'";

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelVL v = new TestModelVL();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				v.setCat(cursor.getString(2));
				v.setOption1(cursor.getString(3));
				v.setOption2(cursor.getString(4));
				v.setOption3(cursor.getString(5));
				v.setOption4(cursor.getString(6));
				v.setSol(cursor.getString(7));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		db.close();
		Collections.shuffle(VList);
		
		return VList;
	}

	public List<TestModelVL> getAllVL() {
		List<TestModelVL> VList = new ArrayList<TestModelVL>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_VL;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelVL v = new TestModelVL();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				v.setCat(cursor.getString(2));
				v.setOption1(cursor.getString(3));
				v.setOption2(cursor.getString(4));
				v.setOption3(cursor.getString(5));
				v.setOption4(cursor.getString(6));
				v.setSol(cursor.getString(7));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Getting All OS
	public List<TestModelOS> getAllOS() {
		List<TestModelOS> VList = new ArrayList<TestModelOS>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_OS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelOS v = new TestModelOS();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				// v.setCat(cursor.getString(2));
				v.setOption1(cursor.getString(2));
				v.setOption2(cursor.getString(3));
				v.setOption3(cursor.getString(4));
				v.setOption4(cursor.getString(5));
				v.setSol(cursor.getString(6));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Getting All puzzle
	public List<ModelPuzzle> getAllPuzzle() {
		List<ModelPuzzle> VList = new ArrayList<ModelPuzzle>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_PUZZLETABLE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {

				ModelPuzzle v = new ModelPuzzle();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				// v.setCat(cursor.getString(2));

				v.setSol(cursor.getString(2));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Getting All DBMS
	public List<TestModelDBMS> getAllDBMS() {
		List<TestModelDBMS> VList = new ArrayList<TestModelDBMS>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_DBMS;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelDBMS v = new TestModelDBMS();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				// v.setCat(cursor.getString(2));
				v.setOption1(cursor.getString(2));
				v.setOption2(cursor.getString(3));
				v.setOption3(cursor.getString(4));
				v.setOption4(cursor.getString(5));
				v.setSol(cursor.getString(6));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Getting All DSA
	public List<TestModelDSA> getAllDSA() {
		List<TestModelDSA> VList = new ArrayList<TestModelDSA>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_DSA;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelDSA v = new TestModelDSA();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));
				// v.setCat(cursor.getString(2));
				v.setOption1(cursor.getString(2));
				v.setOption2(cursor.getString(3));
				v.setOption3(cursor.getString(4));
				v.setOption4(cursor.getString(5));
				v.setSol(cursor.getString(6));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Getting All Fav
	public List<TestModelFavourite> getAllFav() {
		List<TestModelFavourite> VList = new ArrayList<TestModelFavourite>();
		// Select All Query

		String selectQuery = "SELECT  * FROM " + TABLE_FAVOURITE;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to li
		if (cursor.moveToFirst()) {
			do {
				TestModelFavourite v = new TestModelFavourite();
				v.setID(Integer.parseInt(cursor.getString(0)));
				v.setQues(cursor.getString(1));

				v.setOption1(cursor.getString(2));
				v.setOption2(cursor.getString(3));
				v.setOption3(cursor.getString(4));
				v.setOption4(cursor.getString(5));
				v.setSol(cursor.getString(6));
				// Adding contact to list
				VList.add(v);
			} while (cursor.moveToNext());
		}

		// return contact list
		return VList;
	}

	// Updating single Quants
	public int updateQuants(TestModelQuants quants) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_QUANTSQUES, quants.getQues()); // Contact Name
		values.put(KEY_QUANTSCAT, quants.getCat());
		values.put(KEY_OPTION1, quants.getOption1());
		values.put(KEY_OPTION2, quants.getOption2());
		values.put(KEY_OPTION3, quants.getOption3());
		values.put(KEY_OPTION4, quants.getOption4());
		values.put(KEY_QUANTSSOL, quants.getSol());

		// updating row
		return db.update(TABLE_QUANTS, values, KEY_QUANTSID + " = ?", new String[] { String.valueOf(quants.getID()) });
	}

	// Updating single C Language
	public int updateC(TestModelC c) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_CLANGUAGEQUES, c.getQues()); // Contact Name
		values.put(KEY_CCAT, c.getCat());
		values.put(KEY_OPTION1, c.getOption1());
		values.put(KEY_OPTION2, c.getOption2());
		values.put(KEY_OPTION3, c.getOption3());
		values.put(KEY_OPTION4, c.getOption4());
		values.put(KEY_CPPSOL, c.getSol());

		// updating row
		return db.update(TABLE_CLANGUAGE, values, KEY_CLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
	}

	// Updating single Cpp Language
	public int updateCpp(TestModelCpp c) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_CPPLANGUAGEQUES, c.getQues()); // Contact Name
		values.put(KEY_CPPCAT, c.getCat());
		values.put(KEY_OPTION1, c.getOption1());
		values.put(KEY_OPTION2, c.getOption2());
		values.put(KEY_OPTION3, c.getOption3());
		values.put(KEY_OPTION4, c.getOption4());
		values.put(KEY_CPPSOL, c.getSol());

		// updating row
		return db.update(TABLE_CPPLANGUAGE, values, KEY_CPPLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
	}

	// Updating single JAVA Language
	public int updateJava(TestModelJava c) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_JAVALANGUAGEQUES, c.getQues()); // Contact Name
		values.put(KEY_JAVACAT, c.getCat());
		values.put(KEY_OPTION1, c.getOption1());
		values.put(KEY_OPTION2, c.getOption2());
		values.put(KEY_OPTION3, c.getOption3());
		values.put(KEY_OPTION4, c.getOption4());
		values.put(KEY_JAVASOL, c.getSol());

		// updating row
		return db.update(TABLE_JAVALANGUAGE, values, KEY_JAVALANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
	}

	// Updating single HTML Language
	public int updateHTML(TestModelHTML c) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_HTMLLANGUAGEQUES, c.getQues()); // Contact Name

		values.put(KEY_OPTION1, c.getOption1());
		values.put(KEY_OPTION2, c.getOption2());
		values.put(KEY_OPTION3, c.getOption3());
		values.put(KEY_OPTION4, c.getOption4());
		values.put(KEY_HTMLSOL, c.getSol());

		// updating row
		return db.update(TABLE_HTMLLANGUAGE, values, KEY_HTMLLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
	}

	// Updating single VL
	public int updateVL(TestModelVL quants) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_VLQUES, quants.getQues()); // Contact Name
		values.put(KEY_VLCAT, quants.getCat());
		values.put(KEY_OPTION1, quants.getOption1());
		values.put(KEY_OPTION2, quants.getOption2());
		values.put(KEY_OPTION3, quants.getOption3());
		values.put(KEY_OPTION4, quants.getOption4());
		values.put(KEY_VLSOL, quants.getSol());

		// updating row
		return db.update(TABLE_VL, values, KEY_VLID + " = ?", new String[] { String.valueOf(quants.getID()) });
	}

	// Updating single OS
	public int updateOS(TestModelOS q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_OSQUES, q.getQues()); // Contact Name

		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_OSSOL, q.getSol());

		// updating row
		return db.update(TABLE_OS, values, KEY_OSID + " = ?", new String[] { String.valueOf(q.getID()) });
	}

	// Updating single DBMS
	public int updateDBMS(TestModelDBMS q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_DBMSQUES, q.getQues()); // Contact Name

		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_DBMSSOL, q.getSol());

		// updating row
		return db.update(TABLE_DBMS, values, KEY_DBMSID + " = ?", new String[] { String.valueOf(q.getID()) });
	}

	// Updating single DBMS
	public int updateDSA(TestModelDSA q) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_DSAQUES, q.getQues()); // Contact Name

		values.put(KEY_OPTION1, q.getOption1());
		values.put(KEY_OPTION2, q.getOption2());
		values.put(KEY_OPTION3, q.getOption3());
		values.put(KEY_OPTION4, q.getOption4());
		values.put(KEY_DSASOL, q.getSol());

		// updating row
		return db.update(TABLE_DBMS, values, KEY_DSAID + " = ?", new String[] { String.valueOf(q.getID()) });
	}

	// Deleting single Quants
	public void deleteQuants(TestModelQuants quants) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_QUANTS, KEY_QUANTSID + " = ?", new String[] { String.valueOf(quants.getID()) });
		db.close();
	}

	// Deleting single clang
	public void deleteC(TestModelC c) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_CLANGUAGE, KEY_CLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
		db.close();
	}

	// Deleting single cpplang
	public void deleteCpp(TestModelCpp c) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_CPPLANGUAGE, KEY_CPPLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
		db.close();
	}

	// Deleting single jAVAlang
	public void deleteJava(TestModelJava c) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_JAVALANGUAGE, KEY_JAVALANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
		db.close();
	}

	// Deleting single HTMLlang
	public void deleteHTML(TestModelHTML c) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_HTMLLANGUAGE, KEY_HTMLLANGUAGEID + " = ?", new String[] { String.valueOf(c.getID()) });
		db.close();
	}

	// Deleting single VL
	public void deleteVL(TestModelVL v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_VL, KEY_VLID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	// Deleting single DBMS
	public void deleteDBMS(TestModelDBMS v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_DBMS, KEY_DBMSID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	// Deleting single DSA
	public void deleteDSA(TestModelDSA v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_DSA, KEY_DSAID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	// Deleting single OS
	public void deleteOS(TestModelOS v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_OS, KEY_OSID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	// Deleting single fav
	public void deletefav(TestModelFavourite v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_FAVOURITE, KEY_FAVOURITEID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	public void deletesb(ModelScoreBoard v) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_SBTABLE, KEY_SBID + " = ?", new String[] { String.valueOf(v.getID()) });
		db.close();
	}

	// Getting quants count
	public int getQuantsCount() {
		String countQuery = "SELECT  * FROM " + TABLE_QUANTS;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting c lang count
	public int getCCount() {
		String countQuery = "SELECT  * FROM " + TABLE_CLANGUAGE;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting cpp lang count
	public int getCppCount() {
		String countQuery = "SELECT  * FROM " + TABLE_CPPLANGUAGE;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting java lang count
	public int getJavaCount() {
		String countQuery = "SELECT  * FROM " + TABLE_JAVALANGUAGE;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting java lang count
	public int getHTMLCount() {
		String countQuery = "SELECT  * FROM " + TABLE_HTMLLANGUAGE;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting VL count
	public int getVLCount() {
		String countQuery = "SELECT  * FROM " + TABLE_VL;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting OScount
	public int getOSCount() {
		String countQuery = "SELECT  * FROM " + TABLE_OS;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting DBMScount
	public int getDBMSCount() {
		String countQuery = "SELECT  * FROM " + TABLE_DBMS;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting DSAcount
	public int getDSACount() {
		String countQuery = "SELECT  * FROM " + TABLE_DSA;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

	// Getting DSAcount
	public int getFavCount() {

		String countQuery = "SELECT  * FROM " + TABLE_FAVOURITE;

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}


}