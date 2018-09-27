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

public class for_bar extends Activity {

    private static  final String TAG ="for_bar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_bar);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listbar);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Barisal Police Station","Police Line Rd, Barisal","--");
        policestation steve = new policestation("Barisal Bimanbandar Police Station","Dhaka-Barisal Hwy"," 0431-65233");
        policestation stacy = new policestation("Batazore Police Station","Dhaka-Barisal Hwy","--");
        policestation ashley = new policestation("Agailjhara Police Station"," A1612, Agailjhara 8240","01713-374274");
        policestation matt = new policestation("Rajoir Police Station","Bhanga - Barisal Hwy, Rajoir","01713-373586");
        policestation matt2 = new policestation("JhalkathiPolice Station","Jhalkathi 8400","01918-832424");
        policestation matt3 = new policestation("Police Super Office","Fazlul Haque Avenue Road, Barisal","01713-374260");
        policestation matt4 = new policestation("Barguna West Police Outpost","R880, Barguna"," 0448-62314");
        policestation matt5 = new policestation("Kaunia Model Police Station","Barisal 8200","01865-815276");
        policestation matt6 = new policestation("Bagura Police Outpost","Medical Rd,Barisal","--");
        policestation matt7 = new policestation("Barisal DIG Karjaloy","Fazlul Haque Ave, Barisal","--");
        policestation matt8 = new policestation("Alekanda Police Outpost","Polytechnic College Rd,Barisal","--");
        policestation matt9 = new policestation("Muladi Police Station","Muladi ","--");
       // policestation matt10 = new policestation("Boalkhali Police Station","Thana Rd, Boalkhali","01713-363747");
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
       // peopleList.add(matt10);
//        peopleList.add(matt11);

        policestationListAdapter adapter = new policestationListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

}

