package projetoIdade;

import java.util.Scanner;

public class CalculadoraIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Informe a porcentagem do IPI a ser acrescido: ");
        double ipiPorcentagem = scanner.nextDouble();

      
        System.out.print("Informe o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Informe a quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

       
        System.out.print("Informe o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Informe a quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

       
        double valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (ipiPorcentagem / 100 + 1);

    
        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();
    }
}