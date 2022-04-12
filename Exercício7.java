import java.util.Scanner;

public class Exercício7 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nomeDigitado = leitor.nextLine();

        mensagem(nomeDigitado);
        }

        public static void mensagem(String nome){
        System.out.println("Meu nome é "+nome);
}
} 

/*Faça um algoritmo que contenha uma função que receba o nome de um
usuário e retorne a mensagem Meu nome é <NomeDigitado>.*/
