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
    DadosSaida ds = new DadosSaida();
    public double delta(DadosEntrada de){
        ds.setDelta((de.getB() * de.getB())-(4*de.getA()*de.getC()));
        return ds.getDelta();
    }
    
    public double x1L(DadosEntrada de){
         ds.setX1L( ((-de.getB()) + Math.sqrt(ds.getDelta())) / (2 * de.getA()) );
        return ds.getX1L();
    }
    public double x2L(DadosEntrada de){
         ds.setX2L( ((-de.getB()) - Math.sqrt(ds.getDelta())) / (2 * de.getA()) );
        return ds.getX2L();
    }
    public double xV(DadosEntrada de){
        ds.setxV(-de.getB() / (2 * de.getA()));
        return ds.getxV();
    }
    
    public double yV(DadosEntrada de){
        ds.setyV(-ds.getDelta() / (4 * de.getA()));
        return ds.getyV();
    }
    
    
}
