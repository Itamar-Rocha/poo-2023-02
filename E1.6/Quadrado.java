public class Quadrado extends Figura implements Desenho {
	protected double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return lado * 4;
	}

	public String desenhar() {
		return "Desenhando a Figura Quadrado";
	}
}
