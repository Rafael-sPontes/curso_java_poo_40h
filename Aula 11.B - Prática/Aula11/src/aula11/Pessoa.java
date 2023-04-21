/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author rafael
 */
public abstract class Pessoa {
    
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //MÉTODOS ESPECIAIS
    public void fazerAniv() {
        this.idade++;
    }
    
    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Dados: {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}