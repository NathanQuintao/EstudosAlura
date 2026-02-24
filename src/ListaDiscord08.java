import javax.swing.JOptionPane;
import javax.swing.*;


//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class ListaDiscord08 {

    public static void main(String[] args) {

        String lista = "";

        int i = 0;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));



            if (num1 > num2 && num1 > num3 && num2 > num3){

                lista = lista + num1 + " " + num2 + " "+ num3;
            }

            if (num3 > num1 && num3 > num2 && num2 > num1) {

                lista = lista + num3 + " " + num2 + " "+ num1;

            }



        JOptionPane.showMessageDialog(null,"Números em ordem descrescente: " + lista);


        }
    }

