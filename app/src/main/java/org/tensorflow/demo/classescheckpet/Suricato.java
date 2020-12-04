package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Suricato {

    private static String nome;
    private static int image;
    private static Context context;
    private static Suricato myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Suricato(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Suricato getInstance(Context context){
        if(myInstance==null){
            myInstance = new Suricato(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeSuricato(){
        this.nome="SURICATO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemSuricato( ){

        this.image= R.drawable.suricato;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioSuricato(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.suricato);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
