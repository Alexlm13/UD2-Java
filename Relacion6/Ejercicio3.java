import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String cadena;
        char caracter;
        int contador=0;

        System.out.println("Dame una cadena");
        cadena=entrada.nextLine();

        System.out.println("Dame un caracter");
        caracter=entrada.nextLine().charAt(0);

        for (int i=0; i < cadena.length(); i++){

            if (caracter==cadena.charAt(i)){
                contador++;
            }
            
        }
        
        System.out.println("Tu cadena tiene "+ contador +" "+ caracter);

        entrada.close();
    }
}

