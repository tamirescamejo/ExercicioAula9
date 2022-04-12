import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int listaNumero[] = new int [10];

        for (int i = 0; i < listaNumero.length; i++){
            System.out.println("Digite o primeiro número inteiro: ");
            listaNumero[i] = leitor.nextInt();
        }

        System.out.println("Lista de número pares");

        for(int i = 0; i < listaNumero.length; i++){
           if (listaNumero[i] % 2 == 0){

            System.out.println(+listaNumero[i]);
           }
        }
    
    }
}

/*Faça um programa que receba 10 números inteiros, armazene-os e
verifique quais numeros são pares, e exiba para o usuário apenas os
números pares da lista.*/
