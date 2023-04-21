/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Canguru extends Mamifero {
    
    //MÉTODOS ESPECIAIS
    public void usarBolsa() {
        System.out.println("Usando Bolsa");
    }
    
    //MÉTODOS SOBREPOR
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}