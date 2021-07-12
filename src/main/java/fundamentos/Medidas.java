// 1- Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // Instacioar o objeto de leitura do console


    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area =0; // recebe o resultado dos cálculos de area


        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado ");
        System.out.println("(2) - Area do Retangulo ");
        System.out.println("(3) - Area do Triangulo ");
        System.out.println("(4) - Area do Circulo ");

        opcao = entrada.nextLine(); //Leitura da opcao
        switch(opcao){
            case "1":
            area = calcularAreaDoQuadrado();
            break;
            case "2":
                // ToDo: calcular área do retangulo
            default:
                System.out.println("Opcão Invalida:" + opcao);
        }
        if (area > 0){
           System.out.println("A area e de " + area + "m²" );
        }


    }

    public static int calcularAreaDoQuadrado(){

        int lado; // Tamanho de lado de quadrado

        System.out.println("Digite o tamanho do lado: ");
         lado = entrada.nextInt(); //leitura do tamanho do lado
         return lado * lado; // retorna a área do quadrado
    }
}
