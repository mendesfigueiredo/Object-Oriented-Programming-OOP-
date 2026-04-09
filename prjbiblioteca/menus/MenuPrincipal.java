/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjbiblioteca.menus;

import fernando.prjbiblioteca.models.Ebook;
import fernando.prjbiblioteca.models.LivroFisico;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuPrincipal {
    public void menu(Scanner sc){
        LivroFisico lf = new LivroFisico();
        Ebook eb = new Ebook();
        int opcao = -1;
        while(opcao != 0){
            System.out.println("-----Menu Principal-----");
            System.out.println("1.Casdastro Livros");
            System.out.println("2.Mostrar Livros");
            System.out.println("3.Salvar em .txt");
            System.out.println("0.Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch( opcao){
                default -> System.err.println("Opcao invalida.");
                case 0 -> System.out.println("Finalizando sistema.");
                case 1 -> {
                    int qualLivro = 0;
                    System.out.println("Deseja cadastrar qual tipo de livro?");
                    System.out.println("1.Livro Fisico.");
                    System.out.println("2.Ebook.");
                    if(qualLivro == 1){
                        
                    }else if(qualLivro == 2){
                        
                    }else{
                        System.out.println("Opcao invalida, voltando ao menu principal");
                    }
                }
            }
        }
    }
}
