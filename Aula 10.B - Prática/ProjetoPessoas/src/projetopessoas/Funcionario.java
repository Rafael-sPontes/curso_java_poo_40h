/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author rafael
 */
public class Funcionario extends Pessoa {
    
    //ATRIBUTOS
    private String setor;
    private boolean trabalhando;
    
    //MÉTODOS ESPECIAIS
    public void mudarTrab() {
        this.trabalhando = !this.trabalhando;
    }
    
    //GETTERS AND SETTERS
    public String getSetor() {
        return setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean getTrabalhando() {
        return trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}