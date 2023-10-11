package com.example.android_eventos_java_intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ej06ListenerIsActivity extends AppCompatActivity implements View.OnClickListener {
    /* También se puede implementar la interfaz-listener en la propia Activity, aunque puede confundir,
     ya que rompe el Principio de responsabilidad única
    (https://es.wikipedia.org/wiki/Principio_de_responsabilidad_%C3%BAnica).
    Normalmente no es la mejor solución. Sin embargo, fue una práctica habitual en algún tiempo y
    aún pueden encontrarse códigos que lo utilizan. */

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        tv = findViewById(R.id.textView);

        Button boton = findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tv.setText(R.string.hola_mundo);
        /* Permite acceso directo al contexto (la activity) */
    }

}