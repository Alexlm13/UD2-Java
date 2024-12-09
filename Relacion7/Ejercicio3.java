//Crea un programa que reciba un Array de Strings y un char. Deberá mostrar todos los Strings cuya
//primera letra coincida con el char

package Relacion7;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String [] cadena={"Esto", "Es", "Una", "Cadena", "No", "Muy", "Larga"};

        System.out.println("Introduzca un carácter en mayúscula:");
        char caracter=entrada.nextLine().charAt(0);

        for (String palabraChar:cadena) {

            if (palabraChar.charAt(0)==caracter) {
                System.out.println("Las palabras que empiezan por "+caracter+" es/son: "+palabraChar);
            }
        }
        System.out.println("Tu carácter no coincide con ninguna palabra.");
    entrada.close();
    }
}
