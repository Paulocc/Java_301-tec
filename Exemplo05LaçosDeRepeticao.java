public class Exemplo05LaçosDeRepeticao {
    public static void main(String[] args) {
        System.out.println("Contagem com FOR");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Passo " + i);
        }
        System.out.println("\nContagem com WHILE");
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Contador WHILE: " + contador);
            contador++;
        }
        System.out.println("\nContagem com DO-WHILE");
        int numero = 5;
        do {
            System.out.println("Executado pelo menos uma vez, numero = " + numero);
            numero++;
        } while (numero < 5); //Falso na primeira checagem
    }
}