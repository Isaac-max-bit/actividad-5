public class ejercicio4 {

    public static double calcularArea(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo, double radioCirculo) {
        double area = 0.0;

        if (tipoFigura == 1) {
            // Calcular área de un cuadrado
            area = ladoCuadrado * ladoCuadrado;
        } else if (tipoFigura == 2) {
            // Calcular área de un triángulo
            area = (baseTriangulo * alturaTriangulo) / 2;
        } else if (tipoFigura == 3) {
            // Calcular área de un círculo
            area = Math.PI * radioCirculo * radioCirculo;
        } else {
            // Tipo de figura no válido
            System.out.println("Tipo de figura no válido.");
        }

        return area;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double areaCuadrado = calcularArea(1, 10, 0, 0, 0);
        System.out.println("Área del cuadrado: " + areaCuadrado);

        double areaTriangulo = calcularArea(2, 0, 3, 8, 0);
        System.out.println("Área del triángulo: " + areaTriangulo);

        double areaCirculo = calcularArea(3, 0, 0, 0, 12);
        System.out.println("Área del círculo: " + areaCirculo);

        calcularArea(4, 0, 0, 0, 0); // Tipo de figura no válido
    }
}
