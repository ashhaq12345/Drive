package com.newgame.mygame;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Setting extends ListActivity{
    String set[]={"Difficulty","Volume"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Setting.this, android.R.layout.simple_list_item_1, set));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		super.onListItemClick(l, v, position, id);
		String c=set[position];
		
		
		try{
		Class<?> ourclass= Class.forName("com.newgame.mygame."+c);
		Intent hh=new Intent(Setting.this,ourclass);
		startActivity(hh);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
	

	
}
