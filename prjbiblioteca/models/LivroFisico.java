/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjbiblioteca.models;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class LivroFisico extends Livro{
    private char corredor;
    private int prateleira;
    private boolean danos;

    public LivroFisico(int id, String nome, String autor, int ano, String genero, Biblioteca biblioteca) {
        super(id, nome, autor, ano, genero, biblioteca);
    }

    public char getCorredor() {
        return corredor;
    }

    public void setCorredor(char corredor) {
        this.corredor = corredor;
    }

    public int getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(int prateleira) {
        this.prateleira = prateleira;
    }

    public boolean isDanos() {
        return danos;
    }

    public void setDanos(boolean danos) {
        this.danos = danos;
    }
    
    public void cadastro(Scanner sc){
        System.out.println("Nome: "); LivroFisico.setNome();
    }
}
