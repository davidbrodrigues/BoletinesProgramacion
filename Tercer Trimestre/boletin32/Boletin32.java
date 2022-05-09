package boletin32;

import java.util.ArrayList;

public class Boletin32 {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Veleros(250, 17, 25));
        barcos.add(new Deportivos(765, 12, 5));
        barcos.add(new Yate(2694, 7, 45, 7));
        for(Barco b : barcos)
            b.calcularPrecio(b);
    }
    
}
