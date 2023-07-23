package br.com.flavio.conversor;
import javax.swing.JOptionPane;

public class EscolheDistancias {

	private final String opcaoSelecionada;
	
	public EscolheDistancias() {
		String[] opcoes = { 
				"Metros para Quilômetros", 
				"Metros para Centímetros", 
				"Metros para Milímetros",
				"Quilômetros para Metros", 
				"Centímetros para Metros", 
				"Milímetros para Metros"
		};
		
		opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a distância para qual deseja converter:", 
				"Distâncias", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);		
	}
	
	public String getOpcaoSelecionada() { 
		return opcaoSelecionada; 
		}	
}
