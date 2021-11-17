/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploatributosobxeto;

/**
 *
 * @author david
 */
public class Pantaia {
    //atributos
    private String modelo;
    private float pulgadas;
    //contructor por defecto
    public void Pantaia(){
    }
    //constructor parametrizado
    public void Pantaia(String m, float p){
    modelo=m;
    pulgadas=p;
    }
    //set lleva el atributo
    public void setModelo (String m){
    modelo=m;
    }
    //get no puede ser void
    public String getModelo (){
    return modelo;
    }
    public void setPulgadas (Float p){
    pulgadas=p;
    }
    public float getPulgadas (){
    return pulgadas;
    }

    @Override
    public String toString() {
        return "Pantaia{" + "modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
    }
    
}
