package com.thenewboston.trial;

import android.os.Bundle;
import android.app.Activity;

import com.github.barteksc.pdfviewer.PDFView;

public class child_pdf extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_pdf);

        PDFView pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("childact.pdf").load();

    }

}
