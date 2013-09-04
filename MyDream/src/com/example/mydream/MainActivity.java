package com.example.mydream;

import java.io.IOException;
import java.util.List;
import android.os.Bundle;
import android.app.ListActivity;
import android.database.CursorIndexOutOfBoundsException;

import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;




public class MainActivity extends ListActivity { 
	DataBaseHelper		 dbs = new DataBaseHelper(this);	
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
   
	











public void Dreams() throws IOException{
	 final EditText message ;
	 message   = (EditText)findViewById(R.id.edit_message);	
     final String  choice = message.getText().toString();
     if(message.length()==0){
    	 message.setError("Dream input is required"); 
        }else{
              try{
                    List<Contact> dreams = dbs.getDreams(choice);
	                final String[] result = new String[dbs.getDreams(choice).size()];
	                 int i=0;
	                 for(Contact cn : dreams)
	                 {   
	                    result[i] = cn.getDream();
	                    i++;
	                    }
		               ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
				       android.R.layout.simple_list_item_1,result);
                        setListAdapter(listAdapter);
	                    if(result.length==0){
		                        message.setError("Sorry! No search result found for your input");
	                            }
    		
    		              final ListView lv = (ListView) findViewById(android.R.id.list);
                          lv.setTextFilterEnabled(true);
	                      lv.setOnItemClickListener(new OnItemClickListener()
	                      {
	                          public void onItemClick(AdapterView<?> arg, View v, int position, long id){
		                            String dream1 = (lv.getItemAtPosition(position).toString());
		                             try{
		                                  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
		                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
		                                  List<Contact> K = dbs.getKatherine(dream1);
		                                  List<Contact> KC = dbs.getKatherineContacts(dream1);
		                                  List<Contact> Xanto = dbs.getXanto(dream1);
		                                  List<Contact> XantoInt = dbs.getXantoContacts(dream1);
		                                  List<Contact> Grant = dbs.getGrant(dream1);
		                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
		                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Xanto.toString(),XantoInt.toString(),Grant.toString(),GrantInt.toString(),K.toString(),KC.toString()} ;
			                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
						                  android.R.layout.simple_list_item_1,values1);
		                                   setListAdapter(listAdapter1);
		                                  
		                                  } catch (CursorIndexOutOfBoundsException ieo) {
				                                   
				                               try {
														 List<Contact>	GustavusInt = dbs.getGustavusContacts(dream1);
														 List<Contact> Gustavus = dbs.getGustavus(dream1);
														 List<Contact> Xanto = dbs.getXanto(dream1);
						                                 List<Contact> XantoInt = dbs.getXantoContacts(dream1);
						                                 List<Contact> Grant = dbs.getGrant(dream1);
						                                 List<Contact> GrantInt = dbs.getGrantContacts(dream1);
						                                 String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Xanto.toString(),XantoInt.toString(),Grant.toString(),GrantInt.toString()} ;
						                                 ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
												                  android.R.layout.simple_list_item_1,values1);
								                                   setListAdapter(listAdapter1); 
				                               } catch (CursorIndexOutOfBoundsException ieo1) {
				                                   
					                               try {
					                            	   
					                            	     List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
														 List<Contact> Gustavus = dbs.getGustavus(dream1);
														 List<Contact> Xanto = dbs.getXanto(dream1);
						                                 List<Contact> XantoInt = dbs.getXantoContacts(dream1);
						                                 List<Contact> K = dbs.getKatherine(dream1);
						                                 List<Contact> KC = dbs.getKatherineContacts(dream1);
						                                 String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Xanto.toString(),XantoInt.toString(),K.toString(),KC.toString()} ;
						                                 ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
												                  android.R.layout.simple_list_item_1,values1);
								                                   setListAdapter(listAdapter1); 

					                            	   
					                               } catch (CursorIndexOutOfBoundsException ieo2) {   
					                            	try{
					                            		  List<Contact> Xanto = dbs.getXanto(dream1);
						                                  List<Contact> XantoInt = dbs.getXantoContacts(dream1);
						                                  List<Contact> Grant = dbs.getGrant(dream1);
						                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
						                                  List<Contact> K = dbs.getKatherine(dream1);
							                              List<Contact> KC = dbs.getKatherineContacts(dream1);
							                              String[]  values1 = new String[]{Xanto.toString(),XantoInt.toString(),Grant.toString(),GrantInt.toString(),K.toString(),KC.toString()} ;
							                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
										                  android.R.layout.simple_list_item_1,values1);
						                                   setListAdapter(listAdapter1);
					                            	 } catch (CursorIndexOutOfBoundsException ieo3) {  
					                                 try{
					                                	  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
						                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
						                                  List<Contact> K = dbs.getKatherine(dream1);
						                                  List<Contact> KC = dbs.getKatherineContacts(dream1);
						                                  List<Contact> Grant = dbs.getGrant(dream1);
						                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
						                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Grant.toString(),GrantInt.toString(),K.toString(),KC.toString()} ;
							                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
										                  android.R.layout.simple_list_item_1,values1);
						                                   setListAdapter(listAdapter1);
								                            
						                            	 } catch (CursorIndexOutOfBoundsException ieo4) { 
						                            		 try{
								                                  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
								                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
								                                  List<Contact> Xanto = dbs.getXanto(dream1);
								                                  List<Contact> XantoInt = dbs.getXantoContacts(dream1);
								                                 
								                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Xanto.toString(),XantoInt.toString()} ;
									                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
												                  android.R.layout.simple_list_item_1,values1);
								                                   setListAdapter(listAdapter1);
						                            		 
						                            		 } catch (CursorIndexOutOfBoundsException ieo5) {
						                            			 
						                            			 try{
						   		                                  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
						   		                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
						   		                                  List<Contact> Grant = dbs.getGrant(dream1);
						   		                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
						   		                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),Grant.toString(),GrantInt.toString()} ;
						   			                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
						   						                  android.R.layout.simple_list_item_1,values1);
						   		                                   setListAdapter(listAdapter1);
						   		                                  
						   		                                  } catch (CursorIndexOutOfBoundsException ieo6) {
						   		                                	  
						   		                                	 try{
						   			                                  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
						   			                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
						   			                                  List<Contact> K = dbs.getKatherine(dream1);
						   			                                  List<Contact> KC = dbs.getKatherineContacts(dream1);
						   			                                 
						   			                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString(),K.toString(),KC.toString()} ;
						   				                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
						   							                  android.R.layout.simple_list_item_1,values1);
						   			                                   setListAdapter(listAdapter1);
						   			                                  
						   			                                  } catch (CursorIndexOutOfBoundsException ieo7) {
						   			                                	  
						   			                                	 try{
						   				                                 
						   				                                  List<Contact> Xanto = dbs.getXanto(dream1);
						   				                                  List<Contact> XantoInt = dbs.getXantoContacts(dream1);
						   				                                  List<Contact> Grant = dbs.getGrant(dream1);
						   				                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
						   				                                  String[]  values1 = new String[]{Xanto.toString(),XantoInt.toString(),Grant.toString(),GrantInt.toString()} ;
						   					                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
						   								                  android.R.layout.simple_list_item_1,values1);
						   				                                   setListAdapter(listAdapter1);
						   				                                  
						   				                                  } catch (CursorIndexOutOfBoundsException ieo8) {
						   				                                	  
						   				                                	try{
											                            		  List<Contact> Xanto = dbs.getXanto(dream1);
												                                  List<Contact> XantoInt = dbs.getXantoContacts(dream1);
												                                  List<Contact> K = dbs.getKatherine(dream1);
													                              List<Contact> KC = dbs.getKatherineContacts(dream1);
													                              String[]  values1 = new String[]{Xanto.toString(),XantoInt.toString(),K.toString(),KC.toString()} ;
													                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
																                  android.R.layout.simple_list_item_1,values1);
												                                   setListAdapter(listAdapter1);
											                            	 } catch (CursorIndexOutOfBoundsException ieo9) { 
											                            		 
											                            		  try{
												                                	 
													                                  List<Contact> K = dbs.getKatherine(dream1);
													                                  List<Contact> KC = dbs.getKatherineContacts(dream1);
													                                  List<Contact> Grant = dbs.getGrant(dream1);
													                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
													                                  String[]  values1 = new String[]{Grant.toString(),GrantInt.toString(),K.toString(),KC.toString()} ;
														                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
																	                  android.R.layout.simple_list_item_1,values1);
													                                   setListAdapter(listAdapter1);
															                            
													                            	 } catch (CursorIndexOutOfBoundsException ieo10) { 
													                            		 try{
														                                	 
															                                  List<Contact> K = dbs.getKatherine(dream1);
															                                  List<Contact> KC = dbs.getKatherineContacts(dream1);
															                                 
															                                  String[]  values1 = new String[]{K.toString(),KC.toString()} ;
																                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
																			                  android.R.layout.simple_list_item_1,values1);
															                                   setListAdapter(listAdapter1);
																	                            
															                            	 } catch (CursorIndexOutOfBoundsException ieo11) { 
															                            		 
															                            		 
															                            		 try{
															   		                                  List<Contact> GustavusInt = dbs.getGustavusContacts(dream1);
															   		                                  List<Contact> Gustavus = dbs.getGustavus(dream1);
															   		                                 
															   		                                  String[]  values1 = new String[]{Gustavus.toString(),GustavusInt.toString()} ;
															   			                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
															   						                  android.R.layout.simple_list_item_1,values1);
															   		                                   setListAdapter(listAdapter1);
															   		                                  
															   		                                  } catch (CursorIndexOutOfBoundsException ieo12) {
													                            	 
															   		                                	 try {
																											
																											 List<Contact> Xanto = dbs.getXanto(dream1);
																			                                 List<Contact> XantoInt = dbs.getXantoContacts(dream1);
																			                                 
																			                                 String[]  values1 = new String[]{Xanto.toString(),XantoInt.toString()} ;
																			                                 ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
																									                  android.R.layout.simple_list_item_1,values1);
																					                                   setListAdapter(listAdapter1); 
																	                               } catch (CursorIndexOutOfBoundsException ieo13) {
																	                            	   try{
																		                                	 
																			                                
																			                                  List<Contact> Grant = dbs.getGrant(dream1);
																			                                  List<Contact> GrantInt = dbs.getGrantContacts(dream1);
																			                                  String[]  values1 = new String[]{Grant.toString(),GrantInt.toString()} ;
																				                              ArrayAdapter<String>  listAdapter1 = new ArrayAdapter<String>(MainActivity.this,
																							                  android.R.layout.simple_list_item_1,values1);
																			                                   setListAdapter(listAdapter1);
																					                            
																			                            	 } catch (CursorIndexOutOfBoundsException ieo14) { 
						                            		 
			                      }
													
					                                
                                 } catch (IOException e) {
																										
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
            });
	 	 
	                                                                                     
            }catch(CursorIndexOutOfBoundsException ieo){ }   
    }//end of else.....




}

}


	
	     
	             
               	
	
