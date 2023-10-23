import static java.lang.Math.PI;

public class Circulo extends FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return PI * raio * raio;
	}
}
