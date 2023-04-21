/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Cachorro extends Mamifero {
    
    //MÉTODOS ESPECIAIS
    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando");
    }
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
}