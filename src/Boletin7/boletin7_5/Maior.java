package boletin7_5;

import java.util.Scanner;

/**
 *
 * @author david
 */

public class Maior {
    private int num1;
    private int num2;
    private int num3;
    public void Maior(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Numero 1: ");
        num1= sc.nextInt();
        System.out.println("Numero 2: ");
        num2= sc.nextInt();
        System.out.println("Numero 3: ");
        num3= sc.nextInt();
        if(num1>num2&num1>num3){
            System.out.println(num1);
        }
        else if (num2>num3 & num2>num1){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }
}