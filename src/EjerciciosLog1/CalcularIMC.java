package EjerciciosLog1;
import java.util.Scanner;

// EJERCICIO 1: Calculadora de IMC

public class CalcularIMC {

    public static void main(String[] args) {
    // Peso y altura
    Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, ingresa tu peso en kilogramos: ");
    double peso = scanner.nextDouble();

    System.out.print("Por favor, ingresa tu altura en metros: ");
    double altura = scanner.nextDouble();

    //CALCULA IMC
    double imc = peso / (altura * altura);

    int imcEnt = (int) imc;

    System.out.println("Tu IMC es: " + imc);
    System.out.println("Tu IMC (parte entera) es: " + imcEnt);
    }
}
