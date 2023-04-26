package model;

public class LanchaAmarilla extends Barco{
    private int capacidadRecoleccion;//capacidad por hora

    public LanchaAmarilla(String marca, int modelo,
                          int capacidadCombustible, float capacidadCarga,
                          int patente, float recoleccion) {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente, recoleccion);
        capacidadRecoleccion = 20;
    }

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }

    public void setCapacidadRecoleccion(int capacidadRecoleccion) {
        this.capacidadRecoleccion = capacidadRecoleccion;
    }

    @Override
    public void pescar(int tiempo) {
        setRecoleccion(tiempo * capacidadRecoleccion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "LanchaAmarilla{" +
                "capacidadRecoleccion=" + capacidadRecoleccion +
                '}';
    }
}
