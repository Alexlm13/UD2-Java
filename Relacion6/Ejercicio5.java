import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String nombre;
        String inicial="";

        System.out.println("Introduce tu nombre y apellidos");
        nombre=entrada.nextLine();
        inicial+=nombre.charAt(0);

        for (int i = 0; i < nombre.length(); i++) {
            if(nombre.charAt(i)==' '){
                inicial+=nombre.charAt(i+1);
            }
            
        }
        System.out.println("Sus iniciales son: "+inicial.toUpperCase());
        entrada.close();
    }
}
