
package exemplo.condicionais;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class CondicionalSimple_1 {
    //dados 2 numeros visualizar se o primeiro é maior que o segundo.
    private Scanner sc;
    //método, sin metodo no funciona:
    public void CoSimple(){
    sc = new Scanner(System.in);
        int n1 = pedirEnteiro();
        int n2 = pedirEnteiro();
    //condicional simple
    if (n1>n2)
        System.out.println("O número "+n1+ " é o maior.");
    System.out.println("Remata o if");
    }
    public int pedirEnteiro(){
        System.out.println("Teclea o numero enteiro");
        int num=sc.nextInt();
        return num;
    }
}