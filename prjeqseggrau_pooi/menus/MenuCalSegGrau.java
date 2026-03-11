/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjeqseggrau_pooi.menus;

import fernando.prjeqseggrau_pooi.DadosEntrada;
import fernando.prjeqseggrau_pooi.DadosSaida;
import fernando.prjeqseggrau_pooi.util.CalculadoraEqSegGrau;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuCalSegGrau {
    public void calSegGrau(Scanner sc){
        DadosEntrada de = new DadosEntrada();
        DadosSaida ds = new DadosSaida();
        CalculadoraEqSegGrau cesg = new CalculadoraEqSegGrau();
        int opcao = -1;
        while(opcao != 0){
            System.out.println("0.Voltar.");
            System.out.println("1.Delta.");
            System.out.println("2.X2 Linha.");
            System.out.println("3.X2 Linha.");
            System.out.println("4.X Vertice.");
            System.out.println("5.Y Vertice");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 0 -> System.out.println("Voltando.");
                case 1 ->{ 
                    System.out.println("Quais o valor?");
                    de.setA(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setB(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setC(sc.nextDouble());
                    cesg.delta(de, ds);
                    System.out.println("Delta: " + ds.getDelta());
                }
                case 2 ->{
                    System.out.println("Quais o valor?");
                    de.setA(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setB(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setC(sc.nextDouble());
                    cesg.delta(de, ds);
                    cesg.x1L(de, ds);
                    System.out.println("X1L: " + ds.getX1L());

                }
                case 3 ->{
                    System.out.println("Quais o valor?");
                    de.setA(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setB(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setC(sc.nextDouble());
                    cesg.delta(de, ds);
                    cesg.x2L(de, ds);
                    System.out.println("X2L: " + ds.getX2L());
                }
                case 4 ->{
                    System.out.println("Quais o valor?");
                    de.setA(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setB(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setC(sc.nextDouble());
                    cesg.xV(de, ds);
                    System.out.println("X Vertice: " + ds.getxV());
                }
                case 5 ->{
                    System.out.println("Quais o valor?");
                    de.setA(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setB(sc.nextDouble());
                    System.out.println("Quais o valor?");
                    de.setC(sc.nextDouble());
                    cesg.yV(de, ds);
                    System.out.println("Y Vertice: " + ds.getyV());
                }
                default ->System.out.println("Invalido.");
            }
        }
            
    }
}
