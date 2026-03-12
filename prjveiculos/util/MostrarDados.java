/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjveiculos.util;

import fernando.prjveiculos.models.Carro;
import fernando.prjveiculos.models.Moto;
import fernando.prjveiculos.models.Veiculo;

/**
 *
 * @author Fernando
 */
public class MostrarDados {
    public void mostrar(Veiculo v){
        System.out.println("Marca: " + v.getMarca() + "\nModelo: " + v.getModelo());
        System.out.println("Ano: " + v.getAno() + "\nPlaca: " + v.getPlaca());
    }
    
    public void mostrar(Carro c){
        Veiculo v = c;
        mostrar(v);
        System.out.println("Quantidade de Portas: " + c.getQtdPorta() + "\nPotencia: " + c.getCavalos());
        System.out.println("");
    }

    public void mostrar(Moto m){
        Veiculo v = m;
        mostrar(v);
        System.out.println("Tipo de partida: " + m.getTipoPartida() + "\nPotencia: " + m.getCilindradas());
        System.out.println("");
    }
}
