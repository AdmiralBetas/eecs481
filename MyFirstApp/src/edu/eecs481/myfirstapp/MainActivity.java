package edu.eecs481.myfirstapp;

import java.util.ArrayList;
import java.util.Date;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "edu.eecs481.myfirstapp.MESSAGE";
	public final static String RECORD_BUTTON_TEXT = "Record";
	public final static String RECORDED_TEXT = "Recorded!";
	
	private static ArrayList<String> messages = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button record = (Button) findViewById(R.id.record_message);
	    record.setText(RECORD_BUTTON_TEXT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/** Called when the user clicks the Record button.
	 * Adds input message to messages Vector. */
	public void recordMessage(View view) {
	    EditText editText = (EditText) findViewById(R.id.edit_message);
	    String message = editText.getText().toString();
	    Date timestamp = new Date();
	    
	    message = timestamp + ": " + message;
	    messages.add(message);
	    
	    final Button record = (Button) findViewById(R.id.record_message);
	    record.setText(RECORDED_TEXT);
	    //Indicates message was recorded
	    
	    //Waits 1 second, then resets Record button to default text.
	    CountDownTimer resetTimer = new CountDownTimer(1000, 1000) {
	    	public void onTick(long millisUntilFinished) {};
	    	
	        public void onFinish() {
	            record.setText(RECORD_BUTTON_TEXT);
	        }
	     };
	    
	    resetTimer.start();  
	}
	
	/** Called when the user clicks the Display Messages button */
	public void displayMessages(View view) {
	    Intent intent = new Intent(this, DisplayMessageActivity.class);
	    intent.putExtra(EXTRA_MESSAGE, messages);
	    startActivity(intent);
	}

}
