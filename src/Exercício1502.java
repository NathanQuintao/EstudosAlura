import java.util.*;
import javax.swing.JOptionPane;


//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Exercício1502 {

    public static void main(String[] args) {

        int min = -100;
        int max = 100;
        int range = (max - min) + 1;


        int numero = (int) ((Math.random() * range) + min);
        String mensagem = "";

        if (numero % 2 == 0) {
            if (numero >= 0) {
                mensagem = "O número é positivo e par";
            } else {
                mensagem = "O número é negativo e par";
            }
        } else {
            if (numero >= 0) {
                mensagem = "O número é positivo e ímpar";
            } else {
                mensagem = "O número é negativo e ímpar";
            }
        }

        JOptionPane.showMessageDialog(null, "Número: " + numero + "\n" + mensagem);

    }
}