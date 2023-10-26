public class Quadrado extends Figura implements Desenho {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lada;
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
