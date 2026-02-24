import javax.swing.*;


//Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

public class ListaDiscord05 {

    public static void main(String[] args) {

        double Salario_min = 1620.99;

        double quant = 0 ;


        double Salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu Salário: "));

        quant = Salario / Salario_min;

        JOptionPane.showMessageDialog(null, "Você ganha: " + quant + " Salários mínimos");

    }
}
