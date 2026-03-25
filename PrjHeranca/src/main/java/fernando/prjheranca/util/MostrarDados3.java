/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjheranca.util;

import fernando.prjheranca.Carro;
import fernando.prjheranca.Pessoa;
import fernando.prjheranca.PessoaFisica;
import fernando.prjheranca.PessoaJuridica;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class MostrarDados3 {
    public void mostrarPessoa(Pessoa p){
        System.out.println("Nome: " + p.getNome());
        if(p instanceof PessoaFisica pf){
            System.out.println("CPF: " + pf.getCpf());
            System.out.println("RG: " + pf.getRg());
        }else{
            PessoaJuridica pj = (PessoaJuridica)p;
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Insc. Est.: " + pj.getInsEstadual());
        }
        mostrarCarro(p.getLstCarro());
    }
    
    public void mostrarCarro(List<Carro> carros){
        for(Carro carro : carros){
            System.out.println("--------------------***********---------------------");
            System.out.println("Nome: " + carro.getNome());
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Ano: " + carro.getAno());
        }
    }
    
    public void mostrarCarro(Carro c){
            System.out.println("--------------------***********---------------------");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Placa: " + c.getPlaca());
            System.out.println("Ano: " + c.getAno());
            System.out.println("Nome: " + c.getPessoa().getNome());
            
    }
}
