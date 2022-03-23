package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Teclea a cantidae de euros para cambiar:");
        float euros=sc.nextFloat();
        System.out.println ("Teclea o valor do euro frente ao dólar:");
        float dolar=sc.nextFloat();
        float cambio=euros*dolar;
        System.out.println("O valor en dólares é " +cambio);
    }
    
}
