package projetoIdade;

import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        
        double salarioMinimo = 1320;

      
        System.out.print("Informe o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

     
        System.out.println("O usuário ganha aproximadamente " + quantidadeSalariosMinimos + " salário(s) mínimo(s).");

        scanner.close();
    }
}
