package com.example.mydream;

import java.io.IOException;
import java.util.List;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;


//import android.content.Intent;
import android.view.Menu;
import android.view.View;
//import android.widget.AdapterView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
// android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;




public class MainActivity extends ListActivity {
                DataBaseHelper dbs = new DataBaseHelper(this);


                @Override
                protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);
                }

                @Override
                public boolean onCreateOptionsMenu(Menu menu) {
                        // Inflate the menu; this adds items to the action bar if it is present.
                        getMenuInflater().inflate(R.menu.main, menu);
                        return true;
                }

                public void onClick(View view) throws IOException {
                                Dreams();




                        }


                public void Dreams() throws IOException {

                                final ListView lv = (ListView) findViewById(android.R.id.list);

                                final EditText message ;
                                message = (EditText)findViewById(R.id.edit_message);
                                final String choice = message.getText().toString();

                                if (message.length() == 0) {

                                                message.setError("Dream input is required");

                                        } else {
                                                try {
                                                                List<Contact> dreams = dbs.getDreams(choice);
                                                                final String[] result = new String[dbs.getDreams(choice).size()];
                                                                int i = 0;

for (Contact cn : dreams) {
                                                                                result[i] = cn.getDream();
                                                                                i++;
                                                                        }

                                                                if (result.length != 0) {
                                                                                lv.setVisibility(0);

                                                                                ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                                                                                                                   android.R.layout.simple_list_item_1, result);
                                                                                setListAdapter(listAdapter);

                                                                        } else if (result.length == 0) {

                                                                                message.setError("Sorry! No search result found for your input");

                                                                        }


                                                        } catch (IOException ieo) {}

                                        }



                                lv.setOnItemClickListener(new OnItemClickListener() {

                                                                  public void onItemClick(AdapterView < ? > parent, View view,
                                                                                          int position, long id) {
                                                                          try {

                                                                                          int max = 1;

                                                                                          if (position == 0) {
                                                                                                          String dream1 = (lv.getItemAtPosition(0).toString());
                                                                                                          Intent myIntent = new Intent(view.getContext(), SecondActivity.class);
                                                                                                          myIntent.putExtra("name", dream1);
                                                                                                          startActivityForResult(myIntent, 0);
                                                                                                  }

                                                                                          List<Contact> dreams = dbs.getDreams(choice);
                                                                                          final String[] result = new String[dbs.getDreams(choice).size()];
                                                                                          int i = 0;

                                                                                          for (Contact cn : dreams) {
                                                                                                          result[i] = cn.getDream();
                                                                                                          i++;

                                                                                                  }

                                                                                          int position1 = 1;

                                                                                          while (position1 != result.toString().length()) {
                                                                                                          if (position == position1) {

                                                                                                                          String dream2 = (lv.getItemAtPosition(max).toString());
                                                                                                                          Intent myIntent = new Intent(view.getContext(), SecondActivity.class);
                                                                                                                          myIntent.putExtra("name", dream2);
                                                                                                                          startActivityForResult(myIntent, 0);

                                                                                                                  }

                                                                                                          max++;
                                                                                                          position1++;
                                                                                                  }

                                                                                  } catch (IOException ioe) {}

                                                                  }

                                                          }

                                                         );
                        }





        }





