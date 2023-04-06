/* Livro Batista & Moraes (2013): questão 5 da página 44;
Implemente um programa que recebe um número de 1 a 7 e imprime o
dia da semana correspondente. */

import java.util.Scanner;

public class BMExercicio05 {
    public static void main(String args[]) {

        int numero = 0;

        // Repetirá enquanto não digitar um número válido
        while (numero < 1 || numero > 7) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe um número entre 1 e 7: ");
            numero = scanner.nextInt();
        }        

        String dia_da_semana = "";
        
        // Exibirá o dia da semana correspondente ao número
        switch(numero) {
            case 1:
                dia_da_semana = "domingo";
                break;
            case 2:
                dia_da_semana = "segunda";
                break;
            case 3:
                dia_da_semana = "terça";
                break;
            case 4:
                dia_da_semana = "quarta";
                break;
            case 5:
                dia_da_semana = "quinta";
                break;
            case 6:
                dia_da_semana = "sexta";
                break;
            default:
                dia_da_semana = "sabado";
                break;
        }
        System.out.println("O " + numero + "º dia da semana eh " + dia_da_semana);
    }
}
