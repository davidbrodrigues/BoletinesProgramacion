package boletin17;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletins {
     private float boletins;
    private float resultado;
    Scanner cs=new Scanner(System.in);
    public float Boletins(){
        System.out.println("Cantidade de boletins feitos: ");
        boletins =  cs.nextFloat();
        if(boletins >90){
            resultado=2;
            System.out.println("A puntuacion e de: " + resultado);
            return resultado;
        }
        else if (boletins>=70 && boletins <=90 ){
            resultado=1;
            System.out.println("A puntuacion e de: " + resultado);
            return resultado;
        }
        else{
            resultado=0;
            System.out.println("A puntuacion e de: " + resultado);
            return resultado;
        }
    }
}
