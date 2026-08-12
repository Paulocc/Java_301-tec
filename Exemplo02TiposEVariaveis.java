public class Exemplo02TiposEVariaveis {
    public static void main(String[] args) {
        //Tipos Primitivos Inteiros
        byte idade = 18;             //8 bits (-128 a 127)
        int populacao = 250000;      //32 bits (mais comum)
        long distanciaEstelar = 9876543210L; //64 bits (requer 'L' no final)

        //Tipos Primitivos Decimais
        float preco = 19.99f;        //32 bits (requer 'f' no final)
        double precisaoPi = 3.14159;  //64 bits (padrão para decimais)

        //Outros Tipos Primitivos
        char inicial = 'J';          //Caractere único (aspas simples)
        boolean ativo = true;        //Verdadeiro ou falso

        //Constante (valor não pode ser alterado)
        final double TAXA_FIXA = 0.05;

        //Texto (Tipo por Referência/Classe)
        String linguagem = "Java";   //Texto (aspas duplas)

        //Casting (Conversão de Tipos)
        int precoInteiro = (int) preco; //Casting explícito (descarta decimais)
        double idadeDouble = idade;      //Casting implícito (promove int -> double)

        System.out.println("Linguagem: " + linguagem + " " + inicial);
        System.out.println("Preço original: " + preco + " | Convertido para int: " + precoInteiro);
    }
}
