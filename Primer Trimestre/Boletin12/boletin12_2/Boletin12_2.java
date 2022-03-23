
package boletin12_2;

/**
 *
 * @author david
 */
public class Boletin12_2 {

 public static void main (String [] args) { 
 Clase1 obj1= new Clase1(5,4); 
 System.out.print(obj1.modificar(4)+" "); 
 Clase1 obj2= new Clase1(5,4); 
 System.out.print(obj2.modificar(5)+" "); 
 obj2=obj1; 
 System.out.println(obj2.modificar(5)+" "); 
 }//fin main 
} 
class Clase1{ 
 int p1,p2; 
 public Clase1 (int i, int j){ 
 p1=i; 
 p2=j; 
 } 
 public int modificar(int i){ 
 p1=p1+i; 
 p2=p2+i; 
 System.out.print(p2+" "); 
 return p1; 
 }
    }
    
//QUE VISUALIZA O PROGRAMA
//O programa devolve unha serie de numeros 8,9,9,10,13,14.