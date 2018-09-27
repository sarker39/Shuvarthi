package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class for_khul extends Activity {

    private static  final String TAG ="for_khul";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_khul);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listkhul);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Shonadanga Model Police Station","Majid Sarani,Khulna 9200","01713-373286");
        policestation steve = new policestation("Khulna Metropolitan Police","BIDC Rd, Khulna","--");
        policestation stacy = new policestation("Khulna Sadar Police Station","K.D. Ghos Rd, Khulna","01713-373285");
        policestation ashley = new policestation("Gollamari Police Box","Khulna","01911-764907");
        policestation matt = new policestation("DIG - Khulna Office","1 Soto Boyra Masjid Bari Rd, Khulna","01713-374096");
        policestation matt2 = new policestation("Police Outpost","Maddha Para Rd, Khulna","--");
        policestation matt3 = new policestation("Doulatpur Police Station","Khulna","01713-373293");
        policestation matt4 = new policestation("Shibbari Police Outpost"," KDA Ave, Khulna","--");
        policestation matt5 = new policestation("Boyra Police Outpost","Palpara Rd, Khulna 9000","--");
        policestation matt6 = new policestation("Arong-ghata Police Station","Satkhira Rd, Khulna","01558-328305");
        policestation matt7 = new policestation("Khanjahan Ali Police Station","Gaffar Food Rood, Khulna","--");
        policestation matt8 = new policestation("Phultala Police Station","Dhaka-Khulna Highway, Phultala","--");
        policestation matt9 = new policestation("Horintana Police Station","Khulna City Bypass, Khulna","01711-211904");
        policestation matt10 = new policestation("Khalishpur Police Station"," 103 BIDC Rd, Khulna 9300","--");
        policestation matt11 = new policestation("Narail Police Line","Khulna Rd","01719-485430");

        //Add the Person objects to an ArrayList
        ArrayList<policestation> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
        peopleList.add(matt11);

        policestationListAdapter adapter = new policestationListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

}
