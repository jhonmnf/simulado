package tarefasimulado;

import java.util.Scanner;

public class Simulado2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		double n1 = teclado.nextDouble();
		
		
		System.out.println("DIgite o segundo numero: ");
		double n2 = teclado.nextDouble();
		
		
		double soma = n1 + n2;
		
		System.out.println("A soma dos numeros é: " + soma);
		
	}

}
  