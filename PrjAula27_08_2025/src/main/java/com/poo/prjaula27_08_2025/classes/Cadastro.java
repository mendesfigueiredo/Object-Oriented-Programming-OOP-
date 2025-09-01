package com.poo.prjaula27_08_2025.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    private Scanner sc = new Scanner(System.in);
    private List<Carro> carros = new ArrayList();
    private List<Moto> motos = new ArrayList();
    
    public void cadastrar(Carro c){
        System.out.println("Qual a marca: ");
        c.setMarca(sc.nextLine());
        System.out.println("Qual o modelo: ");
        c.setModelo(sc.nextLine());
        System.out.println("Qual o ano: ");
        c.setAno(sc.nextLine());
        System.out.println("Quantidade de portas: ");
        c.setPorta(sc.nextLine());
        System.out.println("Quantos cavalos");
        c.setCavalos(sc.nextLine());
    }
    public void cadastrar(Moto m){
        System.out.println("Qual a marca: ");
        m.setMarca(sc.nextLine());
        System.out.println("Qual o modelo: ");
        m.setModelo(sc.nextLine());
        System.out.println("Qual o ano: ");
        m.setAno(sc.nextLine());
        System.out.println("Qual o tipo de partida(Eletrica ou Pedal): ");
        m.setPartida(sc.nextLine());
        System.out.println("Quantas cilindradas: ");
        m.setCilindradas(sc.nextLine());
    }
}
