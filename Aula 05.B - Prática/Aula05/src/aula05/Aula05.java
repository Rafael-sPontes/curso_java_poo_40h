/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author rafael
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Gabriel");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Marlene");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}