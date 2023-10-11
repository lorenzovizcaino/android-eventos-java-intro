package com.example.android_eventos_java_intro.ej02customlistener;

import android.view.View;
import android.widget.TextView;

/* Clase que implemente la interfaz OnClickListener, que obliga a sobreescribir el método onClick */
class CustomOnClickListener implements View.OnClickListener {
    private TextView tv;

    /**
     * El constructor tiene que recibir la referencia al TextView ya que pertenece a la
     * activity (está en su contexto), y necesitamos acceso a él para las acciones a realizar en
     * el método onClick.
     */
    public CustomOnClickListener(TextView tv) {
        this.tv=tv;
    }


    /**
     * Método que saltará ante el evento de un click sobre el elemento.
     */
    @Override
    public void onClick(View vista) {
        // Cambiando el texto del TextView con el contenido del EditText
        tv.setText("Hi Teis2!");
    }

}
