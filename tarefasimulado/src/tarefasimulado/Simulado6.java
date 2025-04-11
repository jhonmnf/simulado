package tarefasimulado;

import java.util.Scanner;

public class Simulado6 {
	
public static void main (String[] args){
	
	Scanner teclado = new Scanner(System.in);
	
	 exibeCabeçalho(args);
	
	System.out.println("Digite o seu primeiro valor");
	double numero1 = teclado.nextDouble();
	
	System.out.println("Digite o segundo numero");
	double numero2 = teclado.nextDouble();
	
	 mostraOperaçoesMatematicas(numero1 ,numero2);
	 
	 exibeRodape(args);
	 
}
	public static void exibeCabeçalho(String[] args) {
		System.out.println("Ola!, seja bem vindo ao meu programa JAVA, peço que digite dois numeros para mim");
		
								
	}	
	public static void mostraOperaçoesMatematicas(double n1, double n2) {
		double soma = n1 + n2;
		double subtracao = n1 - n2;
		double multiplicaçao = n1 * n2;
		double divisao = n1 / n2;
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A subtraçao dos numeros é: " + subtracao);
		System.out.println("A multiplicaçao dos numero é: " + multiplicaçao);
		System.out.println("A divisao dos numero é: " + divisao);
	}
	public static void exibeRodape(String[] args) {
		System.out.println("Muito obrigado!, encerra-se aki");
		
}
}