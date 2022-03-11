package boletin21_1;

import javax.swing.JOptionPane;

public class MetodosArray {
    //crear array
    public int[] crearArray (int [] numeros){
       //lo mismo siempre para crear
       for (int x=0;x<numeros.length;x++){
       //numeros random entre 1 y 50
       numeros[x] = (int) (Math.random()*50)+1;
       }
       //devolver numeros
        return numeros;
   }    
    //metodo para array
    void mostrarArray(int[] numeros) {
      //recorrer array visualizando posiciones al revés
      for(int x=numeros.length-1; x>=0; x--)
      System.out.println(x+"\t"+numeros[x]);
    }
}
