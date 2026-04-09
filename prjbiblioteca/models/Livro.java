/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjbiblioteca.models;

/**
 *
 * @author Fernando
 */
public class Livro {
    protected int id;
    protected String nome;
    protected String autor;
    protected int ano;
    protected String genero;
    protected Biblioteca biblioteca;
    
    public Livro(int id, String nome, String autor, int ano, String genero, Biblioteca biblioteca){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.biblioteca = biblioteca;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }
    
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }  
    
}
