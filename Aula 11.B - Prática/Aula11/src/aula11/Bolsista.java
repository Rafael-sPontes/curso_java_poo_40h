/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author rafael
 */
public class Bolsista extends Aluno {
    
    //ATRIBUTOS
    private float bolsa;
    
    //MÉTODOS ESPECIAIS
    public void renovarBolsa() {
        System.out.println("Renovando bolsa do aluno: " + this.nome);
    }
    
    @Override
    public void pagarMens() {
        System.out.println(this.nome + " é Bolsista. Pagamento Facilitado!");
    }
    
    //GETTERS AND SETTERS
    public float getBolsa() {
        return bolsa;
    }
    
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}