package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Numeros {
    int posi=0, neg=0, cer=0;
    
    public void amosarFor(){
        int numero;
        
    for(int contador=0;contador<10;contador++){
        
        numero=lerNum();
        if (numero<0){
        neg++;
        //JOptionPane.showInputDialog(null, "hay " +neg+ "numeros negativos");
        }
        else if(numero>0){
        posi++;
        //JOptionPane.showInputDialog(null, "hay " +posi+ "numeros positivos");
        }
        else if(numero==0){
        cer++;
        //JOptionPane.showInputDialog(null, "hay " +cer+ "ceros");
        }
        }
    JOptionPane.showInputDialog(null, "hay " +neg+ " numeros negativos, " +posi+ " nuermos positivos y " +cer+ " ceros");
    
}
    public int lerNum(){
    int numero=Integer.parseInt(JOptionPane.showInputDialog("escribe un numero"));
    return numero;
    }
}
