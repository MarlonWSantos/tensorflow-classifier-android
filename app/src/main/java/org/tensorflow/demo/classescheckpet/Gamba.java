package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Gamba {

    private static String nome;
    private static int image;
    private static Context context;
    private static Gamba myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Gamba(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Gamba getInstance(Context context){
        if(myInstance==null){
            myInstance = new Gamba(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeGamba(){
        this.nome="GAMBA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemGamba( ){

        this.image= R.drawable.gamba;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioGamba(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.gamba);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
