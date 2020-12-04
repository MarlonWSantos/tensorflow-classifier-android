package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Hiena {

    private static String nome;
    private static int image;
    private static Context context;
    private static Hiena myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Hiena(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Hiena getInstance(Context context){
        if(myInstance==null){
            myInstance = new Hiena(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeHiena(){
        this.nome="HIENA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemHiena( ){

        this.image= R.drawable.hiena;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioHiena(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.hiena);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
