package LibreriaDavid;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MetodosArray {
    
   public float[] crearArray (float [] lista){
       for(int i =0; i< lista.length; i++){
           lista [i] =Float.parseFloat(JOptionPane.showInputDialog(" teclea nota "));
       }
       return lista;
   }
   
   
   public void amosar(float [] lista){
       int op;
       op=Integer.parseInt(JOptionPane.showInputDialog("Menú con \n for \n for each \n clase Arrays"));
       switch(op){
       case 1: for(int i=0; i<lista.length; i++){
                System.out.println("posicion" +i+ " = " + lista[i]);
                }
                break;
       case 2: for(float elemento:lista)
                System.out.println(elemento);
       case 3: System.out.println(Arrays.toString(lista));
                break;
                default:System.out.println("opcion incorrecta");
        
        }
   }
   
   
   public static int buscarElemento(float[]lista){
       float elebus =Float.parseFloat(JOptionPane.showInputDialog("teclea lo que vas a buscar"));
       int atopado =0; //non esta
       int posicion =0;
       for(int i =0; i<lista.length;i++){
       if(elebus == lista[i]){
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
   
   
   public static void ordenarElemento(float[] lista) {
        float aux = 0;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
   }
   
    public static float[] borrarElemento(float[] lista) {
        int posicion = MetodosArray.buscarElemento(lista);
        if(posicion<0)
            System.out.println("*** O elemento non está na lista");
        else {
            for (int i = posicion; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
            }
        }
        lista = Arrays.copyOf(lista, lista.length-1);
        return lista;
    }


    public static float[]engadirElemento(float []lista){
        float eleEngadir =Float.parseFloat(JOptionPane.showInputDialog(lista));
        lista = Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleEngadir;
        return lista;
    }

}