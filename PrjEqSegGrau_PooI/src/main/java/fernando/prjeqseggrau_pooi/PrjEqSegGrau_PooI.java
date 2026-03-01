/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fernando.prjeqseggrau_pooi;

import fernando.prjeqseggrau_pooi.util.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class PrjEqSegGrau_PooI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DadosEntrada de = new DadosEntrada();
        Calculadora cl = new Calculadora();
        
        
        System.out.print("Qual o valor de A? "); de.setA(sc.nextDouble()); 
        System.out.print("Qual o valor de B? "); de.setB(sc.nextDouble()); 
        System.out.print("Qual o valor de C? "); de.setC(sc.nextDouble()); 
        
        System.out.println("A: " + de.getA());
        System.out.println("B: " + de.getB());
        System.out.println("C: " + de.getC());
        
        System.out.println("Delta: " + cl.delta(de));
        System.out.println("x1L: " + cl.x1L(de));
        System.out.println("x2L: " + cl.x2L(de));
        System.out.println("xV: " + cl.xV(de));
        System.out.println("yV: " + cl.yV(de));
    }
}
