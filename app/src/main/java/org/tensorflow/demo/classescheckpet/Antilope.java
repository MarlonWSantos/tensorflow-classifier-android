package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Antilope {

    private static String nome;
    private static int image;
    private static Context context;
    private static Antilope myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Antilope(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Antilope getInstance(Context context){
        if(myInstance==null){
            myInstance = new Antilope(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeAntilope(){
        this.nome="ANTILOPE";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemAntilope( ){

        this.image= R.drawable.antilope;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioAntilope(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.antilope);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
