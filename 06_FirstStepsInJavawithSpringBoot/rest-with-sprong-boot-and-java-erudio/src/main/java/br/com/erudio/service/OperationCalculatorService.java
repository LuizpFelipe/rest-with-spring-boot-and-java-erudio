package br.com.erudio.service;

public class OperationCalculatorService{

	
	public static Double adicao(String number, String number2) {
		return ConvertionService.convertToDouble(number) + ConvertionService.convertToDouble(number2);
	}
	
	public static Double multiplicacao(String number, String number2) {
		return ConvertionService.convertToDouble(number) * ConvertionService.convertToDouble(number2);
	}
	
	public static Double subtracao(String number, String number2) {
		return ConvertionService.convertToDouble(number) - ConvertionService.convertToDouble(number2);
	}
	
	public static Double divisao(String number, String number2) {
		return ConvertionService.convertToDouble(number) / ConvertionService.convertToDouble(number2);
	}
	
	public static Double media(String number, String number2) {
		return (ConvertionService.convertToDouble(number) + ConvertionService.convertToDouble(number2)) / 2;
	}
	
	public static Double raizQuadrada(String number) {
		return Math.sqrt(ConvertionService.convertToDouble(number));
	}
}
