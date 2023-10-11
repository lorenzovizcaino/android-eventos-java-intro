package com.example.android_eventos_java_intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ej04ClaseAnonimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        TextView tv = findViewById(R.id.textView);
        Button boton = findViewById(R.id.button);


        /* Implementación usando una clase anónima. */

        boton.setOnClickListener(new View.OnClickListener() {  // (1)
                                     @Override
                                     public void onClick(View view) {
                                         tv.setText("Hi Teis4!");
                                     }
                                 }
        );


    }
}

/* (1) El listener se instancia (new) a partir de una clase anónima.
En lugar de crear una clase nueva (como en los Ejemplos 2 y 3),
    tras el new omitimos el nombre de esa clase personalizada
    y ponemos directamente el de la interfaz que implementa. Esto normalmente es
incorrecto ya que una interfaz no es instanciable. Pero al abrir directamente la llave podemos
introducir directamente la definición de lo que sería esa clase a la que no le estamos dando nombre.

De ese modo, definimos directamente la clase en el momento en que la instanciamos, sin
necesidad de definirla explicitamente y asignarle un nombre.

Esto permite reducir código. Como podemos ver,
    el comportamiento es el mismo que en los ejemplos 2 y 3
    pero empieza a ser mucho más legible y por tanto, mantenible y escalable.

 */