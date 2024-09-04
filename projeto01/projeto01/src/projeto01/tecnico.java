/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto01;

/**
 *
 * @author Admin
 */
public abstract class tecnico {
    protected String nome;
    protected int Nmatricula;
    
    public tecnico (String nome, int Nmatricula){
    this.nome = nome;
    this.Nmatricula = Nmatricula;
    }
    
   public abstract void imprimir();
}
