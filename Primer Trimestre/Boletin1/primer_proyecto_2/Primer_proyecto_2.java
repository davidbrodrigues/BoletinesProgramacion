package primer_proyecto_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Primer_proyecto_2 {
    
    public static void main(String[] args) {
        int enteiro;
        String frase;
        //para leer instancio un boxeto tipo Scanner utilizando un constructor
        Scanner sc = new Scanner(System.in);
        /*System.out.println ("Teclea un número enteiro");
        enteiro = sc.nextInt();
        System.out.println("enteiro = " +enteiro);
        System.out.println ("Teclea un número decimal");
        float decimal=sc.nextFloat(); */
        System.out.println("teclea unha frase: ");
        frase = sc.nextLine();
        System.out.println ("con nextline ()" +frase);
        frase = sc.next();
        System.out.println ("con next () --->" +frase);
        
    }
    
}
