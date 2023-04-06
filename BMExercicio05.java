/* Livro Batista & Moraes (2013): questão 5 da página 44;
Implemente um programa que recebe um número de 1 a 7 e imprime o
dia da semana correspondente.
*/

import java.util.Scanner;

public class BMExercicio05 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int numero = read.nextInt();
        String dia_da_semana = "";
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
