// EJERCICIO # 1
// Usted ha sido contratado por el colegio de su barrio para hacer una solución que les
//facilitará a los profesores llevar las estadísticas del desempeño de su grupo.
// solución le permitirá conocer al profesor la siguiente información:
//El promedio de las notas.
//La menor nota.
// La mayor nota.
//. Realizar un método en Java (Llamado reporte) que le permita al profesor conocer unas
//estadísticas básicas sobre su grupo, teniendo en cuenta las siguientes
//especificaciones:
//La lista de las notas del grupo se va a representar como un Array de números
//decimales (double), cada elemento del Array es la nota de un estudiante; a
//partir de este Array, usted deberá calcular el promedio de las notas del grupo
//(La suma de todos los elementos del Array dividida por la cantidad de
//elementos), calcular cuál es la nota más baja y alta.

//. Su método recibirá como parámetro un Array de números decimales (double), donde
//cada elemento representa la nota de un estudiante.
//. Su método debe retornar un Array de números decimales (double) de 3 posiciones,
//donde: El algoritmo debe arrojar 1 en todas las posiciones del array
// En la primera posición se guardará ell promedio de las notas.
//En la segunda posición irá la menor nota.
// En la tercera posición irá la mayor nota.

import javax.swing.JOptionPane;

public class EstadisticasColegio {
    public static void main(String[] args) {
        double[] listaNotas = { 4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0, 2.7, 3.5, 4.0, 2.1, 1.9, 4.6, 3.8,
                2.9, 0.5, 1.2, 3.3, 4.9, 2.4, 3.1, 1.0, 4.2, 3.6, 2.8, 0.7, 1.6, 2.0, 3.7, 4.4, 1.3, 0.8, 2.6, 3.9, 4.7,
                1.1, 2.2, 3.4, 4.5, 0.6, 1.7, 2.5, 3.2, 4.3, 1.9, 0.4, 2.8, 3.6, 4.0, 1.4, 0.9, 2.1, 3.8, 4.6, 1.6, 0.3,
                2.9 };
        double[] estadisticas = reporte(listaNotas);

        JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + estadisticas[0]);
        JOptionPane.showMessageDialog(null, "La menor nota es: " + estadisticas[1]);
        JOptionPane.showMessageDialog(null, "La mayor nota es: " + estadisticas[2]);
        JOptionPane.showMessageDialog(null, "La cantidad de numero de lista: " + listaNotas.length);

    }

    public static double[] reporte(double[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("La lista de notas no puede estar vacía.");
        }

        double suma = 0;
        double menor = notas[0];
        double mayor = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota < menor) {
                menor = nota;
            }
            if (nota > mayor) {
                mayor = nota;
            }
        }

        double promedio = suma / notas.length;
        double[] resultado = new double[3];
        resultado[0] = promedio;
        resultado[1] = menor;
        resultado[2] = mayor;

        return resultado;
    }
}