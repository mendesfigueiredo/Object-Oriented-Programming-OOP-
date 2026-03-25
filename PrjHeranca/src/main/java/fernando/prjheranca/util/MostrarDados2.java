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
public class MostrarDados2 {
    
    public void mostrar(Pessoa p) {

        System.out.println("Nome: " + p.getNome());
        // se a intancia de p for exibir os dados pf
        if (p instanceof PessoaFisica pf) {
            System.out.println("CPF: " + pf.getCpf());
            System.out.println("RG: " + pf.getRg());
        } 
        //se nao for exibir dados pj
        else if (p instanceof PessoaJuridica pj) {
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Insc. Estadual: " + pj.getInsEstadual());
        }

    }
}
