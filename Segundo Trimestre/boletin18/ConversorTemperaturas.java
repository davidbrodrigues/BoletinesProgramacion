package boletin18;

mport java.util.Scanner;

public class ConversorTemperaturas {
    float i=80;
    private float centigrados;

    Scanner sc=new Scanner(System.in);


    public void centigradosAFharenheit () throws TemperaturaErradaExcepcion{

        System.out.println("Grados centigrados para pasar a Fharenheit: ");
        centigrados= sc.nextFloat();
        if(centigrados>80){
            throw new TemperaturaErradaExcepcion("Non se pode calcular con numeros superiores a 80");
        }
        else{
            float Fharenheir=(float) (9.0/5.0*centigrados+32.4);
            System.out.println("la temperatura en Fharenheit es: " + Fharenheir);
        }
    }



    public void centígradosAReamur()throws TemperaturaErradaExcepcion{
        System.out.println("Grados centigrados para pasar a Reamur: ");
        centigrados= sc.nextFloat();
        if(centigrados>80){
            throw new TemperaturaErradaExcepcion("Non se pode calcular con numeros superiores a 80");
        }
        else{
            float Reamur=(float) (4.0 / 5.0 * centigrados );
            System.out.println("La temperatura en Reamur es: " +Reamur);
        }
    }
}