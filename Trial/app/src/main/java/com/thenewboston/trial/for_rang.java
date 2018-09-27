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

public class for_rang extends Activity {

    private static  final String TAG ="for_rang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_rang);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listrang);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Kotwali Police Station","Kotwali Thana Rd, Rangpur 5400","0521-61639");
        policestation steve = new policestation("University Police Station","Park Mor, Begum Rokeya University, Rangpur","--");
        policestation stacy = new policestation("Gangachara Police Station","Thanapara Rd, Gangachara"," 01713-373875");
        policestation ashley = new policestation("RAB-13 office","College Rd,Rangpur","01718-657777");
        policestation matt = new policestation("Kaunia Police Station","Thana Rd, Kaunia","01713-373880");
        policestation matt2 = new policestation("Taraganj Police Station","Taraganj Thanapara Rd, Kursha"," 01713-373877");
        policestation matt3 = new policestation("Pirganj Police Station","Pirganj","01713-373881");
        policestation matt4 = new policestation("DIG of Police Rangpur Range","DIG,Rangpur Range,Keeramottia Moszid Rd,Rangpur","--");
//        policestation matt5 = new policestation("Bandar Police Station","Chittagong","031-722240");
//        policestation matt6 = new policestation("Sadar Ghat Police Station","Strand Road,Chittagong","031-631414");
//        policestation matt7 = new policestation("Halishohor Police Station"," আ/এ,ডাক্তার জাহাঙ্গীর কবির সড়ক,চট্টগ্রাম","031-715790");
//        policestation matt8 = new policestation("Akbar Shah Police Station","Chittagong 4207","312773855");
//        policestation matt9 = new policestation("Pahartali Police Station","Thana Rd,Chittagong"," 031-751335");
//        policestation matt10 = new policestation("Boalkhali Police Station","Thana Rd, Boalkhali","01713-363747");
//        policestation matt11 = new policestation("Kotwali Police Station","Dhaka","7116255");

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
//        peopleList.add(matt5);
//        peopleList.add(matt6);
//        peopleList.add(matt7);
//        peopleList.add(matt8);
//        peopleList.add(matt9);
//        peopleList.add(matt10);
//        peopleList.add(matt11);

        policestationListAdapter adapter = new policestationListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

}

