/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fernando.prjveiculos;

import fernando.prjveiculos.models.Carro;
import fernando.prjveiculos.models.Moto;
import fernando.prjveiculos.util.MostrarDados;
import fernando.prjveiculos.util.Preencher;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class PrjVeiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();
        Moto m = new Moto();
        Preencher p = new Preencher();
        MostrarDados md = new MostrarDados();
        
        p.preechimento(c, sc);
        p.preechimento(m, sc);
        
        md.mostrar(c);
        md.mostrar(m);
    }
}
