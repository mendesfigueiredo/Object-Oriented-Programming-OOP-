/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjveiculos.util;

import fernando.prjveiculos.models.Carro;
import fernando.prjveiculos.models.Moto;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Preencher {
    public void preechimento(Carro c, Scanner sc){
        System.out.print("Digite a marca: "); c.setMarca(sc.nextLine());
        System.out.print("Digite o modelo: "); c.setModelo(sc.nextLine());
        System.out.print("Digite o ano: "); c.setAno(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite o placa: "); c.setPlaca(sc.nextLine());
        System.out.print("Digite a Quantidade de Portas: "); c.setQtdPorta(sc.nextInt());
        System.out.print("Digite a potencia do carro(cavalos): "); c.setCavalos(sc.nextInt());
        sc.nextLine();
    }
    public void preechimento(Moto m, Scanner sc){
        System.out.print("Digite a marca: "); m.setMarca(sc.nextLine());
        System.out.print("Digite o modelo: "); m.setModelo(sc.nextLine());
        System.out.print("Digite o ano: "); m.setAno(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite o placa: "); m.setPlaca(sc.nextLine());
        System.out.print("Digite o tipo de partida: "); m.setTipoPartida(sc.nextLine());
        System.out.print("Digite a potencia da moto(cilindradas): "); m.setCilindradas(sc.nextInt());
        sc.nextLine();
    }
    
    
}
