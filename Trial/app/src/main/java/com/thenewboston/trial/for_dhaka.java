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

public class for_dhaka extends Activity {

    private static  final String TAG ="for_dhaka";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_dhaka);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listdhaka);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Uttara Police Station","Dhaka","01199-883740");
        policestation steve = new policestation("Uttara Police Station","Dhaka","01794-449949");
        policestation stacy = new policestation("Badda Police Station","Dhaka","01713-373173");
        policestation ashley = new policestation("New Market","Dhaka","02-8631942");
        policestation matt = new policestation("Ramna Model Police Station","Dhaka","02-9350468");
        policestation matt2 = new policestation("Airport Police Outpost","Dhaka","01713-373162");
        policestation matt3 = new policestation("Sher-e-Bangla City Police Station","Dhaka","01711-024119");
        policestation matt4 = new policestation("Vatara Police Station","Dhaka","01769-058055");
        policestation matt5 = new policestation("Sutrapur Police Station","Dhaka","02-7116233");
        policestation matt6 = new policestation("Khilgaon Police Station","Dhaka","02-7219090");
        policestation matt7 = new policestation("Banani Police Station","Dhaka","---");
        policestation matt8 = new policestation("Mirpur Model Police Station","Dhaka","--");
        policestation matt9 = new policestation("Mothijhil Police Station","Dhaka","---");
        policestation matt10 = new policestation("Gulshan Police Station","Dhaka","---");
        policestation matt11 = new policestation("Kotwali Police Station","Dhaka","7116255");

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
