package boletin21_1;

public class Metodos {
    public static int[] crearArraysAleatorios(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*51);
        }
        return lista;
    }
    public static void amosarArrayAlReves(int[]lista){
         for(int i=lista.length-1;i>=0;i--){
            System.out.println("Posición: "+i+" = "+lista[i]);
        }
    }
}
