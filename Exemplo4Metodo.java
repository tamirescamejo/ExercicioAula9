import java.util.Scanner;

public class Exemplo4Metodo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeDigitado = leitor.nextLine();

        mensagemBoasVindas(nomeDigitado, sobrenomeDigitado);
        }

    public static void mensagemBoasVindas(String nome, String sobrenome){
        System.out.println("Olá "+nome+" "+sobrenome);
        }

}
