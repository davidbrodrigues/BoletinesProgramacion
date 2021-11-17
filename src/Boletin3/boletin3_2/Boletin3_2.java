package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println ("Teclea a temperatura en grados centígrados");
        float gradosc=sc.nextFloat();
        float gradosf=(float) ((gradosc*1.8)+32);
        float gradosk=(float)(gradosc+273.15);
        System.out.println ("En fahrenheit equivalen a " +gradosf+ " grados");
        System.out.println ("En kelvin equivalen a " +gradosk+ " grados");
    }
    
}
