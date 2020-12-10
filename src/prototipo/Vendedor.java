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
    public void calculaComissao(double preco, double comissao, double salario ){
            this.salario = salario + (preco*comissao);
      
    }

    public Vendedor(double comissao, double preco) {
        super(preco);
        this.comissao = comissao;
    }
    
    //Polimorfismo
    @Override
            public void imprime(){
        JOptionPane.showMessageDialog(null, "O seu salario com a comissão é: \n"
                + (this.salario + this.comissao));
    }
    
   
   
    

}
