package boletin17;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Teorico {
     private float teorico1;
    private float teorico2;
    private float resultado;
    Scanner cs=new Scanner(System.in);
    public void amosarNotas(){
        System.out.println("Nota primera prueba:");
        teorico1 = cs.nextFloat();
        System.out.println("Nota segunda prueba");
        teorico2= cs.nextFloat();
    }
    public float calcularNotasProbasEscritas(){
        resultado=(teorico1+teorico2)/2;
        System.out.println("a nota media é de: " + resultado*0.40 );
        return resultado;
}
}
