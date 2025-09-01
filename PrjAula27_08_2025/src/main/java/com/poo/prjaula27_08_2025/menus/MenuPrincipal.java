package com.poo.prjaula27_08_2025.menus;

import com.poo.prjaula27_08_2025.classes.Carro;
import com.poo.prjaula27_08_2025.classes.Moto;
import com.poo.prjaula27_08_2025.classes.Cadastro;
import com.poo.prjaula27_08_2025.classes.Consulta;
import com.poo.prjaula27_08_2025.classes.LerArquivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int menuOpcao;
        
        Consulta cl = new Consulta();
        Cadastro cd = new Cadastro();
        List<Carro> carros = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();
        Moto m1 = new Moto();

        do{
            System.out.println("    ->Menu<-    ");
            System.out.println("1 - Cadastrar um carro.\n" + "2 - Consultar carro(s) cadastrados.");
            System.out.println("3 - Cadastrar uma moto.\n" + "4 - Consultar moto(s) cadastradas.");
            System.out.println("0 - Sair.");
            menuOpcao = sc.nextInt();
            if(menuOpcao == 1){
                Carro c = new Carro();
                cd.cadastrar(c);
                carros.add(c);
            }if(menuOpcao == 2){
                cl.consultarCarro(carros);
            }if(menuOpcao == 3){
                Moto m = new Moto();
                cd.cadastrar(m);
                motos.add(m);
            }if(menuOpcao == 4){
                cl.consultarMoto(motos);
            }
        }while(menuOpcao != 0);
    }
}
