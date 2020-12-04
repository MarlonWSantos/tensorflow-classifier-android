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
public class Leao {
    private static String nome;
    private static int image;
    private static Context context;
    private static Leao myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Leao(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Leao getInstance(Context context){
        if(myInstance==null){
            myInstance = new Leao(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeLeao(){
        this.nome="LEAO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemLeao( ){

        this.image=R.drawable.leao;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioLeao(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.leao);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}



