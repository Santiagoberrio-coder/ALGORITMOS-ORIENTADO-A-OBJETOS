// Usted forma parte del comité de premiación de una carrera atlética realizada enbeneficio de un refugio de animales. Se requiere identificar los competidores quelograron terminar la carrera en primer y último lugar, así como la cantidad de personasque participaron de ella; entonces, usted decide implementar una solución que lespermitirá conocer:• La cantidad de participantes en la carrera • El menor tiempo para terminar la carrera.• El mayor tiempo para terminar la carrera.b. Realizar un método en Java (Llamado reporte) que le permita al comité de premiación conocer datos básicos sobre la carrera, teniendo en cuenta las siguientesespecificaciones:• Los resultados de todos los competidores de la carrera se van a representarcomo un Array de números enteros, cada elemento del Array es el tiempo quele tomó a un competidor terminar la carrera; y a partir del Array, usted deberádeterminar cuántas personas participaron en la carrera, el tiempo tomado porel competidor que terminó primero y el tiempo tomado por el competidor queterminó de último.Ejemplo de cómo se ve una lista de resultados:En este caso, el elemento que hay en la posición 0 (18) es el tiempo que le tomóa un competidor terminar la carrera, el elemento que hay en la posición 1 (29)es el tiempo que le tomó a otro competidor terminar la carrera y asísucesivamente.c. Su método recibirá como parámetro un Array de números enteros, donde cadaelemento representa el tiempo que le toma a un competidor terminar la carrerad. Su método debe retornar un Array de números enteros de 3 posiciones, donde:El algoritmo debe arrojar 1 en todas las posiciones del array• En la primera posición se guardará la cantidad de competidores queparticiparon en la carrera.• En la segunda posición irá el tiempo que le tomó la carrera al competidor queconcluyó en el primer puesto.• En la tercera posición irá el tiempo que le tomó la carrera al competidor queconcluyó en el último puesto

import javax.swing.JOptionPane;

public class EstadisticasCompetidores {
    public static void main(String[] args) {

        int[] resultados = { 18, 29, 22, 25, 16, 26, 21, 23, 20, 27, 24, 19, 28, 17, 30, 22, 25, 21, 18, 26, 23, 20, 29,
                17, 27, 24, 19, 28, 22, 25, 21, 17, 18, 26, 23, 20, 29, 24, 19, 27, 22, 25, 18, 28, 21, 17, 23, 20, 26,
                24, 19, 27, 22, 25, 17, 28, 21, 18, 29, 23, 20, 26, 24, 19, 22, 25, 17, 27, 21, 18, 29, 23, 20, 26, 24,
                19, 28, 22, 25, 17, 21, 18, 27, 23, 20, 29, 24, 19, 26, 22, 25, 17, 28, 21, 18, 23, 20, 27, 24, 19, 29,
                22, 25, 17, 28, 21 };

        int[] estadisticas = reporte(resultados);

        JOptionPane.showMessageDialog(null, "Cantidad de participantes: " + estadisticas[0] + "\n" +
                "Menor tiempo: " + estadisticas[1] + "\n" +
                "Mayor tiempo: " + estadisticas[2]);

    }

    public static int[] reporte(int[] resultados) {
        if (resultados == null || resultados.length == 0) {
            JOptionPane.showMessageDialog(null, "numero no valido");
            return new int[3];
        }
        int suma = 0;
        int cantidadParticipantes = resultados.length;
        int menorTiempo = resultados[0];
        int mayorTiempo = resultados[0];

        for (int resultado : resultados) {
            suma += resultado;
            if (menorTiempo > resultado) {
                menorTiempo = resultado;
            }
            if (mayorTiempo < resultado) {
                mayorTiempo = resultado;
            }
        }
        cantidadParticipantes = resultados.length;
        int[] muestra = new int[3];
        muestra[0] = cantidadParticipantes;
        muestra[1] = menorTiempo;
        muestra[2] = mayorTiempo;

        return muestra;
    }
}