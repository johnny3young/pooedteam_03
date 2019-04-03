package com.example.pooedteam_03.Herencia;

import android.util.Log;

public class Persona {

    public String nombre;
    public int edad;
    public float alto;
    public float peso;


    // Constructor sobrecargado
    public Persona(){
        this.nombre = "Elver";
    }

    public Persona(String n){
        this.nombre = n;
    }

    //Comportamiento o método de SALUDAR
    public void saludar (){
        Log.d(String.valueOf(this), "saludar: Hola, soy " + nombre);
    }

    //Comportamiento o método de COMER
    public void comer(){
        Log.d(String.valueOf(this),"Estoy comiendo");
    }

}
