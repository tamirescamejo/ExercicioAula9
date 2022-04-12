import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de itens que deseja incluir: ");
        int qtdItens = leitor.nextInt();

        String[] listaSupermercado = new String [qtdItens];

        for (int i = 0; i < listaSupermercado.length; i++){
            System.out.println("Insira o produto na lista: "+i);
            String itens = leitor.next();
            listaSupermercado[i] = itens;
        }

        for (int i = 0; i < listaSupermercado.length; i++) {
            System.out.println("Item " +(i+1)+ ": " +listaSupermercado[i]);

            }
}
} 

/*Faça um programa que receba de lista de compras sendo que o
usuário irá inserir a quantidade de itens que quer adicionar na lista
de compras e após inserir a quantidade o programa deverá permitir
que o usuário insira os produtos nessa lista. Exiba a lista completa
para o usuário.*/
