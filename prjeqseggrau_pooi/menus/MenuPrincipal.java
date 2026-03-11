/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjeqseggrau_pooi.menus;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuPrincipal {
    public void menu(Scanner sc){
        MenuCalPadrao mcp = new MenuCalPadrao();
        MenuCalSegGrau mcsg = new MenuCalSegGrau();
        int opcao = - 1;
        while(opcao != 0){
            System.out.println("0.Sair do Sistema.");
            System.out.println("1.Calculadora Padrao.");
            System.out.println("2.Calculadora Equacao de Segundo Grau.");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 0 ->System.out.println("Saindo.");
                case 1 -> mcp.calPadrao(sc);
                case 2 -> mcsg.calSegGrau(sc);
                default -> System.out.println("Opcao invalida.");
            }
        }
    }
}
