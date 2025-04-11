package tarefasimulado;

import java.util.Scanner;

public class Simulado5 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite o seu nome: ");
	String nome = teclado.nextLine();
	
	System.out.println("Digite o valor do produto: ");
	double valorpr = teclado.nextDouble();
	
	System.out.println("Digite a quantidade de produtos que deseja comprar: ");
	double quantidade = teclado.nextDouble();
	
	double total = valorpr * quantidade;
	
	System.out.println("Ola " + nome + ", o valor unitario do produto é de: " + valorpr + "R$ , a quantidade de produtos é de " + quantidade + ", e o valor total da compra é de " + total + "R$");
	
}
}
