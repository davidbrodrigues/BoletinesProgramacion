package boletin9_2;

/**
 *
 * @author david
 */
public class Operacion {
    int suma=0;
    double producto=1;
    
    public void Suma(){
        for(int i=10; i<=90; i++){
            suma=i+suma;
        }
        System.out.println(suma);
    }
    public void Producto(){
        for(int i=10; i<=90; i++){
        producto=i*producto;
        }
        System.out.println(producto);
    }
}
