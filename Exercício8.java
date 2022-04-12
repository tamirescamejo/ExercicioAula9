import java.util.Scanner;

public class Exercício8 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        calculoImc(altura, peso);
    }

    public static void calculoImc (double altura, double peso) {

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC é de: ", imc);
            System.out.println(". Você está abaixo do peso.");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é de: ", imc);
            System.out.println(". Seu peso está normal.");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Seu IMC é de: ", imc);
            System.out.println(". Você está com sobrepeso.");

        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é de:", imc);
            System.out.println(". Você está com obesidade de grau I.");

        } else {
            System.out.printf("Seu IMC é de: ", imc);
            System.out.println(". Você está com obesidade de grau II.");
        }
    }
}

/*Faça um algoritmo que contenha uma função que calcule o IMC de um
usuário a partir da inserção do seu peso e de sua altura. Exiba a
classificação do usuário após a verificação do seu IMC.*/
