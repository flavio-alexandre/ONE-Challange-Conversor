package br.com.flavio.conversor;
import javax.swing.JOptionPane;

public class ConverteMoedas extends Conversor{
	
	public ConverteMoedas(double valor, String op) {
		converter(valor, op);
		
		String msg = String.format("O valor convertido é de %s %.2f", super.simboloConversao,super.valorConvertido);
		JOptionPane.showMessageDialog(null, msg);
	
	}

	@Override
	public void converter(double valor, String op) {
		
		//Cotação do dia 20/07/2023
		
		switch (op) {
			case "De BRL/Reais para USD/Dólar dos Estados Unidos" -> {
				super.simboloConversao = "U$";
				super.valorConvertido = valor / 4.80;
				break;
			}
			case "De BRL/Reais para EUR/Euros" -> {
				super.simboloConversao = "€";
				super.valorConvertido = valor / 5.35;
				break;
			}
			case "De BRL/Reais para GBP/Libras Esterlinas" -> {
				super.simboloConversao = "£";
				super.valorConvertido = valor / 6.17;
				break;
			}
			case "De BRL/Reais para ARS/Peso Argentino" -> {
				super.simboloConversao = "$";
				super.valorConvertido = valor / 0.018;
				break;
			}
			case "De BRL/Reais para CLP/Peso Chileno" -> {
				super.simboloConversao = "CLP";
				super.valorConvertido = valor / 0.0059;
				break;
			}
			case "De USD/Dólar dos Estados Unidos para BRL/Reais" -> {
				super.simboloConversao = "R$";
				super.valorConvertido = valor * 4.80;
				break;
			}
			case "De EUR/Euros para BRL/Reais" -> {
				super.simboloConversao = "R$";
				super.valorConvertido = valor * 5.35;
				break;
			}
			case "De GBP/Libras Esterlinas para BRL/Reais" -> {
				super.simboloConversao = "R$";
				super.valorConvertido = valor * 6.17;
				break;
			}
			case "De ARS/Peso Argentino para BRL/Reais" -> {
				super.simboloConversao = "R$";
				super.valorConvertido = valor * 0.018;
				break;
			}
			case "De CLP/Peso Chileno para BRL/Reais" -> {
				super.simboloConversao = "R$";
				super.valorConvertido = valor * 0.0059;
				
			}
		}
	}
}
