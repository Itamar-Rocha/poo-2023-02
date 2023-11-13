import static java.lang.Math.PI;

public class Circulo extends Figura implements Desenho {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return PI * raio * raio;
	}

	public double calcularPerimetro() {
		return 2 * PI * raio;
	}

	public String desenhar() {
		return "Desenhando a Figura Círculo";
	}
}
