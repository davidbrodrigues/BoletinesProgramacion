package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Nums {
     private Scanner sc;
    public void num(){
    sc = new Scanner(System.in);
        System.out.println ("Escriba un número ");
        short num1=sc.nextShort();
        
    if (num1>0){
        System.out.println("O numero "+num1+" é +");
        }else if (num1<0){
        System.out.println("O numero "+num1+" é -");
        }else{
        System.out.println("O numero "+num1+" é 0");
        }
    }
}
