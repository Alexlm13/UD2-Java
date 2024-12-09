/*Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario
debe introducir la altura de la figura. Usar una función para que la implementación sea más sencilla.
Por ejemplo, se puede crear una función linea(char caracter, int repeticiones)
que pinte una línea con el carácter especificado. */
import java.util.*;


public class Ejercicio3 {
    static void figura(char caracter, int repeticiones){
        for (int i = repeticiones; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(caracter);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int altura=0;
        char caracter;

        System.out.println("Dime con qué caracter te gustaría hacer la figura");
        caracter=entrada.nextLine().charAt(0);

        System.out.println("De cuanta altura te gustaría hacer la figura?");
        altura=entrada.nextInt();

        System.out.println("Su figura");
        figura(caracter, altura);

        entrada.close();
    }
}
