/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Reptil extends Animal {
    
    //ATRIBUTOS
    private String corEscama;
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
}