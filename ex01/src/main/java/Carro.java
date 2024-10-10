/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcsme
 */
public class Carro{
    public String cor;
    protected int velocidade;
    public void acelerar() {
        if (velocidade < 160) {
            velocidade += 10;
            System.out.println("O carro acelerou. Velocidade atual: "+ velocidade+"km/h");
        } else {
                    System.out.println("Velocidade maxima atingida!");
                    }
        }
    public int getVelocidade(){
        return velocidade;
    }
    public void setCor(String novaCor){
        this.cor = novaCor;
    }
    public void descreverCarro(){
        System.out.println("Cor: "+cor+", Velocidade atual: "+velocidade+"km/h");
    } 
}
