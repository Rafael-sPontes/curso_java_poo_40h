/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02d2;

/**
 *
 * @author rafael
 */
public class Aula02D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n - ESTUDO_01 -");
        Estudar e1 = new Estudar();
        e1.dispositivo = "Notebook";
        e1.disponivel = 1;
        e1.status();
        e1.onlineOff();
        e1.online();
        
        System.out.println("\n - ESTUDO_02 -");
        Estudar e2 = new Estudar();
        e2.dispositivo = "Notebook";
        e2.disponivel = 1;
        e2.status();
        e2.onlineOn();
        e2.online();
        e2.siteOff();
        e2.site();
        
        System.out.println("\n - ESTUDO_03 -");
        Estudar e3 = new Estudar();
        e3.dispositivo = "Notebook";
        e3.disponivel = 1;
        e3.status();
        e3.onlineOn();
        e3.online();
        e3.siteOn();
        e3.site();
        e3.atencaoOff();
        e3.atencao();
        
        System.out.println("\n - ESTUDO_04 -");
        Estudar e4 = new Estudar();
        e4.dispositivo = "Notebook";
        e4.disponivel = 1;
        e4.status();
        e4.onlineOn();
        e4.online();
        e4.siteOn();
        e4.site();
        e4.atencaoOn();
        e4.atencao();
        e4.praticarOff();
        e4.praticar();
        
        System.out.println("\n - ESTUDO_05 -");
        Estudar e5 = new Estudar();
        e5.dispositivo = "Notebook";
        e5.disponivel = 1;
        e5.status();
        e5.onlineOn();
        e5.online();
        e5.siteOn();
        e5.site();
        e5.atencaoOn();
        e5.atencao();
        e5.praticarOn();
        e5.praticar();
    }
}