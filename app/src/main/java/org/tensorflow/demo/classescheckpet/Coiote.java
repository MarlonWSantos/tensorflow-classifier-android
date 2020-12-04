package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Coiote {

    private static String nome;
    private static int image;
    private static Context context;
    private static Coiote myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Coiote(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Coiote getInstance(Context context){
        if(myInstance==null){
            myInstance = new Coiote(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeCoiote(){
        this.nome="COIOTE";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemCoiote( ){

        this.image= R.drawable.coiote;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioCoiote(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.coiote);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
