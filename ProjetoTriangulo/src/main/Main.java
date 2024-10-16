package main;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Teste do método Soma
        System.out.println("Soma de 7 e 3: " + funcoes.Soma(7, 3));

        // Teste do método Triangulo
        System.out.println("\nTriângulo com altura 5:");
        funcoes.Triangulo(5);

        // Teste do método printArquivo
        System.out.println("\nConteúdo do arquivo:");
        funcoes.printArquivo("C:\\Users\\jeffe\\OneDrive\\Área de Trabalho\\teste.txt");  // Substitua pelo caminho correto do arquivo
    }
}
