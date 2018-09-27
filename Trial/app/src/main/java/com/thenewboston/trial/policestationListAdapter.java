package com.thenewboston.trial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by CnE on 7/19/2017.
 */

public class policestationListAdapter extends ArrayAdapter<policestation> {
    private static  final String TAG ="policestationListAdapter";

    private Context mContext;
    int mResource;

    public policestationListAdapter(Context context, int resource, ArrayList<policestation> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String station = getItem(position).getStation();
        String address = getItem(position).getAddress();
        String contact = getItem(position).getContact();

        policestation person = new policestation(station,address,contact);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvStation=(TextView)convertView.findViewById(R.id.textView1);
        TextView tvAddress=(TextView)convertView.findViewById(R.id.textView2);
        TextView tvContact=(TextView)convertView.findViewById(R.id.textView3);

        tvStation.setText(station);
        tvAddress.setText(address);
        tvContact.setText(contact);

        return convertView;
    }
}
