/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projetolivro;

/**
 *
 * @author rafael
 */
public interface Publicacao {
    
    //MÉTODOS ABSTRATOS
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag();
    public void voltarPag();
}