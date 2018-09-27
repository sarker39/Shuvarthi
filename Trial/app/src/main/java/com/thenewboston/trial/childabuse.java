package com.thenewboston.trial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class childabuse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childabuse);
    }
    public void onClicklaw(View view){
        Intent i=new Intent(this, division.class);
        startActivity(i);
    }

    public void onClickpre(View view){
        Intent i=new Intent(this, prevention_child.class);
        startActivity(i);
    }

    public void onClickcons(View view){
        Intent i=new Intent(this,child_pdf.class);
        startActivity(i);
    }
}
