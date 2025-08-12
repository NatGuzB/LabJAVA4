package EjerciciosLog1;
import java.util.Scanner;

//Ejercicio 2 COMPARAR EDAD

public class CompararEdad {
    public static void main(String[] args) {

        // SOLICITAR EDADES
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa la edad de Pepito: ");
        int edadPepito = scanner.nextInt();
        System.out.print("Por favor, ingresa la edad de Juan: ");
        int edadJuan = scanner.nextInt();

        // COMPARADOR
        boolean esMayor = edadPepito > edadJuan;
        boolean esMenor = edadPepito < edadJuan;
        boolean mismaEdad = edadPepito == edadJuan;


        //Transforma el booleano en texto, ya definido.
        String cadena1 = esMayor ? "Es verdadero" : "Es falso";
        String cadena2 = esMenor ? "Es verdadero" : "Es falso";
        String cadena3 = mismaEdad ? "Es verdadero" : "Es falso";

        System.out.println("¿Pepito es mayor que Juan? " + cadena1);
        System.out.println("¿Pepito es menor que Juan? " + cadena2);
        System.out.println("¿Pepito tiene la misma edad que Juan? " + cadena3);
    }
}
