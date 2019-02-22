package entidades;

public class comverteDolaresParaReis {
	public static double valorDolar;
	public static double quantidadeDeDolares;
	public static double quantidadeDeReais;
	
	
	
	public static double calculaValor() {
		quantidadeDeReais = quantidadeDeDolares * valorDolar;
		return  quantidadeDeReais + calculaIOF() ;
		
	}
	
	public static double calculaIOF() {
		return quantidadeDeReais * 0.06;
	}
	
}
