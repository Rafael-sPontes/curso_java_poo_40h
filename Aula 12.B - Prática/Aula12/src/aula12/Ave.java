/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Ave extends Animal {
    
    //ATRIBUTOS
    private String corPena;
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comer Frrutas");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    //MÉTODOS ESPECIAIS
    public void fazerNinho() {
        System.out.println("Construir um Ninho");
    }
    
    //GETTERS AND SETTERS
    public String getCorPena() {
        return corPena;
    }
    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}