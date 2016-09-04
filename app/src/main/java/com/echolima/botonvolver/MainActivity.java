package com.echolima.botonvolver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button botonBienvenida = (Button) findViewById(R.id.btnBotonBienvenida);

        botonBienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Código a ejecutar
                Intent linkActivity2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(linkActivity2);
            }
        });*/
    }

    // Una forma más sencilla para hacer botones es declarar los métodos en MainActivity (public) y luego
    // añadir en el xml correspondiente el atributo Onclick = "llamar_al_metodo"
    public void irSegundaActividad(View v){// porque se le pasa como parametro un view??
        Intent linkActivity2 = new Intent(this, Main2Activity.class);
        startActivity(linkActivity2);

    }
}
