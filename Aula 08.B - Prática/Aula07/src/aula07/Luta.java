/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

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
    public void marcarLuta(Lutador lut1, Lutador lut2) {
        if (lut1.getCategoria().equals(lut2.getCategoria()) && lut1 != lut2) {
            this.aprovado = true;
            this.desafiado = lut1;
            this.desafiante = lut2;
        } else {
            System.out.println("Não haverá essa Luta!");
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovado) {
            System.out.println("\n--- DESAFIADO ---");
            this.desafiado.apresentar();
            System.out.println("\n--- DESAFIANTE ---");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("\n--- RESULTADO DA LUTA ---");
            
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("VITÓRIA! " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("VITÓRIA! " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=============================");
        }
    }
    
    //MÉTODOS ESPEICIAS
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