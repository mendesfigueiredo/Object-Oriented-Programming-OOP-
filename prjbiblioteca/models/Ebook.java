/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernando.prjbiblioteca.models;

/**
 *
 * @author Fernando
 */
public class Ebook extends Livro{
    private String link;
    private int limiteBooks;

    public Ebook(int id, String nome, String autor, int ano, String genero, Biblioteca biblioteca) {
        super(id, nome, autor, ano, genero, biblioteca);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLimiteBooks() {
        return limiteBooks;
    }

    public void setLimiteBooks(int limiteBooks) {
        this.limiteBooks = limiteBooks;
    }
    
    
}
