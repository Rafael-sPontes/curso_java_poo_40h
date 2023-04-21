/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author rafael
 */
public class Lutador implements Interface {
    
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //MÉTODOS ESPECIAIS

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //GETTERS AND SETTERS
    private String getNome() {
        return nome;
    }
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private String getNacionalidade() {
        return nacionalidade;
    }
    
    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    private int getIdade() {
        return idade;
    }
    
    private void setIdade(int idade) {
        this.idade = idade;
    }
    
    private float getAltura() {
        return altura;
    }
    
    private void setAltura(float altura) {
        this.altura = altura;
    }
    
    private float getPeso() {
        return peso;
    }
    
    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    private String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    private int getVitorias() {
        return vitorias;
    }
    
    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    private int getDerrotas() {
        return derrotas;
    }
    
    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    private int getEmpates() {
        return empates;
    }
    
    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //MÉTODOS ABSTRATOS
    @Override
    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso: " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}