package boletin5;

/**
 *
 * @author david
 */
//clase
public class Consumo {
//atributos de la clase
    private double km;
    private double litros;
    private double vmed;
    private double pgas;
    public double consumom = litros*100/km;
    
//constructores
public Consumo() {}
public Consumo(double km, double lit, double vmed, double pgas){
    this.km = km;
    litros = lit;
    this.vmed = vmed;
    this.pgas = pgas;
}
double tempo= km/vmed;
public double gettempo() {
        return tempo;
}

public double consumomedio(){
        return consumom;
}
double consumoe =  consumom*pgas;
public double consumoeuros(){
        return consumoe;
}
public void setkms(double km){
//Varia o valor dos litros consumidos do 2º obxecto
        this.km=km;
}
public void setlitros(double litros){
        this.litros=litros;
}
public void setvmed(double vmed){
        this.vmed=vmed;
}
public void setpgas(double pgas){
        this.pgas=pgas;
}
public void amosar (){System.out.println("Consumo medio é de: " +consumom);};
}
