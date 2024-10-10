/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcsme
 */
public class TesteCarros{
    public static void main(String[] args){
        CarroDeCorrida ferrari = new CarroDeCorrida();
        ferrari.cor = "Vermelha";
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.descreverCarro();
        
        Carro uno = new Carro();
        uno.cor = "Prata";
        uno.acelerar();
        uno.acelerar();
        uno.descreverCarro();
    }
}
