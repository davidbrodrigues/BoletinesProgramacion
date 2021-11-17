package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Teclea a cantidae de millas:");
        float millas=sc.nextFloat();
        System.out.println ("Teclea o valor en metros dunha milla:");
        float metros=sc.nextFloat();
        float cambio=millas*metros;
        System.out.println("O valor en metros é: " +cambio);
    }
    
}
