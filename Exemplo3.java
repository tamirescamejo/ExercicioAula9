import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantos números você quer inserir: ");
        int qtdNumero = leitor.nextInt();

        int listaNumero[] = new int[qtdNumero];

        for (int i = 0; i < listaNumero.length; i++){
            System.out.println("insira o valor que será inserido no vetor na posição: "+i);
            int numero = leitor.nextInt();
            listaNumero[i] = numero;
        }
            System.out.println("------------------------------");
            System.out.println(         "LISTA NÚMEROS"        );
            System.out.println("------------------------------");

            int resultadoSoma = 0;
            for(int i = 0; i < listaNumero.length; i++){
                resultadoSoma = resultadoSoma + listaNumero[i];

                //System.out.println("Posição "+i+" - valor: "+listaNumero[i]); 
                // essa parte eu coloco se eu quiser somente aparecer somente os números.
            }

            System.out.println("A Soma total é de: "+resultadoSoma);
    }   
}
