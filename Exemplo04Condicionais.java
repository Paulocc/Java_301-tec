import java.util.Scanner;

public class Exemplo04Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a nota? ");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 70) {
            System.out.println("Conceito: B");
        } else if (nota >= 50) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: Reprovado");
        }

        //Estrutura SWITCH-CASE
        System.out.print("Qual o dia da semana? ");
        int diaDaSemana = scanner.nextInt();
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        scanner.close();
    }
}