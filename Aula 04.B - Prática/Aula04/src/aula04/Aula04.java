/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author rafael
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        c1.status();
        
        /*
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        //c1.modelo = "BIC";
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
    }
}