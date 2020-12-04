package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class PorquinhoDaIndia {

    private static String nome;
    private static int image;
    private static Context context;
    private static PorquinhoDaIndia myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public PorquinhoDaIndia(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static PorquinhoDaIndia getInstance(Context context){
        if(myInstance==null){
            myInstance = new PorquinhoDaIndia(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomePorquinhoDaIndia(){
        this.nome="PORQUINHO-DA-INDIA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemPorquinhoDaIndia( ){

        this.image= R.drawable.porquinhodaindia;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioPorquinhoDaIndia(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.porquinhodaindia);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
