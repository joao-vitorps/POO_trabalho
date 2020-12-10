
package prototipo;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor e William
 */
public class Imovel {
    private String endereco;
    private double preco;
        
    

    //Gets
    public String getEndereco() {
        return endereco;
    }
    public double getPreco() {
        return preco;
    }

    //Sets
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    //Contrutores
    public Imovel(){
    }

    public Imovel(double preco) {
        this.preco = preco;
    }
    
    
    
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
    
    public double calculaPreco(){
        return this.getPreco();
    }
    
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Os dados do imóvel são: \n"
                + "Endereço: "+this.getEndereco()+"\n"
                + "Preço: "+calculaPreco());
    }
    
}
