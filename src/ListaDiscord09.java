//import javax.swing.*;
//import javax.swing.JOptionPane;
//
//import static javax.swing.JOptionPane.showMessageDialog;
////Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
////
////de acordo com a tabela abaixo:
////
////Fórmula do IMC = peso / (altura) ²
////
////Tabela Condições IMC
////
////
////
//// Abaixo de 18,5   | Abaixo do peso
////
//// Entre 18,6 e 24,9 | Peso ideal (parabéns)
////
//// Entre 25,0 e 29,9 | Levemente acima do peso
////
//// Entre 30,0 e 34,9 | Obesidade grau I
////
//// Entre 35,0 e 39,9 | Obesidade grau II (severa)
////
//// Maior ou igual a 40 | Obesidade grau III (mórbida)
//
//
//
//
//public class ListaDiscord09 {
//
//    public static void main(String[] Args){
//
//        double altura = 0.00, peso = 0.00, imc = 0;
//
//        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
//        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe sua peso:"));
//
//        imc = altura / (peso * peso);
//
//        if(imc <= 18.5) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você está abaixo do peso!");
//        }
//        if(imc > 18.5 && imc <= 24.9) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você está no peso ideal!");
//        }
//        if(imc > 24.9 && imc <= 29.9) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você está levemente acima do peso!");
//        }
//        if(imc > 29.9 && imc <= 34.9) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você está com Obesidade Grau I!");
//        }
//        if(imc > 34.9 && imc <= 39.9) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você com Obesidade Grau II!");
//        }
//        if(imc > 40) {
//
//            String JOptionpane.showMessageDialog(null, "O seu IMC é: " + imc + "Portanto você está com Obesidade Mórbida!");
//        }
//    }
//}
