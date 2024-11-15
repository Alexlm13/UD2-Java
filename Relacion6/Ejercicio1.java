import java.util.Scanner;

/**
 * Ejercicio6
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String frase;
        char caracter;

        System.out.println("Introduzca una frase: ");
        Scanner entrada= new Scanner(System.in);
        frase=entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            caracter=frase.charAt(i);

            System.out.println(caracter);
        }
        entrada.close();
    }
}