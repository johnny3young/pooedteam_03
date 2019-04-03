package com.example.pooedteam_03.Formas;

public class Triangulo implements Figura {

    String nombre;
    double base;
    double altura;

    //Constructor
    public Triangulo (String nombre, double base, double altura){
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (this.base * this.altura)/2;
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
