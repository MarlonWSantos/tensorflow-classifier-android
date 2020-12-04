package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Lemure {

    private static String nome;
    private static int image;
    private static Context context;
    private static Lemure myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Lemure(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Lemure getInstance(Context context){
        if(myInstance==null){
            myInstance = new Lemure(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeLemure(){
        this.nome="LEMURE";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemLemure( ){

        this.image= R.drawable.lemure;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioLemure(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.lemure);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
