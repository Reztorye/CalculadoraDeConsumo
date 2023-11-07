package CalculadoraDeConsumo;

import java.util.Scanner;

public class CalculadoraDeConsumo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double z = 0;
		
		System.out.println("Calculadora de Consumo de Combustível");
		System.out.println("--------------------------------------");
		System.out.print("Informe a distância total da viagem (em km): ");
		double distancia = scanner.nextDouble();
		System.out.print("Informe o consumo médio do veículo (km/l): ");
		double consumoMedio = scanner.nextDouble();
		System.out.print("Informe o tamanho do tanque em litros: ");
		double tamanhoTanque = scanner.nextDouble();
		System.out.print("Informe o tipo do combustível (Comum/Aditivada/Alcool: ");
		scanner.nextLine();
		String tipoCombustivel = scanner.nextLine();
		
		switch(tipoCombustivel) {
		case "Comum": 
			x = (distancia / consumoMedio);
			y = x * 5;
			z = (distancia / (consumoMedio * tamanhoTanque));
			break;
		case "Aditivada":
			x = (distancia / consumoMedio);
			y = x * 3.50;
			z = (distancia / (consumoMedio * tamanhoTanque));
			break;
		case "Alcool":
			x = (distancia / consumoMedio);
			y = x * 4.50;
			z = (distancia / (consumoMedio * tamanhoTanque));
			break;	
		}
		
		System.out.println("Cálculo de Consumo");
		System.out.println("-------------------");
		System.out.println("Litros de combustivel necessarios: " + x + " litros");
		System.out.println("Custo total da viagem: R$ " + y);
		System.out.println("Quantidades de paradas necessarias: " + z);
		
		scanner.close();
	}

}
