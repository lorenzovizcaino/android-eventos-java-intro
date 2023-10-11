package com.example.android_eventos_java_intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ej03WithInnerCustomListenerActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        tv = findViewById(R.id.textView);

        Button b = findViewById(R.id.button);

        /* Se asigna un escuchador de tipo OnClickListener; objeto que contiene el método al que se llamará
        ante el evento de pulsar en el botón. De este modo, el objeto boton tendrá un
        objeto Listener que tiene el método onClick al que se llamará cuando suceda el evento. */
        b.setOnClickListener(new CustomOnClickListener());
        // Se asigna un objeto anónimo de la clase CustomOnClickListener.

    }

    /**
     * Clase interna (inner class) que implementa la interfaz OnClickListener. Igual que en el Ej02 pero
     * ahora tenemos visibilidad a los campos de la clase externa (enclosing class) directamente y no
     * es necesario pasarlos en el constructor.
     */
    private class CustomOnClickListener implements View.OnClickListener {
        /**
         * Método que saltará ante el evento de un click sobre el elemento.
         * @param v referencia al objeto de la vista que lanzó el evento (sobre la que se hizo click)
         */
        @Override
        public void onClick(View v) {
            tv.setText("Hi Teis3!");
        }

    }

}