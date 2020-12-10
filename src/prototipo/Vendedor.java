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
public class Vendedor extends Imovel{
    private double salario;
    private double comissao;

    
    
    //Herança:
    public Vendedor() {
        super();
    }
    
   
    //Gets

    public double getSalario() {
        return salario;
    }
    public double getComissao() {
        return comissao;
    }

    //Sets
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
    //Construtores:
    public void calculaComissao(double salario, double comissao ){
            this.salario = salario + (salario*comissao);
      
    }

    public Vendedor(double comissao, double preco) {
        super(preco);
        this.comissao = comissao;
    }
    
            public void imprimeSalario(){
        JOptionPane.showMessageDialog(null, "O seu salario é: \n"
                + this.salario);
    }
    
    //Polimorfismo+/-
    public void imprime(double sal){
        double salario = sal*comissao;
        JOptionPane.showMessageDialog(null, "Os dados da sua conta são: \n"
                + "Salario: "+this.getSalario()+"\n"
                + "Preço: "+this.getComissao());
    }
    

}
