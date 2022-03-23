package boletin17;

/**
 *
 * @author david
 */
public class Boletin17 {
    public static void main(String[] args) {
        Boletins obxb= new Boletins();
        Practico obxp= new Practico();
        Teorico obxt=new Teorico();
        obxb.Boletins();
        obxp.amosarResultado();
        obxt.amosarNotas();

        System.out.println("exames teoricos ")  ;
        obxt.calcularNotasProbasEscritas();
        System.out.println("exame practico: ");
        obxp.calcularNotaProbaPractica();
        System.out.println("boletins: ");
        obxb.Boletins();
        System.out.println("nota final: ");
        System.out.println((obxb.Boletins()+obxp.calcularNotaProbaPractica()+obxt.calcularNotasProbasEscritas())/3);
    }
    
}
