package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Furao {

    private static String nome;
    private static int image;
    private static Context context;
    private static Furao myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Furao(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Furao getInstance(Context context){
        if(myInstance==null){
            myInstance = new Furao(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeFurao(){
        this.nome="FURAO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemFurao( ){

        this.image= R.drawable.furao;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioFurao(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.furao);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
