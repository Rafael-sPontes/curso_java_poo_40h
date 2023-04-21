/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author rafael
 */
public class Livro implements Publicacao {
    
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAt;
    private boolean aberto;
    private Pessoa leitor;
    
    //MÉTODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAt = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //CLASSE TOSTRING
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor 
                + "\n, totPag=" + totPag + "\n, pagAt=" + pagAt + "\n, aberto=" 
                + aberto + "\n, leitor=" + leitor.getNome() + "\n, Idade=" 
                + leitor.getIdade() + "\n, Sexo=" + leitor.getSexo() + '}';
    }
    
    //GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAt() {
        return pagAt;
    }

    public void setPagAt(int pagAt) {
        this.pagAt = pagAt;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //MÉTODOS ABSTRATOS
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPag) {
            this.pagAt = 0;
        } else {
            this.pagAt = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAt++;
    }

    @Override
    public void voltarPag() {
        this.pagAt--;
    }
}