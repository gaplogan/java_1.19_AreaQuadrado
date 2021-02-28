import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) throws Exception {
        // Objeto necess�rio para utilizar a entrada de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Declara��o de vari�veis
        double lado, area;
        
        // Entrada de dados
        System.out.print("Digite o valor do lado do quadrado: "); // garante lado positivo
        lado = entrada.nextDouble(); // f�rmula da �rea do quadrado
        
        // Processamento de dados
        lado = Math.abs(lado); //garante lado positivo
        area = lado * lado; //f�rmula da �rea do quadrado

        // Sa�da de dados
        System.out.println();
        System.out.println("�rea do quadrado: " + area);

        entrada.close();
    }
}
