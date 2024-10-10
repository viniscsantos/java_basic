/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcsme
 */
public class CarroDeCorrida extends Carro {
    @Override
    public void acelerar(){
        if(velocidade < 300){
            velocidade += 20;
        System.out.println("O carro de corrida acelerou. Velocidade atual: "+velocidade+"km/h");
        } else {
            System.out.println("Velocidade máxima atingida!");
        }
    }
}
