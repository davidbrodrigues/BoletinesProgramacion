package exemplo.condicionais;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class CondicionalDobre {
    //pedir dous numeros e visualizar o maior
     private Scanner sc;
    //método, sin metodo no funciona:
    public void CoDobre(){
    sc = new Scanner(System.in);
        System.out.println ("Escriba el primer número: ");
        int n1=sc.nextInt();
        System.out.println ("Escriba el segundo número: ");
        int n2=sc.nextInt();
    //condicional simple
//    if (n1>n2){
//        System.out.println("O número "+n1+ " é o maior.");}
//    else {
//        System.out.println("O número "+n1+ " é o menor.");}
    
    (n1>n2)? System.out.println("O número "+n1+ " é o maior."):System.out.println("O número "+n1+ " é o menor.");
    }
}
