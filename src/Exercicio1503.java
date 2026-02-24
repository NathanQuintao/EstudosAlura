import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.*;

//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.

public class Exercicio1503 {

    public static void main(String[] args) {

        int C = 0;

        int A = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));

        if (A == B) {
            C = A + B;

        }else  {
            C = A * B;
        }

        JOptionPane.showMessageDialog(null, C);
    }

}
