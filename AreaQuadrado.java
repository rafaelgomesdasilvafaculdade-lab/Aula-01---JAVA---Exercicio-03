/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Processamento (cálculo da área)
        double area = lado * lado;

        // Saída do resultado
        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}