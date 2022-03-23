package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Rectangulo {
    public void CalcularArea(){
        Scanner sc = new Scanner (System.in);
        
        for (int contador=0; contador>10; contador++){
        System.out.println("Introduce a altura: ");
        int altura = sc.nextInt();
        if (altura<0){
        System.out.println("Introduce unha altura válida: ");
        }
        else{
            for(int contador2=0; contador2<10; contador2++){
            System.out.println("Introduce a base: ");
            int base = sc.nextInt();
            if (base<0){
            System.out.println("Introduce unha base válida: ");
            }
            else{
                System.out.println("El área del triángulo es igual a " +(base*altura/2));
                break;
            }
            }
        }
        }
    }
}
