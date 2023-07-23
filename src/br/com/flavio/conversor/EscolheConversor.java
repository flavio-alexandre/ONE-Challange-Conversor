package br.com.flavio.conversor;
import javax.swing.JOptionPane;

public class EscolheConversor {

	private final String[] opcoes = {"Conversor de Moedas", "Conversor de Temperaturas", "Conversor de Distâncias"};
	
	private final int opcaoSelecionada;
	
	public EscolheConversor() {
		
		opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione o Conversor:", "Conversores", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);		
	}

	public String getOpcaoSelecionada() {
		return this.opcoes[this.opcaoSelecionada];
	}
}