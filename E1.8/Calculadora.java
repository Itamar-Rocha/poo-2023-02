import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

	private JPanel painelDeEntrada;
	private JTextField primeiraEntrada;
	private JTextField segundaEntrada;
	private JTextField resultado;

	private JPanel painelBotoes;

	public Calculadora() {
		this.configurarJFrame();
		this.criarPainelDeEntrada();
		this.criarPainelBotoes();
	}

	private void configurarJFrame() {
		this.setTitle("Calculadora");
		this.setSize(new Dimension(300, 450));
		this.setLayout(new BorderLayout()); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void criarPainelDeEntrada() {
		this.painelDeEntrada = new JPanel(new GridLayout(3, 2));

		this.painelDeEntrada.add(new JLabel("Número 1:"));
		this.primeiraEntrada = new JTextField();
		this.painelDeEntrada.add(this.primeiraEntrada);

		this.painelDeEntrada.add(new JLabel("Número 2:"));
		this.segundaEntrada = new JTextField();
		this.painelDeEntrada.add(this.segundaEntrada);

		this.painelDeEntrada.add(new JLabel("Resultado:"));
		this.resultado = new JTextField();
		this.resultado.setEditable(false);
		this.painelDeEntrada.add(this.resultado);

		this.add(this.painelDeEntrada, BorderLayout.CENTER);
	}

	private void criarPainelBotoes() {
		this.painelBotoes = new JPanel(new GridLayout(2, 2));
		this.criarBotao('+', this.painelBotoes);
		this.criarBotao('-', this.painelBotoes);
		this.criarBotao('*', this.painelBotoes);
		this.criarBotao('/', this.painelBotoes);

		this.add(this.painelBotoes, BorderLayout.SOUTH);
	}
	
	private void criarBotao(char operacao, JPanel painel) {
		JButton botao = new JButton(Character.toString(operacao));
		botao.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
			realizarOperacao(operacao);
		    }
		});

		painel.add(botao);
	}

	private void realizarOperacao(char operacao) {
		try {
			double n1 = Double.parseDouble(this.primeiraEntrada.getText());
			double n2 = Double.parseDouble(this.segundaEntrada.getText());
			double resultado = 0;

			switch (operacao) {
				case '+':
					resultado = n1 + n2;
					break;
				case '-':
					resultado = n1 - n2;
					break;
				case '*':
					resultado = n1 * n2;
					break;
				case '/':
					if (n2 != 0) {
						resultado = n1 / n2;
					} else {
						JOptionPane.showMessageDialog(this, "Não é possível dividir por zero.", "Erro", JOptionPane.ERROR_MESSAGE);
						return;
					}
					break;
			}

			this.resultado.setText(String.valueOf(resultado));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Digite números válidos nos campos.", "Erro", JOptionPane.ERROR_MESSAGE);
		} catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(this, "Erro na operação.", "Erro", JOptionPane.ERROR_MESSAGE);
        	}
	}
}
