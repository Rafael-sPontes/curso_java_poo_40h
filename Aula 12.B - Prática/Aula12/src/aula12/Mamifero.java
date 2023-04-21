/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Mamifero extends Animal {
    
    //ATRIBUTOS
    private String corPelo;
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    //GETTERS AND SETTERS
    public String getCorPelo() {
        return corPelo;
    }
    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}