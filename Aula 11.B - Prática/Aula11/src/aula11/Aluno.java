/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author rafael
 */
public class Aluno extends Pessoa {
    
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //MÉTODOS ESPECIAIS
    public void pagarMens() {
        System.out.println("Pagando Mensalidade do aluno: " + this.nome);
    }
    
    //GETTERS AND SETTERS
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}