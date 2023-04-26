package model;

import java.util.ArrayList;

public class Pesquera {
    ArrayList<Barco> barcos = new ArrayList<Barco>();
    private  float recolectadoEnDeposiot; // recoleccion que saco de los barcos
    public Pesquera() {
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void agregarBarco(Barco nuevo){
        barcos.add(nuevo);
    }
    public float mandarFlota(int tiempo){  /// manda toda la flota a pescar
        float totalRecolectado = 0 ;
        for(int i=0; i<barcos.size(); i++){
            barcos.get(i).pescar(tiempo);
            totalRecolectado = totalRecolectado + barcos.get(i).getRecoleccion();
        }
        return totalRecolectado;
    }
    public float recolectarTodo(){
        float totalRecolectado = 0;
        for(int i=0; i<barcos.size();i++){
            totalRecolectado = totalRecolectado + barcos.get(i).getRecoleccion();
            barcos.get(i).setRecoleccion(0);
        }
        recolectadoEnDeposiot = recolectadoEnDeposiot + totalRecolectado;
        return totalRecolectado;
    }

    public float getRecolectadoEnDeposiot() {
        return recolectadoEnDeposiot;
    }
    public float venderStock(float precio){
        return precio * recolectadoEnDeposiot;
    }
}
