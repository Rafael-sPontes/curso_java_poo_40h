/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author rafael
 */
public class Aluno extends Pessoa {
    
    //ATRIBUTOS
    private String matr;
    private String curso;
    
    //MÉTODOS ESPECIAIS
    public void cancelarMatr() {
        System.out.println("Matrícula será Cancelada.");
    }
    
    //GETTERS AND SETTERS
    public String getMatr() {
        return matr;
    }
    
    public void setMatr(String matr) {
        this.matr = matr;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}