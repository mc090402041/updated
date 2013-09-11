package com.example.mydream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
//import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

                //The Android's default system path of your application database.
                @SuppressLint("SdCardPath")
                private static String DB_PATH = "/data/data/com.example.mydream/databases/";

                private static String DB_NAME = "data.db";
                private SQLiteDatabase myDataBase;
                public static final String TABLE_COMMENTS = "Interpretations";
                public static final String COLUMN_ID = "_id";
                public static final String COLUMN_COMMENT = "Interpretation";
                private final Context myContext;

                int size = 0 ;



                public DataBaseHelper(Context context) {

                        super(context, DB_NAME, null, 1);
                        this.myContext = context;
                }


                public void createDataBase() throws IOException {

                                boolean dbExist = checkDataBase();

                                if (dbExist) {
                                                //do nothing - database already exist

                                        } else {

                                                //By calling this method and empty database will be created into the default system path
                                                //of your application so we are gonna be able to overwrite that database with our database.
                                                this.getReadableDatabase();

                                                try {

                                                                copyDataBase();

                                                        } catch (IOException e) {

                                                                throw new Error("Error copying database");

                                                        }
                                        }

                        }

                /**
                 * Check if the database already exist to avoid re-copying the file each time you open the application.
                 * @return true if it exists, false if it doesn't
                 */
                private boolean checkDataBase() {

                        SQLiteDatabase checkDB = null;

                        try {
                                        String myPath = DB_PATH + DB_NAME;
                                        checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

                                } catch (SQLiteException e) {

                                        //database does't exist yet.

                                }

                        if (checkDB != null) {

                                        checkDB.close();

                                }

                        return checkDB != null ? true : false;
                }

                /**
                 * Copies your database from your local assets-folder to the just created empty database in the
                 * system folder, from where it can be accessed and handled.
                 * This is done by transfering bytestream.
                 * */
                private void copyDataBase() throws IOException {

                                //Open your local db as the input stream
                                InputStream myInput = myContext.getAssets().open(DB_NAME);

                                // Path to the just created empty db
                                String outFileName = DB_PATH + DB_NAME;

                                //Open the empty db as the output stream
                                OutputStream myOutput = new FileOutputStream(outFileName);

                                //transfer bytes from the inputfile to the outputfile
                                byte[] buffer = new byte[1024];
                                int length;

                                while ((length = myInput.read(buffer)) > 0) {
                                                myOutput.write(buffer, 0, length);
                                        }

                                //Close the streams
                                myOutput.flush();

                                myOutput.close();

                                myInput.close();

                        }

                public void openDataBase() throws SQLException {

                                //Open the database
                                String myPath = DB_PATH + DB_NAME;
                                myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

                        }

                @Override

                public synchronized void close() {

                        if (myDataBase != null)
                                myDataBase.close();

                        super.close();

                }

                @Override
                public void onCreate(SQLiteDatabase db) {
                }

                @Override
                public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                }

                public List<Contact> getDreams(String d) throws IOException {
                                List<Contact> contactList = new ArrayList<Contact>();
                                // Select All Query
                                String selectQuery = "SELECT DISTINCT Dream FROM Interpretations where Dream Like '" + d + "%'" ;

                                SQLiteDatabase db = this.getWritableDatabase();
                                Cursor cursor = db.rawQuery(selectQuery, null);

                                if (cursor.moveToFirst())
                                        do {
                                                        Contact contact = new Contact(cursor.getString(0));



                                                        // Adding contact to list
                                                        contactList.add(contact);

                                                } while (cursor.moveToNext());

                                return contactList;

                        }

                public List<Contact> getDreamsReal(String d) throws IOException {
                                List<Contact> contactList = new ArrayList<Contact>();
                                // Select All Query
                                String selectQuery = "SELECT Dream FROM Interpretations where Dream = '" + d + "'";

                                SQLiteDatabase db = this.getWritableDatabase();
                                Cursor cursor = db.rawQuery(selectQuery, null);

                                if (cursor.moveToFirst())
                                        do {
                                                        Contact contact = new Contact(cursor.getString(0));



                                                        // Adding contact to list
                                                        contactList.add(contact);

                                                } while (cursor.moveToNext());

                                return contactList;

                        }


                public List<Contact> getGustavusContacts(String dream) throws IOException {
                                List<Contact> contactList = new ArrayList<Contact>();
                                // Select All Query
                                String selectQuery = "SELECT Interpretation FROM Interpretations where Author  IN ('Gustavus Miller')  AND Dream = '" + dream + "' ";

                                SQLiteDatabase db = this.getReadableDatabase();
                                Cursor cursor = db.rawQuery(selectQuery, null);

                                if (cursor != null)
                                        cursor.moveToFirst();

                                Contact contact = new Contact(cursor.getString(0));

                                // retur n contact
                                contactList.add(contact);

                                return contactList;

                        }

                public List<Contact> getGustavusContactsreal(String dream) throws IOException {
                                List<Contact> contactList = new ArrayList<Contact>();
                                // Select All Query
                                String selectQuery = "SELECT Interpretation FROM Interpretations where Author  IN ('Gustavus Miller')  AND Dream = '" + dream + "' ";

                                SQLiteDatabase db = this.getReadableDatabase();
                                Cursor cursor = db.rawQuery(selectQuery, null);

                                if (cursor != null)
                                        cursor.moveToFirst();

                                Contact contact = new Contact(cursor.getString(0));

                                // retur n contact
                                contactList.add(contact);

                                return contactList;

                        }

                public List<Contact> getXantoContacts(String dream) throws IOException {
                                List<Contact> contactList = new ArrayList<Contact>();
                                // Select All Query
                                String selectQuery = "SELECT Interpretation FROM Interpretations where Author  IN ('Xanto')  AND Dream Like '" + dream + "%' ";

                                SQLiteDatabase db = this.getReadableDatabase();
                                Cursor cursor = db.rawQuery(selectQuery, null);

                                if (cursor != null)
                                        cursor.moveToFirst();

                                Contact contact = new Contact(cursor.getString(0));

                                // retur n contact
                                contactList.add(contact);

                                return contactList;
                        }

                public List<Contact> getGustavus(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Author FROM Interpretations   where   Author  IN ('Gustavus Miller')  AND Dream ='" + dream + "' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // retur n contact
                        contactList.add(contact);

                        return contactList;


                }

                public List<Contact> getXanto(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Author FROM Interpretations   where   Author  IN ('Xanto')  AND Dream ='" + dream + "' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // retur n contact
                        contactList.add(contact);

                        return contactList;


                }

                public List<Contact> getGrant(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Author FROM Interpretations   where   Author  IN ('A.H Grant')  AND Dream ='" + dream + "' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // return contact
                        contactList.add(contact);

                        return contactList;


                }

                public List<Contact> getGrantContacts(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Interpretation FROM Interpretations where Author  IN ('A.H Grant')  AND Dream Like '" + dream + "%' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // retur n contact
                        contactList.add(contact);

                        return contactList;


                }

                public List<Contact> getKatherine(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Author FROM Interpretations   where   Author  IN ('Mrs. Katherine')  AND Dream ='" + dream + "' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // retur n contact
                        contactList.add(contact);

                        return contactList;


                }

                public List<Contact> getKatherineContacts(String dream) {
                        List<Contact> contactList = new ArrayList<Contact>();
                        String selectQuery = "SELECT Interpretation FROM Interpretations where Author  IN ('Mrs. Katherine')  AND Dream Like '" + dream + "%' ";

                        SQLiteDatabase db = this.getReadableDatabase();
                        Cursor cursor = db.rawQuery(selectQuery, null);

                        if (cursor != null)
                                cursor.moveToFirst();

                        Contact contact = new Contact(cursor.getString(0));

                        // retur n contact
                        contactList.add(contact);

                        return contactList;
                }
        }