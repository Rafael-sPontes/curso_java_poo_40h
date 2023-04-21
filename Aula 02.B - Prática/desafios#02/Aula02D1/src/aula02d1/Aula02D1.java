/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02d1;

/**
 *
 * @author rafael
 */
public class Aula02D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n - PSVITA_01 -");
        VideoGame v1 = new VideoGame();
        v1.marca = "SONY";
        v1.modelo = "PSVita";
        v1.cor = "Laranja";
        v1.tela = 5.0;
        v1.desligar();
        v1.status();
        v1.desbloquear();
        v1.jogar();
        v1.desligar();
        
        System.out.println("\n - PSVITA_02 -");
        VideoGame v2 = new VideoGame();
        v2.marca = "SONY";
        v2.modelo = "PSVita";
        v2.cor = "Azul";
        v2.tela = 5.0;
        v2.ligar();
        v2.status();
        v2.bloquear();
        v2.jogar();
        v2.desligar();
        
        System.out.println("\n - PSVITA_03 -");
        VideoGame v3 = new VideoGame();
        v3.marca = "SONY";
        v3.modelo = "PSVita";
        v3.cor = "Azul";
        v3.tela = 5.0;
        v3.ligar();
        v3.status();
        v3.desbloquear();
        v3.jogar();
        v3.desligar();
    }
}