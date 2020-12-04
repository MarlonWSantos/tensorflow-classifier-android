package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Bovino {

    private static String nome;
    private static int image;
    private static Context context;
    private static Bovino myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Bovino(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Bovino getInstance(Context context){
        if(myInstance==null){
            myInstance = new Bovino(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeBovino(){
        this.nome="BOVINO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemBovino( ){

        this.image= R.drawable.bovino;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioBovino(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.bovino);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
