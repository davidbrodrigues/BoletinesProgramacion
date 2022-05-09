package boletin33;

import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;

public class XenericaOperacions <T> {
    
    public static <T extends Comparable> void calcularMaior(ArrayList<T>lista){
    T maior = (T) lista.get(0);
    for(int i =1; i<lista.size(); i++){
        if(maior.compareTo(lista.get(i))<0)
            maior = lista.get(i);
        }
        System.out.println("O maior é : " + maior);
    }
    
    public static <T extends Comparable> void calcularMenor(ArrayList<T>lista){
    T menor = (T) lista.get(0);
    for(int i =1; i<lista.size(); i++){
        if(menor.compareTo(lista.get(i))>0)
            menor = lista.get(i);
        }
    System.out.println("O menor é : " + menor);
    }
    
    public static <T> int buscarObxeto(ArrayList<T>lista){
    float elebus =Float.parseFloat(JOptionPane.showInputDialog("teclea lo que vas a buscar"));
       int atopado =0; //non esta
       int posicion =0;
       for(int i =0; i<lista.size();i++){
       if(elebus == lista.get(i)){
           System.out.println(elebus+ " está en la lista");
           posicion=i;
           atopado=1;
           break;
        }
       }
       if(atopado==0){
       System.out.println(elebus+" no está");
       posicion=-1;
       }
       return posicion;
   }
    
    public ArrayList<T> borrar(ArrayList<T> lista){
        int pos = this.buscarObxeto(lista); 
        lista.remove(pos); 
        System.out.println("El elemento ha sido borrado");
        return lista;
    }
    
}
