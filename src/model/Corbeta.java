package model;

public class Corbeta extends Barco {
    private int cantidadJaulas;

    public Corbeta(int cantidadJaulas,String marca, int modelo,
                   int capacidadCombustible, float capacidadCarga,
                   int patente, float recoleccion) {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente, recoleccion);
        this.cantidadJaulas = cantidadJaulas;
        setCapacidadCarga(10000*cantidadJaulas);
    }

    @Override
    public void pescar(int tiempo) {
        setRecoleccion(getCapacidadCarga());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Corbeta{" +
                "cantidadJaulas=" + cantidadJaulas +
                '}';
    }
}
