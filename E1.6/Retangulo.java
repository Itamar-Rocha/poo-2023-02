public class Retangulo extends Quadrado implements Desenho {
	private double altura;

	public Retangulo(double lado, double altura) {
		super(lado);
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return lado * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * lado) + (2 * altura);
	}

	@Override
	public String desenhar() {
		return "Desenhando a Figura Retângulo";
	}
}
