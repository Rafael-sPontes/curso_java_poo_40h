/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author rafael
 */
public class Luta {
    
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("A luta não pode acontecer!");
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void  lutar() {
        if (this.aprovado) {
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("\n===== RESULTADO DA LUTA =====");
            
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado Vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante Vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=============================");
        }
    }
    
    //MÉTODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
}
