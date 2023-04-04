
/*  Faça um programa que dada a idade de uma pessoa verifique sua classe eleitoral:
    - Menor que 16 anos não pode votar;
    - Com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
    - Entre 18 e 65 anos (inclusive), votar é obrigatório.     */

import java.util.Scanner;
public class CTExercicio01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");

        int idade = scan.nextInt();

        if (idade < 16){
            System.out.println("Menor que 16 anos NÃO pode votar.");
        } else if (idade == 16 || idade == 17 || idade > 65){
            System.out.println("Para a idade de " + idade + " anos o voto é FACULTATIVO.");
        } else {
            System.out.println("Para a idade de " + idade + " anos o voto é OBRIGATÓRIO.");
        }
    }
}
