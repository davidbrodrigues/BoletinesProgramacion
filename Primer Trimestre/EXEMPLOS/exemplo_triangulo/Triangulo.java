package exemplo_triangulo;

/**
 *
 * @author david
 */
public class Triangulo {
    //atributos
    private float base,altura;
    //constructores
    public Triangulo (){
    }
    public Triangulo(float ba, float al){
    base= ba;
    altura= al;
    }
    //metodos de acceso
    public void setBase(float ba){
    base= ba;
    }
    public float getBase(){
    return base;
    }
    public void setAltura(float al){
    altura=al;
    }
    public float getAltura(){
    return altura;
    }
    //metodo calcular area y perimetro
    public float calcularArea(float ba, float al){
    float area = ba*al / 2;
    return area;
    }
    public void calcularPerimetro(float ba, float al){
    float perimetro = ("perimetro:"+ perimetro);
    }
    
    
    
    
}
