package org.tensorflow.demo.classescheckpet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 06/04/2018.
 */

public class Raposa {

    private static String nome;
    private static int image;
    private static Context context;
    private static Raposa myInstance;

    //Construtor que recebe parâmetros dos objetos criados na classe Animal
    public Raposa(Context context){
        this.context=context;
    }

    //Permite a criação de objetos na classe Animal
    public static Raposa getInstance(Context context){
        if(myInstance==null){
            myInstance = new Raposa(context);
        }
        return myInstance;
    }
    //Retorna o nome do animal específico para a classe Animal
    public String getNomeRaposa(){
        this.nome="RAPOSA";
        return this.nome;
    }
    //Retorna a imagem do animal específico para a classe Animal
    public int getImagemRaposa( ){

        this.image= R.drawable.raposa;
        return this.image;
    }
    //Retorna o audio do animal específico para a classe Animal
    public void getAudioRaposa(){
        MediaPlayer mPlayer = MediaPlayer.create(context,R.raw.raposa);
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mPlayer.start();
    }
}
