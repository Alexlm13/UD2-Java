import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
            String cadena="",subcadena="",cadena_prueba="";
            boolean es=false;


           System.out.println("Introduzca una cadena");
            cadena=entrada.nextLine();
            System.out.println("Introduzca una subcadena");
            subcadena=entrada.nextLine();
           
            boolean contenedor=false;

            contenedor=cadena.contains(subcadena);
            if (contenedor==true){
                System.out.println("SI ES");

            }else{
                System.out.println("no es");
            }
         entrada.close();

    }
    
}
