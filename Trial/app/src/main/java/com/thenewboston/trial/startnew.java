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

public class startnew extends Activity {

    private static  final String TAG ="startnew";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startnew);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);
        ViewGroup headerView=(ViewGroup)getLayoutInflater().inflate(R.layout.header,mListView,false);
        mListView.addHeaderView(headerView);

        //Create the Person objects
        policestation john = new policestation("Kotwali Model Police Station, SMP, Sylhet","Kazir Bazar Rd","01713-374517");
        policestation steve = new policestation("Sylhet Metropolitan Police Office","Kumarpara Rd","0821-716968");
        policestation stacy = new policestation("Police Super Office","DC Office Rd","01713-374366");
        policestation ashley = new policestation("Dakkhin Surma Police Station","Sylhet City Bypass","01713-374518");
        policestation matt = new policestation("Lamabazar Police Outpost","Lamabazar Rd","0821-718025");
        policestation matt2 = new policestation("Amberkhana Police Station","Mojomdari Airport Rd 3100","--");
        policestation matt3 = new policestation("Jointapur Police Station","Jointiapur","01713374377");
        policestation matt4 = new policestation("Osmaninagor Police Station","Osmaninagor","01713374387");
        policestation matt5 = new policestation("Matt5","03-29-2001","Male");
        policestation matt6 = new policestation("Beani Bazar Police Station"," R281, Beanibazar","01713374382");
        policestation matt7 = new policestation("Golapgonj Model Police Station","Golapgonj","01713374383");
        policestation matt8 = new policestation("Kulaura Police Station","Kulaura","01713-374443");
        policestation matt9 = new policestation("Habigonj Police Station","Habigonj","01713-374398");
        policestation matt10 = new policestation("Kanaighat Police Station","Kanaighat","01713-374379");
        policestation matt11 = new policestation("Jagannathpur Police Station","Jagannthpur Town","01713-374420");

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
