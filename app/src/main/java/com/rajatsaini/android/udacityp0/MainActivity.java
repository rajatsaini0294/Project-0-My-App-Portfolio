package com.rajatsaini.android.udacityp0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void clickEvenHandler(View view){
        Button btn = (Button) view;
        switch(btn.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "This button will launch my Scores App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "This button will launch my Library App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(getApplicationContext(), "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
