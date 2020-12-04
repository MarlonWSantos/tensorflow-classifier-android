package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Baleia {

    private static String nome;
    private static int image;
    private static Context context;
    private static Baleia myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Baleia(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Baleia getInstance(Context context){
        if(myInstance==null){
            myInstance = new Baleia(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeBaleia(){
        this.nome="BALEIA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemBaleia( ){

        this.image= R.drawable.baleia;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioBaleia(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.baleia);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
