package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class Persoa {
    private String nome1;
    private String nome2;
    private float peso1;
    private float peso2;
    public void Persoa(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nome da primeira persoa:");
        nome1=  sc.next();
        System.out.println("Nome da segunda persoa:");
        nome2= sc.next();
        System.out.println("Peso da primeira persoa:");
        peso1 = sc.nextFloat();
        System.out.println("Peso da segunda persoa:");
        peso2= sc.nextFloat();
        if(peso1>peso2){
            System.out.println(nome1 + " pesa mais que " +  nome2 + " a diferenza e de " + (peso1-peso2));
        }
        else{
            System.out.println(nome2 + " pesa mais que " + nome1 + " a diferenza e de " + (peso2-peso1));
        }
    }
}
