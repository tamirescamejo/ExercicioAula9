import java.util.Scanner;

public class Exercício9 {

        public static void main(String[] args) {
            
            Scanner leitor = new Scanner(System.in);
        
            System.out.println("Qual a base do seu retângulo? ");
            double base = leitor.nextDouble();
            System.out.println("Qual a altura do seu retângulo? ");
            double altura = leitor.nextDouble();
          
            areaRetangulo(base, altura);
        }

        public static double areaRetangulo (double base, double altura) {

            double area = (base * altura);
            System.out.printf("A área do seu retângulo é de: ", area);
            
            return area;
        }
}
    
/* Faça um algoritmo que contenha uma função para ler as dimensões de
um retângulo (base e altura), calcular e imprimir para o usuário a área do retângulo;*/
