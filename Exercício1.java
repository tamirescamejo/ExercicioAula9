public class Exercício1 {

    public static void main(String[] args) {
        int vetorNumero[] = new int [5];

        int soma = 0;

        for(int i = 0; i < vetorNumero.length; i++){
            soma = soma + vetorNumero[i];
        }
        
        System.out.println("A soma dos vetores é: "+soma);

    }
    
}

/*Faça um programa que leia 5 valores inteiros, armazene-os em um
vetor, calcule e apresente a soma destes valores*/
