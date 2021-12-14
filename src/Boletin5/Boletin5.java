package boletin5;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin5 {
//crear objeto con constructor sin parámetros
    public static void main(String[] args) {
        Consumo obxconsumo1 = new Consumo();
//darle valores a  litros y a gas
        obxconsumo1.setlitros(50);
        obxconsumo1.setpgas(1.57);
    
        Consumo obxconsumo2 = new Consumo(1,2,3,4);
//hacemos un scanner para pedir datos
        Scanner sc = new Scanner(System.in);
    System.out.println ("Escriba la cantidad de km recorridos: ");
        double km=sc.nextFloat();
    System.out.println ("Escriba la cantidad de litros consumidos: ");
        double litros=sc.nextFloat();
    System.out.println ("Escriba la velocidad media: ");
        double vmed=sc.nextFloat();
    System.out.println ("Escriba el precio del gasoil: ");
        double pgas=sc.nextFloat();
//visualiza a traves do 2º obx o consumo medio
    obxconsumo2.amosar();
//Visualiza a velocidade media do 2º obxecto
    //obxconsumo2.amosar("a velocidade media é de: "+ vmed);
    
    }
}