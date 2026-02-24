import javax.swing.*;

//Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//Tabela de Código de Condições de Pagamento
//
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
//

public class ListaDiscord12 {

    public static void main(String[] args){

        double x = 0, Final = 0;
        int Valor =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da compra: "));

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o método de pagamento: \n 1 para PIX ou Dinheiro \n 2 para Cartão de Crédito à vista  \n 3 para Cartão de Crédito em até 2x \n 4 para Cartão de Crédito de 3x até 12x"));

        if(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4){

            JOptionPane.showMessageDialog(null, "Você digitou um número inválido!");
            return;
        }

        if(escolha == 1){

            x = Valor * 0.15;
            Final = Valor - x;
        }
        if(escolha == 2){
            x = Valor * 0.1;
            Final = Valor - x;
        }
        if(escolha == 3){
            Final = Valor;
        }
        if(escolha == 4){
            x = Valor * 0.1;
            Final = Valor + x;
        }

        JOptionPane.showMessageDialog(null, "O seu valor final é: " + Final);

    }
}
