/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02d1;

/**
 *
 * @author rafae
 */
public class VideoGame {
    
    String marca;
    String modelo;
    String cor;
    Double tela;
    Boolean ligado;
    Boolean desbloqueado;
    Boolean jogando;
    
    void status() {
        System.out.print("VideoGame da: " + this.marca);
        System.out.print(", modelo: " + this.modelo);
        System.out.print(", na cor " + this.cor);
        System.out.print(" e tela de " + this.tela + "\"");
        System.out.print("\nEstá ligado? [" + this.ligado);
    }
    
    void ligar() {
        this.ligado = true;
    }
    
    void desligar() {
        this.ligado = false;
    }
    
    void bloquear() {
        this.desbloqueado = false;
    }
    
    void desbloquear() {
        if (ligado == true) {
            desbloqueado = true;
            System.out.print("] Aparelho desbloqueado!");
        } else {
            desbloqueado = false;
            System.out.print("] ERRO! Primeiro ligue o aparelho.");
        }
    }
    
    void jogar() {
        if (ligado == false) {
            System.out.println("");
        } else {
            if (desbloqueado == true) {
            System.out.println(" Pode Jogar!");
            } else {
                System.out.println("] ERRO! Primeiro desbloqueie o aparelho.");
            }
        }
    }
}