package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class division extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
    }

    public void onClicksyl(View view){
        Intent i=new Intent(this,startnew.class);
        startActivity(i);
    }

    public void onClickdha(View view){
        Intent i=new Intent(this,for_dhaka.class);
        startActivity(i);
    }

    public void onClickchitt(View view){
        Intent i=new Intent(this,for_chitt.class);
        startActivity(i);
    }

    public void onClickraj(View view){
        Intent i=new Intent(this,for_raj.class);
        startActivity(i);
    }

    public void onClickkhul(View view){
        Intent i=new Intent(this,for_khul.class);
        startActivity(i);
    }

    public void onClickbar(View view){
        Intent i=new Intent(this,for_bar.class);
        startActivity(i);
    }

    public void onClickrang(View view){
        Intent i=new Intent(this,for_rang.class);
        startActivity(i);
    }

}
