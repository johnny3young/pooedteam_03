package com.example.pooedteam_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.pooedteam_03.Formas.Circulo;
import com.example.pooedteam_03.Formas.Figura;
import com.example.pooedteam_03.Formas.Rectangulo;
import com.example.pooedteam_03.Formas.Triangulo;
import com.example.pooedteam_03.Herencia.Persona;
import com.example.pooedteam_03.Herencia.Profesor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona();
        persona.nombre = "Johnny";
        persona.saludar();
        persona.comer();

        Profesor profesor = new Profesor("Michael");
       // profesor.nombre = "Faruth";
        profesor.saludar();
        profesor.ensenar();
        profesor.ensenar("Matemáticas");
        profesor.comer();


        Figura formas []  = new Figura[3];

        formas [0] = new Rectangulo("Rectangulo",20,30);
        formas [1] = new Circulo("Circulo",15);
        formas [2] = new Triangulo("Triángulo",10,20);

        for (Figura v : formas){
            Log.d(String.valueOf(this),"Área del " + v.getNombre() +" "+ + v.getArea());
        }


    }
}
