package exercicios;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do{
			System.out.println("Insira um número: ");
			num = input.nextInt();
			if(num > 0) {
				soma += num;
	
			}
			
		}while(num !=0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
	}
	
}

