package com.thenewboston.trial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class violence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_violence);
    }
    public void onClicklaw(View view){
        Intent i=new Intent(this, division.class);
        startActivity(i);
    }

    public void onClickc(View view){
        Intent i=new Intent(this, pdff.class);
        startActivity(i);
    }

    public void onClickagen(View view){
        Intent i=new Intent(this, agencies.class);
        startActivity(i);
    }
}
