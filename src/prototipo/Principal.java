
package prototipo;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imovel im;
        Vendedor ve;
        
        //Questionadores
        int op;
        int cli;
        int vend = 0;
        
        
        String endereco;
        double valor;
        double preco;
        double comissao;
        double salario;
        
        // Menu Principal
        OUTER:
        OUTER_1:
        for (;;) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Você é:\n "
                    + "1 - Cliente\n"
                    + "2 - Vendedor\n"
                    + "3 - Nada")  );            
            if (op==3){ //Caso já queira sair
                break;
            }
            
            if (op==1) {
                endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço do imóvel: "));
                valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do imóvel: "));
                cli = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de imóvel deseja comprar:\n "
                        + "1 - Novo\n"
                        + "2 - Velho\n"
                        + "3 - Sair")  );
                
                //Menu cliente
                switch (cli) {
                    case 1:
                        im = new Novo(endereco, valor);
                        im.imprime();
                        break;
                    case 2:
                        im = new Velho(endereco, valor);
                        im.imprime();
                        break;
                    default:
                        break OUTER_1;
                }
            } else if (op==2){
                
                
                vend = Integer.parseInt(JOptionPane.showInputDialog("O que você quer ver:\n "
                        + "1 - Salario\n"
                        + "2 - Comissao\n"
                        + "3 - Sair")  );
            }
            
            //Menu Vendedor
            switch (vend) {
                //Salario
                case 1:
                    ve = new Vendedor();
                    ve.setSalario(2012.0); //Salario Base
                    ve.imprime();
                    break;
                    
                //Comissao    
                case 2:
                    preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do imóvel a ser vendido: "));
                    comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem da comissão (0.0): "));
                    ve = new Vendedor();
                    ve.setSalario(2012.0);
                    salario = ve.getSalario();
                    ve.calculaComissao(preco, comissao, salario);
                    ve.imprime();
                    break;
                    
                default:
                    break OUTER;
            }
        }
    }

    
    
}
