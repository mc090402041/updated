package com.example.mydream;
import java.io.IOException;
import java.util.List;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends Activity {
                DataBaseHelper dbs = new DataBaseHelper(this);

                @SuppressLint("NewApi")
                @Override
                public void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);

                        setContentView(R.layout.activity_main2);
                        interpr("name");
                        getActionBar().setDisplayHomeAsUpEnabled(true);
                }

                @Override
                public boolean onOptionsItemSelected(MenuItem item) {
                        switch (item.getItemId()) {
                                                // Respond to the action bar's Up/Home button
                                                case android.R.id.home:
                                                NavUtils.navigateUpFromSameTask(this);
                                                return true;
                                }

                        return super.onOptionsItemSelected(item);
                }



                public void interpr(String item) {
                        final ListView lv1 = (ListView) findViewById(android.R.id.list);
                        Intent i = getIntent();
                        String dream1 = i.getStringExtra(item.toString());

                        try {
                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                        List<Contact> K = dbs.getKatherine(dream1);
                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                        List<Contact> Grant = dbs.getGrant(dream1);
                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Xanto.toString(), XantoInt.toString(), Grant.toString(), GrantInt.toString(), K.toString(), KC.toString()} ;
                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                            android.R.layout.simple_list_item_1, values1);
                                        lv1.setAdapter(listAdapter1);

                                } catch (CursorIndexOutOfBoundsException ieo) {

                                        try {
                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Xanto.toString(), XantoInt.toString(), Grant.toString(), GrantInt.toString()} ;
                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                            android.R.layout.simple_list_item_1, values1);
                                                        lv1.setAdapter(listAdapter1);

                                                } catch (CursorIndexOutOfBoundsException ieo1) {

                                                        try {

                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Xanto.toString(), XantoInt.toString(), K.toString(), KC.toString()} ;
                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                        lv1.setAdapter(listAdapter1);


                                                                } catch (CursorIndexOutOfBoundsException ieo2) {
                                                                        try {
                                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                                                                        String[] values1 = new String[]{Xanto.toString(), XantoInt.toString(), Grant.toString(), GrantInt.toString(), K.toString(), KC.toString()} ;
                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                        lv1.setAdapter(listAdapter1);

                                                                                } catch (CursorIndexOutOfBoundsException ieo3) {
                                                                                        try {
                                                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Grant.toString(), GrantInt.toString(), K.toString(), KC.toString()} ;
                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                } catch (CursorIndexOutOfBoundsException ieo4) {
                                                                                                        try {
                                                                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);

                                                                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Xanto.toString(), XantoInt.toString()} ;
                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                } catch (CursorIndexOutOfBoundsException ieo5) {

                                                                                                                        try {
                                                                                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), Grant.toString(), GrantInt.toString()} ;
                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo6) {

                                                                                                                                        try {
                                                                                                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                                                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);
                                                                                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);

                                                                                                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString(), K.toString(), KC.toString()} ;
                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo7) {

                                                                                                                                                        try {

                                                                                                                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                                                                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                                                                                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                                                                                                        String[] values1 = new String[]{Xanto.toString(), XantoInt.toString(), Grant.toString(), GrantInt.toString()} ;
                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo8) {

                                                                                                                                                                        try {
                                                                                                                                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                                                                                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);
                                                                                                                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                                                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                                                                                                                                                                        String[] values1 = new String[]{Xanto.toString(), XantoInt.toString(), K.toString(), KC.toString()} ;
                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo9) {

                                                                                                                                                                                        try {

                                                                                                                                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                                                                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);
                                                                                                                                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                                                                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                                                                                                                                        String[] values1 = new String[]{Grant.toString(), GrantInt.toString(), K.toString(), KC.toString()} ;
                                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo10) {
                                                                                                                                                                                                        try {

                                                                                                                                                                                                                        List<Contact> K = dbs.getKatherine(dream1);
                                                                                                                                                                                                                        List<Contact> KC = dbs.getKatherineContacts(dream1);

                                                                                                                                                                                                                        String[] values1 = new String[]{K.toString(), KC.toString()} ;
                                                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo11) {


                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                        List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
                                                                                                                                                                                                                                        List<Contact> Gustavus = dbs.getGustavus(dream1);

                                                                                                                                                                                                                                        String[] values1 = new String[]{Gustavus.toString(), GustavusInt.toString()} ;
                                                                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo12) {

                                                                                                                                                                                                                                        try {

                                                                                                                                                                                                                                                        List<Contact> Xanto = dbs.getXanto(dream1);
                                                                                                                                                                                                                                                        List<Contact> XantoInt = dbs.getXantoContacts(dream1);

                                                                                                                                                                                                                                                        String[] values1 = new String[]{Xanto.toString(), XantoInt.toString()} ;
                                                                                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo13) {
                                                                                                                                                                                                                                                        try {


                                                                                                                                                                                                                                                                        List<Contact> Grant = dbs.getGrant(dream1);
                                                                                                                                                                                                                                                                        List<Contact> GrantInt = dbs.getGrantContacts(dream1);
                                                                                                                                                                                                                                                                        String[] values1 = new String[]{Grant.toString(), GrantInt.toString()} ;
                                                                                                                                                                                                                                                                        ArrayAdapter<String> listAdapter1 = new ArrayAdapter<String>(this,
                                                                                                                                                                                                                                                                                                            android.R.layout.simple_list_item_1, values1);
                                                                                                                                                                                                                                                                        lv1.setAdapter(listAdapter1);

                                                                                                                                                                                                                                                                } catch (CursorIndexOutOfBoundsException ieo14) {
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                        catch (IOException e) {

                                                                                                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                } catch (IOException e) {

                                                                                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                }
                                                                                                                                                                                                }

                                                                                                                                                                                } catch (IOException e) {

                                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                                }

                                                                                                                                                                } catch (IOException e) {

                                                                                                                                                                        e.printStackTrace();
                                                                                                                                                                }

                                                                                                                                                } catch (IOException e) {

                                                                                                                                                        e.printStackTrace();
                                                                                                                                                }

                                                                                                                                } catch (IOException e) {

                                                                                                                                        e.printStackTrace();
                                                                                                                                }

                                                                                                                } catch (IOException e) {

                                                                                                                        e.printStackTrace();
                                                                                                                }

                                                                                                } catch (IOException e) {

                                                                                                        e.printStackTrace();
                                                                                                }

                                                                                } catch (IOException e) {

                                                                                        e.printStackTrace();
                                                                                }

                                                                } catch (IOException e) {

                                                                        e.printStackTrace();
                                                                }

                                                } catch (IOException e) {

                                                        e.printStackTrace();
                                                }

                                } catch (IOException e) {

                                        e.printStackTrace();
                                }

                }






        }








