package br.com.flavio.conversor;

import javax.swing.JOptionPane;

public class ConverteDistancias extends Conversor {

    public ConverteDistancias(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido é igual a %.2f %s", super.valorConvertido, super.simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {
        switch (op) {
            case "Metros para Quilômetros" -> {
                super.simboloConversao = "km";
                super.valorConvertido = (valor / 1000);
                break;
            }
            case "Metros para Centímetros" -> {
                super.simboloConversao = "cm";
                super.valorConvertido = valor * 100;
                break;
            }
            case "Metros para Milímetros" -> {
                super.simboloConversao = "mm";
                super.valorConvertido = valor * 1000;
                break;
            }
            case "Quilômetros para Metros" -> {
                super.simboloConversao = "m";
                super.valorConvertido = valor * 1000;
                break;
            }
            case "Centímetros para Metros" -> {
                super.simboloConversao = "m";
                super.valorConvertido = valor / 100;
                break;
            }
            case "Milímetros para Metros" -> {
                super.simboloConversao = "m";
                super.valorConvertido = valor / 1000;
                break;
            }
        }
    }
}