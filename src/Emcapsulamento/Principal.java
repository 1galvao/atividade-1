/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emcapsulamento;

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(17, 02, "Aniversario");
        agenda2.anote(12, 17, "casamento");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    } 
}
