//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.


import javax.swing.*;

public class Exercicio1501 {

    public static void main(String[] args) {

        int a = 0, soma = 0;
        int b = 0;
        int c = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor das letra a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor das letra b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor das letra c: "));

        soma = a + b;

        if(soma < c){

            JOptionPane.showMessageDialog(null, "O valor de A é: " + a + "\n " + "O valor de B é: " + b + "\n" +"A soma de A + B: " +soma
                    + "\n " + "O valor de C é: " + c );
        }else{JOptionPane.showMessageDialog(null,"O valor de C é menor");}


    }
}
