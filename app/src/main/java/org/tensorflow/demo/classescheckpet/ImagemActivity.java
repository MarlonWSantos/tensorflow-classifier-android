package org.tensorflow.demo.classescheckpet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.tensorflow.demo.R;

/**
 * Created by infoig on 28/02/2018.
 */
    //Classe que exibe a imagem do animal
public class ImagemActivity extends Activity{
            //Cria um objeto do tipo Animal
        Animal animal = Animal.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagem_activity);

            //Cria uma imageView para exibir a foto do animal
        ImageView imageView = (ImageView)findViewById(R.id.foto);

            //Alterando dentro da imageView o endereço da foto do animal armazenado na classe Animal.java
        imageView.setImageResource(animal.getImageAnimal());//Inserindo a foto com getImageAnimal()

            //Captura as informações sobre o display do device como altura e largura da tela
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

            //Armazena a largura da tela
        int width=dm.widthPixels;
            //Armazena a altura da tela
        int height=dm.heightPixels;

            //Insere no layout da activity a exibição da imagem na proporção: largura de 80% e altura de 47%
        getWindow().setLayout((int)(width*.80),(int)(height*.47));
    }
}
