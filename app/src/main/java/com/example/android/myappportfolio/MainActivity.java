package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
private Button btnPopularMovies,btnStackHawk, btnBuildItBigger,btnAppMaterial,btnGoUbiquitous,btnCapstone;

    // onCreate is executed when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the file activity_main.xml as the user interface
        setContentView(R.layout.activity_main);

        // To be able to edit the TextView with our code we have to create it and
        // bind it to a TextView object. I need to use final because it will be
        // used in the inner class below
       /* final TextView firstTextView = (TextView) findViewById(R.id.textView);

        // I set up the Button just like I did the TextView
        Button firstButton = (Button) findViewById(R.id.firstButton);

        // This is how you make the Button change the text in the TextView when it is clicked
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstTextView.setText("You Clicked");

            }
        });*/
        btnPopularMovies = (Button)findViewById(R.id.firstButton);
        btnStackHawk= (Button)findViewById(R.id.firstButton1);
        btnBuildItBigger= (Button)findViewById(R.id.firstButton2);
        btnAppMaterial= (Button)findViewById(R.id.firstButton3);
        btnGoUbiquitous= (Button)findViewById(R.id.firstButton4);
        btnCapstone= (Button)findViewById(R.id.firstButton5);

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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBtnPopularMoviesClick(View view) {
        String response = "This button will launch my Popular Movies App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }

    public void onBtnStockHawkClick(View view) {
        String response = "This button will launch my Stock Hawk App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }

    public void onBtnBuildItBiggerClick(View view) {
        String response = "This button will launch my Build it Bigger App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }

    public void onBtnAppMaterialClick(View view) {
        String response = "This button will launch my Make Your App Material App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }

    public void onBtnGoUbiquitousClick(View view) {
        String response = "This button will launch my Go Ubiquitous App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }

    public void onBtnCapstoneClick(View view) {
        String response = "This button will launch my Capstone App!";
        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();
    }
}