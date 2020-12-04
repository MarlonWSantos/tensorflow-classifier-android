package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.widget.ImageView;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/12/2017.
 */

//Classe final do animal específico
public class Gato {
    private static String nome;
    private static int image;
    private static Context context;
    private static Gato myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Gato(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Gato getInstance(Context context){
        if(myInstance==null){
            myInstance = new Gato(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeGato(){
        this.nome="GATO";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemGato( ){

        this.image = R.drawable.gato;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioGato(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.gato);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}



