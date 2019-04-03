package com.example.pooedteam_03.Formas;

public class Rectangulo implements Figura {

    String nombre;
    double alto;
    double ancho;

    //Constructor
    public Rectangulo(String nombre, double alto, double ancho){
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return this.alto * this.ancho;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }


}
