package br.com.flavio.conversor;

import javax.swing.JOptionPane;

public class EscolheTemperatura {

    private final String opcaoSelecionada;

    public EscolheTemperatura() {
        String[] opcoes = {
                "De Celsius °C para Fahrenheit °F",
                "De Fahrenheit °F para Celsius °C",
                "De Celsius °C para Kelvin K",
                "De Kelvin K para Celsius °C"
        };

        opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a temperatura para qual deseja converter:",
                "Temperaturas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}