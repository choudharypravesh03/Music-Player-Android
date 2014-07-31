package com.project.npplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {
   
	@Override
	protected void onCreate(Bundle pc) {
		// TODO Auto-generated method stub
		super.onCreate(pc);
		setContentView(R.layout.splash);
		
		
		
		Thread timer=new Thread(){
			public void run(){
				try{
				sleep(5000);
			} catch (InterruptedException e){
				e.printStackTrace();
				
			}finally{
				Intent openMainActivity= new Intent("com.project.npplayer.MAINACTIVITY");
				startActivity(openMainActivity);
			}
		}
	};
	timer.start();

}

	

	

}