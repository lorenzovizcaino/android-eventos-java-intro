package com.example.android_eventos_java_intro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_eventos_java_intro.ej02customlistener.Ej02WithCustomListenerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Setea la vista a partir del fichero activity_main.xml

        // Busca objeto con id "btn_to_metodo_xml" en clase R (autogenerada a partir de los xml)
        Button b1 = findViewById(R.id.btn_to_metodo_xml);
        /* La clase R contiene los identificadores de todos los objetos autogenerados desde los
        ficheros de recursos en res/layout */


        /** Para movernos entre activities (1), será necesario usar Intents explicitos.
         Instanciamos un objeto Intent, una abstracción de la intención de cambiar de actividad.
         Su constructor recibe como argumentos:
         - El contexto de partida: la activity en que está.
         (AppCompatActivity hereda de Activity, que a su vez hereda de Context.Por tanto, toda
         activity es un contexto válido.)
         - La clase de la Activity que ha de ser creada. Como esta activity todavía no se puede
         instaciar, se usa la sintaxis .class (reflection).
         */
        Intent intent = new Intent(this, Ej01MetodoXMLActivity.class);


        /** Asigno al botón la función de callback (la acción a realizar cuando se pulsa).
         En este caso llamo al método startActivity que recibe como argumento el intent que le indica
         qué activity crear. (Se utiliza en este caso una función lambda. Se entendrá analizando los
         ejempos de las otras activities) */
        b1.setOnClickListener(v -> startActivity(intent));


        /* Haciendo lo mismo con el resto de botones: */

        Button b2 = findViewById(R.id.btn_to_listener_personalizado);
        Button b3 = findViewById(R.id.btn_to_listener_personalizado_inner);
        Button b4 = findViewById(R.id.btn_to_clase_anonima);
        Button b5 = findViewById(R.id.btn_to_lambda);
        Button b6 = findViewById(R.id.btn_to_activity_listener);


        b2.setOnClickListener(v -> startActivity(new Intent(this, Ej02WithCustomListenerActivity.class)));
        b3.setOnClickListener(v -> startActivity(new Intent(this, Ej03WithInnerCustomListenerActivity.class)));
        b4.setOnClickListener(v -> startActivity(new Intent(this, Ej04ClaseAnonimaActivity.class)));
        b5.setOnClickListener(v -> startActivity(new Intent(this, Ej05LambdaActivity.class)));
        b6.setOnClickListener(v -> startActivity(new Intent(this, Ej06ListenerIsActivity.class)));


    }
}


/**
 * (1) Para crear una nueva activity: (File > New > Activity > Empty Activity).
 */