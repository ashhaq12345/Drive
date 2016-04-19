package com.newgame.mygame;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Main extends Activity{
	MediaPlayer song;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cover);
		song= MediaPlayer.create(Main.this, R.raw.covers);
		song.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent ss= new Intent("com.newgame.mygame.MYACTIVITY");
					startActivity(ss);
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
	
	

}
