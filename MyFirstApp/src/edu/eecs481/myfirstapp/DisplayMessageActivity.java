package edu.eecs481.myfirstapp;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class DisplayMessageActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the messages from the intent
	    Intent intent = getIntent();
	    ArrayList<String> messages = intent.getStringArrayListExtra(MainActivity.EXTRA_MESSAGE);
	    
	    String display = new String();
	    
	    //Creates single combined String of user messages
	    for(int i = 0; i < messages.size(); i++)
	    {
	    	display = display + (i + 1) + ") " +  messages.get(i) + '\n';
	    }

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(30);
	    textView.setText(display);

	    // Set the text view as the activity layout
	    setContentView(textView);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}