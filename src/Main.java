import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;

import static javax.swing.JOptionPane.*;


public class Main {
    public static void main(String[] args) {

        int idade = 0, x = 0, MaiorIdade = 0, MenorIdade = 200;
        String listadeidades = "";

        while(true){
            idade = Integer.parseInt(showInputDialog("Digite sua idade: "));

            if(idade == -1){
                break;
            }

            listadeidades = listadeidades + "\n" + idade;

            x = idade;

            if (idade > MaiorIdade) {
                MaiorIdade = idade;
            }
            if (idade < MenorIdade) {
                MenorIdade = idade;
            }

        }

    JOptionPane.showMessageDialog(null, "Lista: " + listadeidades + "\nMaior Idade: " + MaiorIdade + "\n" + "\n Menor idade: " + MenorIdade);
}
    }


