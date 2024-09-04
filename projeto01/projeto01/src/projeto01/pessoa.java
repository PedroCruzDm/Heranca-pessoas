/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto01;

/**
 *
 * @author Admin
 */
class pessoa extends tecnico {
    protected String tipodecargo;
    
    public pessoa(String nome, int Nmatricula, String tipodecargo){
        super(nome, Nmatricula);
        this.nome = nome;
        this.Nmatricula = Nmatricula;
        this.tipodecargo = tipodecargo;
    }
    
    
    @Override
    public void imprimir(){
        System.out.println("o "+ this.nome +" é o "+ this.tipodecargo +"e o seu numero de matricula é "+ this.Nmatricula );
    }
}