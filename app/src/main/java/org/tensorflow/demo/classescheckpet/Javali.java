package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Javali {

    private static String nome;
    private static int image;
    private static Context context;
    private static Javali myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Javali(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Javali getInstance(Context context){
        if(myInstance==null){
            myInstance = new Javali(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeJavali(){
        this.nome="JAVALI";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemJavali( ){

        this.image= R.drawable.javali;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioJavali(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.javali);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
