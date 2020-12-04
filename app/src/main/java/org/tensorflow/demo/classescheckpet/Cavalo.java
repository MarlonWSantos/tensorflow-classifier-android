package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Cavalo {

    private static String nome;
    private static int image;
    private static Context context;
    private static Cavalo myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Cavalo(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Cavalo getInstance(Context context){
        if(myInstance==null){
            myInstance = new Cavalo(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeCavalo(){
        this.nome="CAVALO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemCavalo( ){

        this.image= R.drawable.cavalo;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioCavalo(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.cavalo);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
