package br.com.alura.desafios;

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
//Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//Adicione uma subclasse ModeloCarro para criar instâncias específicas,
//utilizando-a na classe principal para definir preços e mostrar informações.



public class Car extends CarModel{

    public void Model() {
        System.out.println("Modelo");
    }
    public void Price() {
        System.out.println("Preço");
    }

    public static void main(String[] args) {

        CarModel mc = new CarModel();


        System.out.println("O Nome do Modelo do carro é: " + mc.name);

        System.out.println("O preço deste Modelo é: " + mc.price);

        System.out.println("O ano do modelo é: " + mc.year);
    }
}
