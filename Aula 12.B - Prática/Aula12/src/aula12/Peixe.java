/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author rafael
 */
public class Peixe extends Animal {
    
    //ATRIBUTOS
    private String corEscama;
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Peixe NÃO emite Som");
    }
    
    //MÉTODOS ESPECIAIS
    public void soltarBolha() {
        System.out.println("Soltou uma Bolha");
    }
}