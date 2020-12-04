package org.tensorflow.demo.classescheckpet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;

import org.tensorflow.demo.ClassifierActivity;
import org.tensorflow.demo.R;

/**
 * Created by infoig on 26/02/2018.
 */

public class TelaInicial extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*1.0),(int)(height*1.0));


        /*Handeler para transição automática entre a Tela Inicial e o Tensorflow*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Mudança da Tela Inicial para o reconhecimento na câmera
                Intent i = new Intent(TelaInicial.this, ClassifierActivity.class);
                startActivity(i);
                finish();
                //Espera de 5 segundos antes de trocar de tela
            }
        }, 5000);
    }
}
