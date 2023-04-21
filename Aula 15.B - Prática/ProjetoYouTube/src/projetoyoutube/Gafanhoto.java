/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author rafael
 */
public class Gafanhoto extends Pessoa {
    
    //ATRIBUTOS
    private String login;
    private int totAssistido;
    
    //MÉTODO CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //GETTERS AND SETTERS
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public int getTotAssistido() {
        return totAssistido;
    }
    
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n{login=" + login + ", totAssistido=" + totAssistido + '}';
    }
}