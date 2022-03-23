package boletin7;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Positivo {
    private Scanner sc;
    public void numPo(){
    sc = new Scanner(System.in);
        System.out.println ("Escriba un número ");
        float num=sc.nextFloat();
    
    if (num>0){
        System.out.println("O numero "+num+" é positivo");
        }
}
}