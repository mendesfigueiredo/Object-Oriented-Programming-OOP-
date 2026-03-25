/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjheranca.util;

import fernando.prjheranca.Pessoa;
import fernando.prjheranca.PessoaFisica;
import fernando.prjheranca.PessoaJuridica;

/**
 *
 * @author Fernando
 */
public class MostrarDados {
    public void mostrar(Pessoa p){
        System.out.println("Nome: " + p.getNome());
    }
    
    public void mostrar(PessoaFisica pf){
        Pessoa p = pf;
        mostrar(p);
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("RG: " + pf.getRg());
    }
    
    public void mostrar(PessoaJuridica pj){
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Inscricao Estadual: " + pj.getInsEstadual());
        
    }
}
