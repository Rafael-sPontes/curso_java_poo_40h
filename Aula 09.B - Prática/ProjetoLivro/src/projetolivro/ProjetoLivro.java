/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author rafael
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Cazimiro", 44, "M");
        p[1] = new Pessoa("Cassandra", 35, "F");
        
        l[0] = new Livro("A Busca Implacável", "Régis da Silva", 255, p[0]);
        l[1] = new Livro("Suave Tentação", "Davi Souza", 126, p[1]);
        l[2] = new Livro("Dolche Vita", "Laquiar Mendes", 274, p[1]);
        
        l[0].abrir();
        l[0].folhear(240);
        l[0].avancarPag();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
}