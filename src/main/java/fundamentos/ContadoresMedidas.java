package fundamentos;

import static fundamentos.Medidas.entrada;

public interface ContadoresMedidas {
    static void contagemRegressiva() {
        System.out.print("Começar a contagem a partir de qual número? ");
        int numero = entrada.nextInt();

         for(int i = numero; i >= 1; i--){

            System.out.println(i);
        }
        System.out.println("Entrou na interface - usou uma modificação do metodo");
    }
}
