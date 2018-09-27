package com.thenewboston.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class loggedIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
    }
    public void onClickV(View view) {
        Intent i = new Intent(this, violence.class);
        startActivity(i);
    }

    public void onClickE(View view) {
        Intent i = new Intent(this, evetease.class);
        startActivity(i);
    }

    public void onClickC(View view) {
        Intent i = new Intent(this, childabuse.class);
        startActivity(i);
    }
}
