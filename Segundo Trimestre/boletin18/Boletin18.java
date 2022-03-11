package boletin18;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin18 {
    public static void main(String[] args) {
       double centigrado, fahrenheit, reamur;

        byte datoIn;

        int resp;

        Scanner teclado = new Scanner (System.in);

       

        resp = 1;

        while (resp == 1)

        {       

            System.out.println("PROGRAMA PARA CONVERTIR grados CENTiGRADOS A grados FAHRENHEIT O KELVIN");

            System.out.println ("");

            System.out.println ("Ingrese la temperatura en grados CENTIGRADOS");

            System.out.println ("");

           

            centigrado = teclado.nextDouble();

           

            System.out.println("Si desea convertir a grados fahrenheit presione 1");

            System.out.println ("");

            System.out.println ("Si desea convertir a grados reamur presione 2");

            System.out.println ("");

           

            datoIn = teclado.nextByte();

           

            switch (datoIn)

             {           

                case 1:

                    fahrenheit = centigrado * 1.8 + 32;

                    System.out.println (centigrado + " grados centigrados equivalen a: " + fahrenheit + " grados fahrenheit");

                break;               

                case 2:

                    reamur = centigrado * 0.8;

                    System.out.println(centigrado + " grados centigrados equivalen a " + reamur + " grados reamur");

                break;               

                default:

                    System.out.println("SOLO DEBE DIGITAR 1 o 2");

            }           

            System.out.println ("Desea hacer otra conversion? digite: 1 si / 2 no");

            resp = teclado.nextInt();   
    }
    
    }
}
