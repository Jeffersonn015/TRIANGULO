package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {
    
    // Soma dois números inteiros e retorna o resultado
    public int Soma(int a, int b) {
        return a + b;
    }

    // Exibe um triângulo feito de "x" com a altura especificada
    public void Triangulo(int altura) {
        // Loop para controlar as linhas do triângulo
        for (int i = 1; i <= altura; i++) {
            // Imprime a quantidade de "x" igual à linha atual
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            // Pula para a próxima linha
            System.out.println();
        }
    }

    // Lê e imprime o conteúdo de um arquivo de texto
    public void printArquivo(String arquivo) {
        // Usa para ler o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            // le e imprime cada linha até chegar ao final do arquivo
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            // Exibe a mensagem de erro se houver problema ao abrir o arquivo
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
