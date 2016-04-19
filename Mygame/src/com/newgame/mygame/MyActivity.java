package com.newgame.mygame;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MyActivity extends Activity {
ImageButton a,b,c;
Button e;
ImageView d;
MediaPlayer son;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_my);
		a=(ImageButton) findViewById(R.id.play);
		b=(ImageButton) findViewById(R.id.set);
		c=(ImageButton) findViewById(R.id.exit);
		e=(Button) findViewById(R.id.about);
		son=MediaPlayer.create(MyActivity.this, R.raw.gamem);
		son.start();
		son.setLooping(true);
	   
		e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent aa=new Intent("com.newgame.mygame.ABOUT");
				startActivity(aa);
			}
		});
		c.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				son.release();
				System.exit(0);
			}
		});
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent dd=new Intent("com.newgame.mygame.SETTING");
				startActivity(dd);
				
			}
		});
		a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				son.release();
				Intent ff=new Intent("com.newgame.mygame.PLAY");
				startActivity(ff);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my, menu);
		return true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		
	}
	

}
