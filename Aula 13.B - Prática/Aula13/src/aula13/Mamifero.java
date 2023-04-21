/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author rafael
 */
public class Mamifero extends Animal {
    
    //ATRIBUTOS
    protected String corPelo;
    
    //MÉTODOS SOBREPOSIÇÃO
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