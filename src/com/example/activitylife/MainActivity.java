package com.example.activitylife;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(MainActivity.this, "On Create", Toast.LENGTH_LONG);
        t.show();
        v1=(EditText) findViewById(R.id.editText1 );
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	 Toast t= Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_LONG);
         t.show();
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	 Toast t= Toast.makeText(MainActivity.this, "On Resume", Toast.LENGTH_LONG);
         t.show();
    }
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	 Toast t= Toast.makeText(MainActivity.this, "On Pause", Toast.LENGTH_LONG);
         t.show();
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	v1.setText("Hello");
    	 Toast t= Toast.makeText(MainActivity.this, "On Stop", Toast.LENGTH_LONG);
         t.show();
         
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	 Toast t= Toast.makeText(MainActivity.this, "On Destroy", Toast.LENGTH_LONG);
         t.show();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
