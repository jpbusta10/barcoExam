import model.Barco;
import model.Pesquera;
import model.LanchaAmarilla;
import model.Corbeta;

public class Main {
    public static void main(String[] args) {
        Pesquera moscuzza = new Pesquera();
        for (int i = 0; i < 5; i++) {
            Barco nuevo = new LanchaAmarilla("spi", 1985, 2000, 40, i+8, 0);
            moscuzza.agregarBarco(nuevo);
        }
        for (int i=0; i < 5; i++) {
            Barco nuevo = new Corbeta(10, "contessi", 1992, 1000, 30, i+411,0);
                moscuzza.agregarBarco(nuevo);
        }
        for(int i=0; i< moscuzza.getBarcos().size();i++){
            System.out.printf(moscuzza.getBarcos().get(i).toString()+"\n");
        }
        System.out.println("mando la flota a pescar");
        float totalPescado = moscuzza.mandarFlota(10);
        System.out.println("total pescado: " + totalPescado);
        moscuzza.recolectarTodo();//recolecto la carga de los barcos y la paso a depositos
        System.out.println("vendo el stock");
        float recaudacion = moscuzza.venderStock(11);
        System.out.println(recaudacion +" dolares");
    }
}
