package exemplo_obxeto;

/**
 *
 * @author david
 */
public class Exemplo_obxeto {

    public static void main(String[] args) {
        Semaforo unSemaforo = new Semaforo();
        unSemaforo.poncor("azul");
        String color=unSemaforo.damecor();
        System.out.println(color);
        Semaforo outroSemaforo=new Semaforo();
        outroSemaforo.poncor("amarelo");
        System.out.println("A cor é " +outroSemaforo.damecor());
        Semaforo terceiroSe = new Semaforo();
        terceiroSe.poncor("amarelo");
        System.out.println(terceiroSe.damecor());
        Semaforo obx=terceiroSe.mudarCor(terceiroSe);
        System.out.println(obx.damecor());
        System.out.println("cor = "+ terceiroSe.damecor());
        
    }
    
    }
    
}
