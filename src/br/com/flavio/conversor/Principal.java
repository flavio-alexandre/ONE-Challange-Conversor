package br.com.flavio.conversor;


import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        do {
            try {
                EscolheConversor escolheConversor = new EscolheConversor();
                EscolheValor escolheValor = new EscolheValor();

                double valorSelecionado = escolheValor.getValor();

                String opcaoSelecionada = escolheConversor.getOpcaoSelecionada();

                if ("Conversor de Moedas".equals(opcaoSelecionada)) {
                    EscolheMoedas escolheMoedas = new EscolheMoedas();
                    new ConverteMoedas(valorSelecionado, escolheMoedas.getOpcaoSelecionada());
                } else if ("Conversor de Temperaturas".equals(opcaoSelecionada)) {
                    EscolheTemperatura escolheTemperaturas = new EscolheTemperatura();
                    new ConverteTemperaturas(valorSelecionado, escolheTemperaturas.getOpcaoSelecionada());
                } else {
                    EscolheDistancias escolheDistancias = new EscolheDistancias();
                    new ConverteDistancias(valorSelecionado, escolheDistancias.getOpcaoSelecionada());
                }

            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new TelaDeErro("O valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new TelaDeErro("Erro! Digite um valor válido!");
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != JOptionPane.NO_OPTION);

        JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");
        System.exit(0);
    }
}

