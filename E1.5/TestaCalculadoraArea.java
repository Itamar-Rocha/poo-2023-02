public class TestaCalculadoraArea {
	public static void main(String[] args) {
		FormaGeometrica[] formasGeometricas = new FormaGeometrica[3];
		formasGeometricas[0] = new Circulo(2.7);
		formasGeometricas[1] = new Retangulo(4.9, 2.3);
		formasGeometricas[2] = new Triangulo(3.1, 6.9);

		System.out.println("Área círculo: " + formasGeometricas[0].calcularArea());
		System.out.println("Área retângulo: " + formasGeometricas[1].calcularArea());
		System.out.println("Área triângulo: " + formasGeometricas[2].calcularArea());
		System.out.println("Área total: " + CalculadoraArea.calcularAreaTotal(formasGeometricas));
	}
}
