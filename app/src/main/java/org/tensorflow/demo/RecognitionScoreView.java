/* Copyright 2015 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

package org.tensorflow.demo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.tensorflow.demo.Classifier.Recognition;
import org.tensorflow.demo.classescheckpet.Animal;
import org.tensorflow.demo.classescheckpet.ImagemActivity;

import java.util.List;

public class RecognitionScoreView extends View implements ResultsView {
  private static final float TEXT_SIZE_DIP = 40;
  private List<Recognition> results;
  private final float textSizePx;
  private final Paint fgPaint;
  private final Paint bgPaint;
  private String name;
  private Bitmap image;
    //Cria objeto "animal" da classe "Animal"
  Animal animal = Animal.getInstance();

  public RecognitionScoreView(final Context context, final AttributeSet set) {
    super(context, set);

    textSizePx =
        TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, TEXT_SIZE_DIP, getResources().getDisplayMetrics());
    fgPaint = new Paint();
    fgPaint.setTextSize(textSizePx);

    bgPaint = new Paint();
    bgPaint.setColor(0xcc4285f4);
  }

  @Override
  public void setResults(final List<Recognition> results) {
    this.results = results;
    postInvalidate();
  }

    //Método que desenha no canvas o resultado do reconhecimento
  @Override
  public void onDraw(final Canvas canvas) {
    final int x = 10;
    int y = (int) (fgPaint.getTextSize() * 1.0f);

    canvas.drawPaint(bgPaint);
    if (results != null) {
      for (final Recognition recog : results) {
          //Armazena o resultado do reconhecimento
        name=recog.getTitle();
          //Envia para a classe animal o nome para ser analizado
        animal.setNome(name);
          //Recebe da classe animal o nome já analizado
        name=animal.getNomeAnimal();
          //Exibe no canvas o nome do animal
        canvas.drawText(name,x,y,fgPaint);

        break;
      }
    }
  }
}
