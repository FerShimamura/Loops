package exercicios;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	int pares = 0, impares = 0;
				
		for(int i = 1; i <= 10; i++) {
		System.out.println("\n Insira o " + i + "º número: ");
		num = input.nextInt();
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
							
			}
				
			System.out.println("\n O total de números pares digitados é : " + pares);
			System.out.println("\n O total de números ímpares digitados é: " + impares);
				
			}

	}
