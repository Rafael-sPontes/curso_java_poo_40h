/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author rafael
 */
public class Professor extends Pessoa {
    
    //ATRIBUTOS
    private String especialidade;
    private float salario;
    
    //MÉTODOS ESPECIAIS
    public void receberAum(float aum) {
        this.salario += aum;
    }
    
    //GETTERS AND SETTERS
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }    
}