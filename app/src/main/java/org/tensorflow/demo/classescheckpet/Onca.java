package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Onca {

    private static String nome;
    private static int image;
    private static Context context;
    private static Onca myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Onca(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Onca getInstance(Context context){
        if(myInstance==null){
            myInstance = new Onca(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeOnca(){
        this.nome="ONCA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemOnca( ){

        this.image= R.drawable.onca;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioOnca(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.onca);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
