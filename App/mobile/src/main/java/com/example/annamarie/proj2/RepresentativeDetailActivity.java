package com.example.annamarie.proj2;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RepresentativeDetailActivity extends AppCompatActivity {

    public String name;
    public String party;
    public String bills;
    public String committees;
    public int photo;
    public String tenure;
    public String term;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_representative_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            name = extras.getString("name");
            party = extras.getString("party");
            bills = extras.getString("bills");
            committees = extras.getString("committees");
            photo = extras.getInt("image");
            tenure = extras.getString("tenure");
            term = extras.getString("term");
        }

        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        imageView.setImageResource(photo);
        final TextView name1 = (TextView) findViewById(R.id.textView4);
        final TextView party1 = (TextView) findViewById(R.id.textView5);
        final TextView tenure1 = (TextView) findViewById(R.id.textView7);
        final TextView term1 = (TextView) findViewById(R.id.textView9);
        name1.setText(name);
        party1.setText(party);
        tenure1.setText(tenure);
        term1.setText(term);
        final TextView bill1 = (TextView) findViewById(R.id.textView11);
        final TextView c1 = (TextView) findViewById(R.id.textView13);
        bill1.setText(bills);
        c1.setText(committees);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), RepresentativeListActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }

}