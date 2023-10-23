public class CalculadoraArea {
	public static double calcularAreaTotal(FormaGeometrica[] formasGeometricas) {
		double areaTotal = 0;
		for (int i = 0; i < formasGeometricas.length; i++) {
			areaTotal += formasGeometricas[i].calcularArea();
		}
		return areaTotal;
	}
}
