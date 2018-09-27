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

public class for_chitt extends Activity {

    private static  final String TAG ="for_chitt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_chitt);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listchitt);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Baizid Bostami Police Station"," Baizid Thana road,Chittagong 4210","01713-373262");
        policestation steve = new policestation("Sadarghat Police Station","Strand Road","031-631414");
        policestation stacy = new policestation("Chakbazar Police Station","Lal Chand Rd","312860133");
        policestation ashley = new policestation("Victim Support Centre"," Dhaka Trunk Rd,Chittagong","--");
        policestation matt = new policestation("Kotwali Police Station","Kotowali Thana,Chittagong","031-619922");
        policestation matt2 = new policestation("EPZ Police Station","M. A Aziz Rd,Chittagong 4218","031-741100");
        policestation matt3 = new policestation("Rangunia Police Station","Chittagong-Rangunia Hwy,Rangunia","--");
        policestation matt4 = new policestation("Pachlaish Model Police Station","O.R. Nizam Rd,Chittagong","031-652797");
        policestation matt5 = new policestation("Bandar Police Station","Chittagong","031-722240");
        policestation matt6 = new policestation("Sadar Ghat Police Station","Strand Road,Chittagong","031-631414");
        policestation matt7 = new policestation("Halishohor Police Station"," আ/এ,ডাক্তার জাহাঙ্গীর কবির সড়ক,চট্টগ্রাম","031-715790");
        policestation matt8 = new policestation("Akbar Shah Police Station","Chittagong 4207","312773855");
        policestation matt9 = new policestation("Pahartali Police Station","Thana Rd,Chittagong"," 031-751335");
        policestation matt10 = new policestation("Boalkhali Police Station","Thana Rd, Boalkhali","01713-363747");
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
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
//        peopleList.add(matt11);

        policestationListAdapter adapter = new policestationListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

}
