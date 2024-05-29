public class ejercicio3 {
    
    public static double calcularPrecioFinal(double precioOriginal) {
        // Verificar si el precio original es igual o superior a 50000
        if (precioOriginal >= 50000) {
            // Aplicar descuento del 10%
            double descuento = precioOriginal * 0.10;
            return precioOriginal - descuento;
        } else {
            // Si el precio original es inferior a 50000, no se aplica descuento
            return precioOriginal;
        }
    }
    
    public static void main(String[] args) {
        double precioOriginal = 60000; // Ejemplo de precio original
        double precioFinal = calcularPrecioFinal(precioOriginal);
        System.out.println("Precio final tras aplicar descuento: " + precioFinal);
    }
}




