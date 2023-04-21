/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author rafael
 */
public abstract class Pessoa {
    
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //MÉTODO CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    
    public void setNome() {
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
    
    public float getExperiencia() {
        return experiencia;
    }
    
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    //MÉTODO TOSTRING

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" 
                + idade + ", sexo=" + sexo 
                + ", experiencia=" + experiencia + '}';
    }
}