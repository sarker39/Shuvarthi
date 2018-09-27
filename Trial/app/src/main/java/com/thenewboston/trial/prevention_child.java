package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class prevention_child extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention_child);

        TextView t1=(TextView)findViewById(R.id.textView1);
        t1.setText("1.\"Save the Children \"\n" +
                "   Bangladesh country office \n" +
                "   House No. CWN (A) 35, Road No. 43 \n" +
                "   Gulshan – 2, Dhaka -1212\n" +
                "   Bangladesh.\n" +
                "   Tel  : +88-02-9848081, 9861690\n" +
                "   Fax  : +88-02-58812523\n" +
                "   E-Mail:info.bangladesh@savethechildren.org");
    }
}
