package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class agencies extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agencies);

        TextView t1=(TextView)findViewById(R.id.textView1);
        t1.setText("1.   Amrai Pari(Paribarik Nirjaton Protirodh Jot)\n" +
                "\n" +
                "     Bangladesh ‘ We Can’ Secretariat\n" +
                "     6/4 A, Sir Sayed Road (2nd Floor) \n" +
                "     Mohammadpur, Dhaka-1207  \n" +
                "     Bangladesh  \n" +
                "     Tel: +88 02 9130265\n" +
                "     E-mail: info@wecan-bd.org\n" +
                "     Web: www.wecan-bd.org \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2.  Rokeya Sadan(Bangladesh Mahila Parisad)\n" +
                "\n" +
                "     Contact Person\n" +
                "     General Secretary, Central Committee\n" +
                "     Sufia Kamal Bhaban,\n" +
                "     10/B/I ,Segunbagicha, Dhaka-I 000\n" +
                "     Phone # 88-02-9582182, 88-02-9511904\n" +
                "     Fax #88-02-9563529\n" +
                "     E-mail # info@mahilaparishad.org");
    }
}
