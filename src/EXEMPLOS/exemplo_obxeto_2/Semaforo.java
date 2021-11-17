package exemplo_obxeto;
/**
 *
 * @author david
 */
public class Semaforo {
    //Atributos
    private String cor;
    //Metodos
    
    public void poncor(String c){
        cor = c;
    }
    
    public String damecor(){
        return cor;
    }
    public static void pintar(){
        System.out.println("pintamos o semaforo de verde");
    }
}
