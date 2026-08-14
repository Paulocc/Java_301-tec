public class Exemplo06Arrays {
    public static void main(String[] args) {
        //1. Array Unidimensional (Vetor)
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Tamanho do array: " + numeros.length);
        
        System.out.println("Iterando com FOR tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " -> Valor: " + numeros[i]);
        }

        System.out.println("\nIterando com FOR-EACH:");
        for (int valor : numeros) {
            System.out.println("Valor: " + valor);
        }
        //2. Array Multidimensional (Matriz 2x3)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
        };
        System.out.println("\nPercorrendo Matriz 2D:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); //Pula linha após cada linha da matriz
        }
    }
}