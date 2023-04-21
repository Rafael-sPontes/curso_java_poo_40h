/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02d2;

/**
 *
 * @author rafael
 */
public class Estudar {
    String dispositivo;
    int disponivel;
    boolean online;
    boolean site;
    boolean atencao;
    boolean praticar;
    
    void status() {
        System.out.println("Dispositivo: " + this.dispositivo);
        System.out.println("Disponível: " + this.disponivel);
    }
    
    void onlineOn() {
        this.online = true;
    }
    
    void onlineOff() {
        this.online = false;
    }
    
    void siteOn() {
        this.site = true;
    }
    
    void siteOff() {
        this.site = false;
    }
    
    void atencaoOn() {
        this.atencao = true;
    }
    
    void atencaoOff() {
        this.atencao = false;
    }
    
    void praticarOn(){
        this.praticar = true;
    }
    
    void praticarOff() {
        this.praticar = false;
    }
    
    void online() {
        if (online == true) {
            System.out.println("ONLINE: Acesso Concedido.");
        } else {
            System.out.println("OFFLINE: Acesso Negado.");
        }
    }
    
    void site() {
        if (site == true) {
            System.out.println("Aula aberta para estudo.");
        } else {
            System.out.println("ERRO! Sem aulas.");
        }
    }
    
    void atencao() {
        if (atencao == true) {
            System.out.println("Conhecimento Adquirido.");
        } else {
            System.out.println("Assistir novamente.");
        }
    }
    
    void praticar() {
        if (praticar == true) {
            System.out.println("Colocando em prática!");
        } else {
            System.out.println("Deve praticar mais!");
        }
    }
    
    
    
}