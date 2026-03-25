/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fernando.prjheranca;

import fernando.prjheranca.util.ManterArquivo;
import fernando.prjheranca.util.MostrarDados;
import fernando.prjheranca.util.MostrarDados3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class PrjHeranca {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        MostrarDados md = new MostrarDados();
        
        System.out.print("Digite seu nome: ");
        pf.setNome(sc.nextLine());
        System.out.print("Digite o CPF: ");
        pf.setCpf(sc.nextLine());
        System.out.print("Digite o RG: ");
        pf.setRg(sc.nextLine());
        
        System.out.println("");
        
        System.out.print("Digite seu nome: ");
        pj.setNome(sc.nextLine());
        System.out.print("Digite o CNPJ: ");
        pj.setCnpj(sc.nextLine());
        System.out.print("Digite o Iinscricao Estadual: ");
        pj.setInsEstadual(sc.nextLine());
        
        md.mostrar(pf);*/
        ManterArquivo ma = new ManterArquivo();
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Teste Pf");
        pf.setCpf("12345678");
        pf.setRg("000.111.222-33");

        /*System.out.println("Nome: " + pf.getNome());
        System.out.println("Cpf: " + pf.getCpf());
        System.out.println("Rg: " + pf.getRg());*/

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Teste PJ");
        pj.setCnpj("0123456789585");
        pj.setInsEstadual("123541555");
        
        ma.escreverArquivo(pf);

        /*System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Insc Estadual: " + pj.getInsEstadual());*/

        /*Carro c1 = new Carro();
        c1.setNome("Gol");
        c1.setMarca("VW");
        c1.setModelo("G6");
        c1.setAno(2020);
        c1.setPessoa(pf);
        
        Carro c2 = new Carro();
        c2.setNome("Palio");
        c2.setMarca("Fiat");
        c2.setModelo("EX");
        c2.setAno(2018);
        c2.setPessoa(pj);

        Carro c3 = new Carro();
        c3.setNome("Fiesta");
        c3.setMarca("Ford");
        c3.setModelo("EXL");
        c3.setAno(2017);
        c3.setPessoa(pf);
        
        List<Carro> lstCarroPf = new ArrayList();//lista de carro de pessoa fisica
        lstCarroPf.add(c1);
        lstCarroPf.add(c3);
        pf.setLstCarro(lstCarroPf);
        
        List<Carro> lstCarroPj = new ArrayList<>();//lista de carro de pessoa juridica
        lstCarroPj.add(c2);
        pj.setLstCarro(lstCarroPj);
        
        MostrarDados3 md3 = new MostrarDados3();
        //md3.mostrarPessoa(pf);
        md3.mostrarCarro(c3);*/
        
        
    }
}
