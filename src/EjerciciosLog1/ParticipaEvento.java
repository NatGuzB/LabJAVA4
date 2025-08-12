package EjerciciosLog1;
import java.util.Scanner;

//EJERCICIO 3: Participa en el evento.

public class ParticipaEvento {
    public static void main(String[] args) {
        // Primera persona
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa la edad de la primera persona: ");
        int edadPersona1 = scanner.nextInt();

        // Segunda persona
        System.out.print("Por favor, ingresa la edad de la segunda persona: ");
        int edadPersona2 = scanner.nextInt();

        //Condiciones
        boolean ambasMayores18 = edadPersona1 > 18 && edadPersona2 > 18;
        boolean ambasMenores30 = edadPersona1 < 30 && edadPersona2 < 30;
        boolean algunaMayor50 = edadPersona1 > 50 || edadPersona2 > 50;

        //Transforma el booleano en texto, ya definido.
        String cadena1 = ambasMayores18 ? "Es verdadero" : "Es falso";
        String cadena2 = ambasMenores30 ? "Es verdadero" : "Es falso";
        String cadena3 = algunaMayor50 ? "Es verdadero" : "Es falso";

        System.out.println("¿Ambas personas son mayores de 18 años? " + cadena1);
        System.out.println("¿Ambas personas son menores de 30 años? " + cadena2);
        System.out.println("¿Alguna de las personas es mayor de 50 años? " + cadena3);
    }
}
