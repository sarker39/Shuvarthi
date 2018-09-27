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

public class for_raj extends Activity {

    private static  final String TAG ="for_raj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_raj);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listraj);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Boalia Model Police Station","Rajshahi 6100","0721-774134");
        policestation steve = new policestation("Police Bouro of Investigation PBI","Vodra, Rd No 3, Rajshahi","0721-761687");
        policestation stacy = new policestation("Motihar Police Station","Rajshahi","0721-750040");
        policestation ashley = new policestation("Paba Model Police Station","Rajshahi - Naogaon Hwy, Nowhata","01713-373800");
        policestation matt = new policestation("Shahmokhdum Police Station"," Paba Para Road, Rajshahi","01713-373312");
        policestation matt2 = new policestation("Gorhanga Police Station","Upohar Movie Theater Rd, Rajshahi","--");
        policestation matt3 = new policestation("Malopara Police Fari Outpost","Saheb Bazar Rd, Rajshahi","01716-604028");
        policestation matt4 = new policestation("Naldanga Police Station","Naldanga,Natore,Natore-Naogaon Hwy,6400","01713-373863");
        policestation matt5 = new policestation("Bagha Police Station"," Bagha - Puthia Rd, Bagha","01713-373808");
        policestation matt6 = new policestation("Rajpara Police Station","Rajshahi","--");
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
        peopleList.add(matt5);
        peopleList.add(matt6);
//        peopleList.add(matt7);
//        peopleList.add(matt8);
//        peopleList.add(matt9);
//        peopleList.add(matt10);
//        peopleList.add(matt11);

        policestationListAdapter adapter = new policestationListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

}

