/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author rafael
 */
public class Cachorro extends Lobo {
    
    //MÉTODOS SOBREPOSIÇÃO
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    //POLIMORFISMO - SOBRECARGA
    public void reagir(String f) {
        if ("Toma comida".equals(f) || "Olá".equals(f)) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int h, int m) {
        if (h < 12) {
            System.out.println("Abanar");
        } else if (h >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }
    
    public void reagir(boolean d) {
        if (d) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
    
    public void reagir(int i, float p) {
        if (i < 5) {
            if (p < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (p < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}