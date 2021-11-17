package boletin3_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introduzca una cantidad");
        int cantidad=sc.nextInt();
        int bill100=cantidad/100;
        int resto1=cantidad%100;
        int bill20=resto1/20;
        int resto2=bill20%20;
        int bill5=resto2/5;
        int resto3=bill5/5;
        int mon1=resto3/1;
        System.out.println("Esta cantidade equivale a" +bill100+ "billetes de 100, " +bill20+ " billetes de 20, " +bill5+ " billetes de 5 y" +mon1+ " monedas de 1 euro.");
        
    }
    
}
