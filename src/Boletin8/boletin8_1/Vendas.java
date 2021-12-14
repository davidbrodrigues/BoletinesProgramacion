package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author david
 */
class Vendas {
     private int vendas;
    public void Vendas(){
        Scanner cs=new Scanner(System.in);
        System.out.println("Numero de vendas: ");
        vendas= cs.nextInt();
        if ( vendas<= 100){
            System.out.println("Baixo");
        }
        else if (vendas>100 & vendas<=500){
            System.out.println("Medio");
        }
        else if (vendas>500 & vendas<=1000){
            System.out.println("Alto");
        }
        else {
            System.out.println("Primeira necesidade");
        }
    }
}
