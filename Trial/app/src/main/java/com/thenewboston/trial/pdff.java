package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;
import com.github.barteksc.pdfviewer.PDFView;

public class pdff extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdff);

        PDFView pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("copy.pdf").load();

    }

}
