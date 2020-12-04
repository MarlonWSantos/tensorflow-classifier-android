package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Preguica {

    private static String nome;
    private static int image;
    private static Context context;
    private static Preguica myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Preguica(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Preguica getInstance(Context context){
        if(myInstance==null){
            myInstance = new Preguica(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomePreguica(){
        this.nome="PREGUICA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemPreguica( ){

        this.image= R.drawable.preguica;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioPreguica(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.preguica);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
