/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor e William
 */
public class Novo extends Imovel {
    
    //Contrutor para utilizar os atributos da superclasse
    public Novo(String endereco, double preco) {
        super(endereco, preco);
    }
    
    @Override
    public double calculaPreco(){
        return this.getPreco() * 1.1;
    }
    
    @Override
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Os dados do imóvel são: \n"
                + "Endereço: "+this.getEndereco()+"\n"
                + "Preço: "+calculaPreco());
    }
    
}
