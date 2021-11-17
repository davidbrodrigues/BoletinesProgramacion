package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Multiplos {
    public void CalMultiplos(){
        String numero;
        numero=JOptionPane.showInputDialog("Introduce un número: ");
        
        int num;
        num=Integer.parseInt(numero);
        
        if (num==0){
        System.out.println("Final do programa");
        }
        else
        
       for(int i=1; i<=10; i++){
               System.out.println(num+" x "+i+" = "+num*i);
               }
        }
    }

