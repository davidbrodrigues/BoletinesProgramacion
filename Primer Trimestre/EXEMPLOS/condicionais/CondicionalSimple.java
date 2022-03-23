
package exemplo.condicionais;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class CondicionalSimple {
    //dados 2 numeros visualizar se o primeiro é maior que o segundo.
    private Scanner sc;
    //método, sin metodo no funciona:
    public void CoSimple(){
    sc = new Scanner(System.in);
        System.out.println ("Escriba el primer número: ");
        int n1=sc.nextInt();
        System.out.println ("Escriba el segundo número: ");
        int n2=sc.nextInt();
    //condicional simple
    if (n1>n2)
        System.out.println("O número "+n1+ " é o maior.");
    System.out.println("Remata o if");
    }
}