package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Teclea o primer número:");
        float num1=sc.nextFloat();
        System.out.println ("Teclea o segundo número:");
        float num2=sc.nextFloat();
        float suma=num1+num2;
        System.out.println("O resultado da suma é:  " +suma);
        float resta=num1-num2;
        System.out.println("O resultado da resta é:  " +resta);
        float multiplicacion=num1*num2;
        System.out.println("O resultado da multiplicación é:  " +multiplicacion);
        float division=num1*num2;
        System.out.println("O resultado da division é:  " +division);
    }
    
}