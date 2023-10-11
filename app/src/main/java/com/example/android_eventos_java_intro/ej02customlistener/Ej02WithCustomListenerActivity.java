package com.example.android_eventos_java_intro.ej02customlistener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.android_eventos_java_intro.R;

public class Ej02WithCustomListenerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        Button b = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textView);

        /** Creación de clase que implementa el listener. Estilo clásico Java. Es raro hacerlo así ya que no
         tiene mucho sentido tener un clase solo para eso. Generas ficheros innecesariamente.
         Simplemente es importante comprenderlo como paso previo para comprender el uso de clases anónimas (Ej04). */

        /* Se asigna un escuchador de tipo OnClickListener; objeto que contiene el método al que se llamará
        ante el evento de pulsar en el botón. De este modo, el objeto boton tendrá un
        objeto Listener que tiene el método onClick al que se llamará cuando suceda el evento. */
        b.setOnClickListener(new CustomOnClickListener(tv));
        // Se asigna un objeto anónimo de la clase CustomOnClickListener.

    }


}