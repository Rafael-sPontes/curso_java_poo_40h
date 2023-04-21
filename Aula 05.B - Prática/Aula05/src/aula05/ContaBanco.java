/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author rafael
 */
public class ContaBanco {
    
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //MÉTODO CONSTRUTOR
    public void estadoAtual() {
        System.out.println("----------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
    
    public ContaBanco() {
        saldo = 0;
        status = false;
    }
    
    //MÉTODOS
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("ERRO! Conta com dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("ERRO! Conta em Débito!");
        } else {
            this.setStatus(false);
        }
    }
    
    public void depositar(float v) {
        
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("ERRO! Impossível Depositar!");
        }
    }
    
    public void sacar(float v) {
        
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("ERRO! Saldo Insuficiente!");
            }
        } else {
            System.out.println("ERRO! Impossível Sacar!");
        }
    }
    
    public void pagarMensal(float v) {
        
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
            } else {
                System.out.println("ERRO! Saldo Insuficiente!");
            }
        } else {
            System.out.println("ERRO! Impossível Pagar!");
        }
    }
    
    public void status() {
    }
    
    //GETTERS AND SETTERS
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean st) {
        this.status = st;
    }   
}