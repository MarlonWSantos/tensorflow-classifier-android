package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/12/2017.
 */

//Classe final do animal específico
public class Cao {
    private static String nome;
    private static int image;
    private static Context context;
    private static Cao myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Cao(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Cao getInstance(Context context){
        if(myInstance==null){
            myInstance = new Cao(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeCao(){
        this.nome="CACHORRO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemCao( ){

        this.image=R.drawable.cao;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioCao(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.cachorro);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}

