import java.util.Scanner;

public class Exemplo03EntradaDeDados {
    public static void main(String[] args) {
        //Cria o leitor de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); //Lê uma linha inteira de texto
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); //Lê um número inteiro
        System.out.print("Digite sua altura (ex: 1,75): ");
        double altura = scanner.nextDouble(); //Lê um número decimal
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        scanner.close(); //Fecha o scanner após o uso
    }
}