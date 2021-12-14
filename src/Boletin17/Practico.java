package boletin17;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Practico {
    private float practica;
    Scanner cs=new Scanner(System.in);
    public void amosarResultado(){
        System.out.println("nota do exame practico: ");
        practica= cs.nextFloat();

    }
    public float calcularNotaProbaPractica(){
        System.out.println("a nota é de: " +practica*0.04);
        return practica;
    }
}
