import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int resultado = somatorio(numero);

        System.out.println(resultado);
    }

    public static int somatorio (int numeroDigitado){
        int soma = 0;

        for(int i = 0; i <= numeroDigitado; i++){
            soma = soma + i;
        }
        return soma;
    }
}

/*Faça um algoritmo que contenha um método que receba um número do
usuário e realize a somatório de todos os números no intervalo de 1 até o
número digitado pelo usuário. Exiba o resultado final da somatória.*/
