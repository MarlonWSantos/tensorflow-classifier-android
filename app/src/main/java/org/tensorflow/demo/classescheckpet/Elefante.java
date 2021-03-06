package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Elefante {

    private static String nome;
    private static int image;
    private static Context context;
    private static Elefante myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Elefante(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Elefante getInstance(Context context){
        if(myInstance==null){
            myInstance = new Elefante(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeElefante(){
        this.nome="ELEFANTE";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemElefante( ){

        this.image= R.drawable.elefante;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioElefante(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.elefante);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
