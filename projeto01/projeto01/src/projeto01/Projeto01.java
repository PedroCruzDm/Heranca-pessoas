/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto01;
/**
 *
 * @author Admin
 */
public class Projeto01 {
    public static void main(String[] args) {
      pessoa p2 = new pessoa("rafael", 1, "assistente");
      pessoa p1 = new pessoa("alan", 254, "tecnico"){};
     
      
     p1.imprimir();
     p2.imprimir();
}
}
