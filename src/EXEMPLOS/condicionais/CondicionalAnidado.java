package exemplo.condicionais;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class CondicionalAnidado {
    //pedir dous numeros e visualizar o maior
     private Scanner sc;
    //método, sin metodo no funciona:
    public void CoAnidado(){
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
    
//    (n1>n2)? System.out.println("O número "+n1+ " é o maior."):System.out.println("O número "+n1+ " é o menor.");

        if (n1>n2){
        System.out.println("O numero "+n1+" é o maior");
        }
        else if (n1<n2){
        JOptionPane.showMessageDialog(null, n1+ " es menor que " +n2);
        }
        else {
        //System.out.println("ambos numeros son iguais");
        System.out.println("Ambos numeros son iguais");
    }
    }
}
