package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Zebra {

    private static String nome;
    private static int image;
    private static Context context;
    private static Zebra myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Zebra(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Zebra getInstance(Context context){
        if(myInstance==null){
            myInstance = new Zebra(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeZebra(){
        this.nome="ZEBRA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemZebra( ){

        this.image= R.drawable.zebra;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioZebra(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.zebra);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
