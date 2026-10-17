// Usted ha sido contratado por la tienda de su barrio para hacer una solución que lefacilitará llevar al tendero estadísticas de una compra realizada por un cliente.Su solución le permitirá conocer al tendero la siguiente información:• El costo total de la compra.• El costo del producto más barato.• El costo del producto más caro.b. Realizar un método en Java (Llamado reporte) que le permita al tendero conocer unasestadísticas básicas sobre una compra, teniendo en cuenta las siguientesespecificaciones:• Una compra se va a representar como un Array de números enteros, cadaelemento del Array es el precio de un producto; a partir de este, usted deberácalcular el costo total de la compra (La suma de todos los elementos del Array),calcular cuál es el precio más bajo (Precio del producto más barato) y cuál es el precio más alto (Precio del producto más caro).Ejemplo de cómo se ve una compra:En este caso, el elemento que hay en la posición 0 (2700) es el costo de un producto que lleva el cliente y cuesta $2700, el elemento que hay en la posición1 (9500) es el costo de otro producto que lleva el cliente y cuesta $9500, y así sucesivamente.Su método recibirá como parámetro un Array de números enteros, donde cada elemento representa el valor de un producto.d. Su método debe retornar un Array de números enteros de 3 posiciones, donde:El algoritmo debe arrojar 1 en todas las posiciones del array En la primera posición se guardará el costo total de la compra En la segunda posición irá el valor del producto más barato. En la tercera posición irá el valor del producto más caro.

import javax.swing.JOptionPane;

public class EstadisticasCompra {
    public static void main(String[] args) {
        int[] compra1 = { 2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400, 7500, 2200, 8900, 1200, 5600, 9800, 4300,
                1500, 6700, 2100, 13400, 3200, 4800, 9200, 16000, 700, 2600, 8100, 5400, 3900, 11000, 600, 1700, 14500,
                8800, 2300, 5100, 9400, 12000, 2900, 3600, 2000, 7800, 4100, 6500, 10200, 500, 1400, 8700, 15600, 3300,
                2700, 9600, 1800, 4200, 6900, 11800, 2400, 5300, 9100, 1000, 3400, 7600, 1300, 8400, 14700, 2800, 4600,
                9900, 6100, 17000, 900, 1900, 5700, 8200, 2500, 13500, 4400, 6800, 10500, 3100, 3800, 7200, 1600, 8600,
                12500, 2100, 4900, 9300, 5900, 11500 };

        int[] estadisticas = reporte(compra1);

        JOptionPane.showMessageDialog(null, "El costo total de la compra es: " + estadisticas[0]);
        JOptionPane.showMessageDialog(null, "El costo del producto más barato es: " + estadisticas[1]);
        JOptionPane.showMessageDialog(null, "El costo del producto más caro es: " + estadisticas[2]);
        JOptionPane.showMessageDialog(null, "La cantidad de productos comprados es: " + compra1.length);
    }

    public static int[] reporte(int[] compra) {
        if (compra == null || compra.length == 0) {
            throw new IllegalArgumentException("La lista de productos no puede estar vacía.");
        }
        int suma = 0;
        int total = compra[0];
        int menor = compra[0];
        int mayor = compra[0];

        for (int compras : compra) {
            suma += compras;
            if (compras < menor) {
                menor = compras;
            }
            if (compras > mayor) {
                mayor = compras;
            }
        }
        total = suma;
        int[] resultado = new int[3];
        resultado[0] = total;
        resultado[1] = menor;
        resultado[2] = mayor;

        return resultado;

    }
}