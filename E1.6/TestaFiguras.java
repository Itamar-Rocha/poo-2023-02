public class TestaFiguras {
	public static void main(String[] args) {
		Figura[] figuras = new Figura[4];
		figuras[0] = new Circulo(2.5);
		figuras[1] = new Quadrado(3.4);
		figuras[2] = new Retangulo(1.2, 2.0);
		figuras[3] = new Triangulo(1.0, 2.3, 1.7, 2.9);

		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].calcularArea());
			System.out.println(figuras[i].calcularPerimetro());
		}
	}
}
