import java.util.*;

public class Reto1 {

    public static void main(String[]args) {

        /* Programa que convierta grados Centigrados a grados kelvin, la torta será para 10 personas
         * y cada persona su porción es de 13kg, calcular la cantidad de harina utilizada
         * y su formula es:  K = ºC + 273.15*/

        double gradosC, gradosK;
        int  personas,gramos=13,resultado;


        Scanner Lectura = new Scanner(System.in);

        System.out.println("INGRESE CUÁNTOS DESEAN COMER TORTA DE VAINILLA:");
        personas=Lectura.nextInt();

        resultado=(personas*gramos);

    System.out.println("La suma de sus porciones es de: " +resultado+"kg");


        System.out.println("Ingrese el valor de grados centigrados a convertir");
        gradosC=Lectura.nextDouble();

        gradosK=(gradosC+27315);

        
        System.out.println("LA CANTIDAD DE HARINA UTILIZADA ES DE:" +gradosK);
        System.out.println("GRADOS CENTIGRADOS EQUIVALEN A: " +gradosC+  " A GRADOS KELVIN: " +gradosK);

        Lectura.close();
        
    }
}



