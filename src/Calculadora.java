import java.util.Scanner;

public class Calculadora {

    public int duplicNumber(int value) {

        return value * 2;
    }

    public static class Principal {

        public static void main(String[] args) {

            Calculadora calculadora = new Calculadora();
            int resultado = calculadora.duplicNumber(10);
            System.out.println(resultado);
        }
    }



    }

