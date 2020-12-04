package org.tensorflow.demo.classescheckpet;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 26/03/2018.
 */

public class JanelaSobre extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_sobre);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}
