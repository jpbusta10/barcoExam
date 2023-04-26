package model;

import java.util.ArrayList;

public abstract class Barco {
    private String marca;
    private int modelo;
    private int capacidadCombustible;
    private float capacidadCarga; // toneladas de pescado
    private int patente;
    private float recoleccion; /// pescado recolectado en bodega
    public abstract void pescar(int tiempo);

    public Barco(String marca, int modelo, int capacidadCombustible, float capacidadCarga, int patente, float recoleccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
        this.recoleccion = recoleccion;
    }

    public Barco() {
    }

    public float getRecoleccion() {
        return recoleccion;
    }

    public void setRecoleccion(float recoleccion) {
        this.recoleccion = recoleccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente=" + patente +
                ", recoleccion=" + recoleccion +
                '}';
    }
}
