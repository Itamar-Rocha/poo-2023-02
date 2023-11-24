import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class Principal {
	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("0.00");
        	Calc c = new Calc();
		boolean running = true;

		do {
			try {
				c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número:"));
				if (c.n1 < 0) {
					throw new NumeroNegativo("Número negativo inserido");
				}

				c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo número:"));
				if (c.n2 < 0) {
					throw new NumeroNegativo("Número negativo inserido");
				}

				JOptionPane.showMessageDialog(null, "Soma : " + dc.format(c.somar()));
				JOptionPane.showMessageDialog(null, "Subtração : " + dc.format(c.diminuir()));
				JOptionPane.showMessageDialog(null, "Multiplicação : " + dc.format(c.multiplicar()));
				JOptionPane.showMessageDialog(null, "Divisão : " + dc.format(c.dividir()));

				running = false;

			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Não é possivel dividir por zero", "Erro", JOptionPane.ERROR_MESSAGE);
			} catch (NumeroNegativo e) {
				JOptionPane.showMessageDialog(null, "Não insira números negativos", "Erro", JOptionPane.ERROR_MESSAGE);
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Entrada de dados inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} while(running);
	}

}
