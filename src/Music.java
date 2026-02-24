public class Music {

    String title;
    String artist;
    int yearOfRelease = 0, avaliables = 0, ratingNumbers = 0;
    double sumOfRatings = 0;

    void displayTechnicalSheet() {

        System.out.println("Nome da Música: " + title);
        System.out.println("Ano de Lançamento:" + yearOfRelease);
        System.out.println("Avaliações:" + avaliables);
        System.out.println("Números de Avaliações:" + ratingNumbers);
    }
    void avalia(double nota) {
        sumOfRatings += nota;
        ratingNumbers++;
    }

    double pegaMedia() {
        return sumOfRatings / ratingNumbers;
    }
}

//Classe Principal
class Principal {
    public static void main(String[] args) {
        Music minhaMusica = new Music();

        minhaMusica.title = "Nome da Música";
        minhaMusica.artist = "Nome do Artista";
        minhaMusica.yearOfRelease = 2023;

        minhaMusica.displayTechnicalSheet();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}

