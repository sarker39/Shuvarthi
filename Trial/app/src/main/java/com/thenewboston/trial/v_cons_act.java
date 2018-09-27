package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.text.Html;
import android.graphics.Color;

public class v_cons_act extends Activity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_cons_act);

        t=(TextView) findViewById(R.id.tt);
                t.setText(Html.fromHtml("<p>fjfcrbbbbjnvcfrvkfmcnxc jkvnfknvkfnvjkkfjdgikkdjjkxkmcmjvkkdkofofkkmmxxfjfcrbbbbjnvcfrvkfmcnxc jkvnfknvkfnvjk\n</p>"));

    }



}
