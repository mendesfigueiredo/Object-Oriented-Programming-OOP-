package com.poo.prjaula27_08_2025.classes;

import java.util.List;

public class Consulta {
    
    public void consultarCarro(List<Carro> c){
        for(int i =0; i<c.size(); i++){
            Carro car = c.get(i);
            System.out.println("A marca e: " + car.getMarca() + "\nO modelo e: " + car.getModelo() + "\nO ano e: " + car.getAno()
            + "\nA quantidade de portas: " + car.getPorta() + "\nCavalos de potencia: " + car.getCavalos() + "\n");
        }
    }
    public void consultarMoto(List<Moto> m){
        for(int i=0; i<m.size(); i++){
            Moto moto = m.get(i);
            System.out.println("A marca e: " + moto.getMarca() + "\nO modelo e: " + moto.getModelo() + "\nO ano e: " + moto.getAno()
            + "\nTipo de partida: " + moto.getPartida() + "\nCilindradas de potencia: " + moto.getCilindradas() + "\n");
        }
    }
}
