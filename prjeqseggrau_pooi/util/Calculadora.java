/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjeqseggrau_pooi.util;

import fernando.prjeqseggrau_pooi.DadosEntrada;
import fernando.prjeqseggrau_pooi.DadosSaida;

/**
 *
 * @author Fernando
 */
public class Calculadora {
    public void soma(DadosEntrada de, DadosSaida ds){
        ds.setResultado(de.getA() + de.getB());
    }
    
    public void subtracao(DadosEntrada de, DadosSaida ds){
        ds.setResultado(de.getA() - de.getB());
    }
    
    public void multiplicacao(DadosEntrada de, DadosSaida ds){
        ds.setResultado(de.getA() * de.getB());
    }
    
    public void divisao(DadosEntrada de, DadosSaida ds){
        ds.setResultado(de.getA() / de.getB());
    }
}
