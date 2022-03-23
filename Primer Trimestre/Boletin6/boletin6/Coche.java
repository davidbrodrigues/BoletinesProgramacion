/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author david
 */
public class Coche {
    private final int velocidade ;
    public int acelerar;
    public int frenar;
    public Coche(){
    velocidade =0 ;
    acelerar = velocidade+1;
    frenar = velocidade-1;
    }

public int getVelocidade(){
    return velocidade;
}
public void acelerar(int acelarar){
    System.out.println("velociade incrementada = " +acelerar);
}
public void frenar(int frenar){
    System.out.println("velociade frenada = " +frenar);
}
}