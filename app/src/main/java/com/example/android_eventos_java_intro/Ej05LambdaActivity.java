package com.example.android_eventos_java_intro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ej05LambdaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reutilizado);

        TextView tv = findViewById(R.id.textView);
        Button boton = findViewById(R.id.button);


        boton.setOnClickListener((View v) -> {
            tv.setText("¡Hi Teis5");
        });

        // o, mejor, el equivalente en una línea:
        boton.setOnClickListener(view -> tv.setText("¡Hi Teis5!"));

    }

}

/*
View.OnClickListener es una interfaz funcional (una interfaz que solo tiene un único método abstracto).
Desde Java 8, este tipo de interfaces pueden representarse mediante una función lambda.

Las funciones lambda son funciones anónimas (no tienen un nombre) que pueden ser tratadas como
objetos (asignadas a variables o pasadas como parámetros), de este modo, son una herramienta
central del paradigma de programación funcional.

Una función lambda se compone de sus parámetros de entrada y el código que ejecuta, al igual
que cualquier otra función o método (los métodos son funciones encapsuladas en clases), pero sin un
nombre. Una función lambda puede ser tratada directamente como un objeto, sin necesidad de crear
un objeto listener que la contenga.

Al tener una interfaz funcional un único método, lo relevante de ella son los parámetros
que recibe la función que implementa y los parámetros que devuelve.

El método setOnClickListener recibe directamente el método onClick de la clase anónima pero convertido
a una función lambda. Esa función tiene el parámetro de entrada vista(la view en la que se hizo click)
y como salida la definición del comportamiento que realiza ante el evento onClick (el contenido del
método onClick).

onClick (View vista) { instrucciones_definiendo_el_metodo }
es por tanto equivalente a:
(View vista) -> { instrucciones_definiendo_el_metodo }
que, por tener como contenido de la función una sola instrucción, puede simplificarse a
(View vista) -> instruccion
y, ya que la semántica del método que recibe la lambda (setOnClickListener) deja claro el
parámetro recibido, en busca de simplificar cada vez más el código, se puede dejar simplemente en:
vista -> instruccion

En este caso, el parámetro vista no lo estamos usando para nada, pero si quisiesemos modificar algo
del propio botón cuando se pulsa en este, podríamos utilizar la variable vista al lado derecho de la
flecha.

Cuando se implementa una clase anónima, el propio IDE sugiere cambiarla por una lambda. Es importante
fijarse cuando el IDE resalta algo en amarillo en el mensaje que nos sugiere para mejorar nuestro
código.

Es muy interesante utilizar las sugerencias que el IDE nos da al pulsar en la bombilla amarilla tras
dejar el cursor sobre la lambda (o pulsando Alt+Intro) para cambiar automáticamente entre las distintas
formas de representar este código.


*/