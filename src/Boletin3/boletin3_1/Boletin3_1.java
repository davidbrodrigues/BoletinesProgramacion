package boletin3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println ("Teclea o prezo tarifa:");
        float pt=sc.nextFloat();
        System.out.println ("Teclea o prezo pagado:");
        float pp=sc.nextFloat();
        float porcentaxepagado=pp*100/pt;
        float desconto=100-porcentaxepagado;
        System.out.println ("O desconto é de un " +desconto+ "%");
    }
    
}
