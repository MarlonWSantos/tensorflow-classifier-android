package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class PorcoEspinho {

    private static String nome;
    private static int image;
    private static Context context;
    private static PorcoEspinho myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public PorcoEspinho(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static PorcoEspinho getInstance(Context context){
        if(myInstance==null){
            myInstance = new PorcoEspinho(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomePorcoEspinho(){
        this.nome="PORCO-ESPINHO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemPorcoEspinho( ){

        this.image= R.drawable.porcoespinho;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioPorcoEspinho(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.porcoespinho);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
