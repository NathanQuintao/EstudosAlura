import java.util.Scanner;

public class IdadePessoa {

    private String name;
    private int idade;




    public void setName(String name) {
        this.name = name;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getName() {
        return name;
    }
    public int getIdade() {
        return idade;
    }

}
class AgeVerification {
    public static void main(String[] args) {
        // O Scanner fica aqui!
        Scanner sc = new Scanner(System.in);

        // 1. Criamos a pessoa
        IdadePessoa pessoa = new IdadePessoa();

        // 2. Pedimos os dados e usamos os Setters para guardar
        System.out.println("Digite o nome da pessoa: ");
        String nomeDigitado = sc.nextLine();
        pessoa.setName(nomeDigitado);

        System.out.println("Digite a idade da pessoa: ");
        int idadeDigitada = Integer.parseInt(sc.nextLine());
        pessoa.setIdade(idadeDigitada);

        // 3. Usamos o Getter para pegar a idade guardada e fazer o if
        if (pessoa.getIdade() >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        sc.close(); // Boa prática: fechar o Scanner no final
    }
}