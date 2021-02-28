import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) throws Exception {
        // Objeto necessário para utilizar a entrada de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Declaração de variáveis
        double lado, area;
        
        // Entrada de dados
        System.out.print("Digite o valor do lado do quadrado: "); // garante lado positivo
        lado = entrada.nextDouble(); // fórmula da área do quadrado
        
        // Processamento de dados
        lado = Math.abs(lado); //garante lado positivo
        area = lado * lado; //fórmula da área do quadrado

        // Saída de dados
        System.out.println();
        System.out.println("Área do quadrado: " + area);

        entrada.close();
    }
}
