package projetoIdade;

import java.util.Scanner;


public class Saldo {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.print("Informe o saldo: ");
	        double saldo = scanner.nextDouble();
	        
	        double saldoComReajuste = saldo * 1.01;
	        
	        System.out.println("O saldo com reajuste de 1% é: " + saldoComReajuste);
	        
	        scanner.close();

	}

}
