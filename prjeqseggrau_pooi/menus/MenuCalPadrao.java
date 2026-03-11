/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjeqseggrau_pooi.menus;

import fernando.prjeqseggrau_pooi.DadosEntrada;
import fernando.prjeqseggrau_pooi.DadosSaida;
import fernando.prjeqseggrau_pooi.util.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuCalPadrao {
    public void calPadrao(Scanner sc){
        DadosEntrada de = new DadosEntrada();
        DadosSaida ds = new DadosSaida();
        Calculadora c = new Calculadora();
        int opcao = -1;
        while(opcao != 0){
            System.out.println("0.Voltar.");
            System.out.println("1.Soma.");
            System.out.println("2.Subtracao.");
            System.out.println("3.Multiplicao.");
            System.out.println("4.Divsao");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 0-> System.out.println("Voltando ao menu principal.");
                case 1 ->{
                    System.out.print("Quais os valor? ");
                    de.setA(sc.nextDouble());
                    System.out.print("Quais os valor? ");
                    de.setB(sc.nextDouble());
                    c.soma(de, ds);
                    System.out.println("Valor: " + ds.getResultado());
                }
                case 2 ->{
                    System.out.print("Quais os valor? ");
                    de.setA(sc.nextDouble());
                    System.out.print("Quais os valor? ");
                    de.setB(sc.nextDouble());
                    c.subtracao(de, ds);
                    System.out.println("Valor: " + ds.getResultado());
                }
                case 3 ->{
                    System.out.print("Quais os valor? ");
                    de.setA(sc.nextDouble());
                    System.out.print("Quais os valor? ");
                    de.setB(sc.nextDouble());
                    c.multiplicacao(de, ds);
                    System.out.println("Valor: " + ds.getResultado());
                }
                case 4 ->{
                    System.out.print("Quais os valor? ");
                    de.setA(sc.nextDouble());
                    System.out.print("Quais os valor? ");
                    de.setB(sc.nextDouble());
                    c.divisao(de, ds);
                    System.out.println("Valor: " + ds.getResultado());
                }
                default -> System.out.println("Invalido.");
            }
        }
            
    }
}
