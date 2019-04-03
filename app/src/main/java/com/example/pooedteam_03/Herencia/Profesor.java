package com.example.pooedteam_03.Herencia;

import android.util.Log;

public class Profesor extends Persona {

    public Profesor () {
        super();
    }

    public Profesor (String n){
        super();
    }

    public void ensenar (){
        Log.d(String.valueOf(this), "Estoy enseñando");
    }

    //Overloading / Sobrecarga de métodos
    public void ensenar (String materia){
        Log.d(String.valueOf(this), "Enseñando: " + materia);
    }

    //Override / Sobreescritura de métodos (Se hace sobre la Herencia o Polimorfismo)

    @Override
    public void comer(){
        Log.d(String.valueOf(this),"Estoy comiendo, soy vegetariano");
    }

}
