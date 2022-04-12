import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] listaNome = new String[10];
        
        for (int i = 0; i < listaNome.length; i++){
            int numeroAlunos = i +1;
            System.out.println("Digite o nome "+numeroAlunos+" aluno: "+i);
            listaNome[i] = leitor.nextLine();
        }
        
        System.out.println("------------------------------");
        System.out.println(         "LISTA NOMES"          );
        System.out.println("------------------------------");

        for(int i = 0; i < listaNome.length; i++){
            int numeroAlunos = i + 1;
            System.out.println("Aluno "+numeroAlunos+": "+listaNome[i]);   
        }
    
    }
    
}

/*Faça um programa de lista de chamada que armazene o nome de
10 alunos e apresente a lista completa para o usuário*/