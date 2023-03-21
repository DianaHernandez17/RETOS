import java.util.*;
public class Reto2 {
    /*CREAMOS UNA CLASE LLAMADA RETOS2 */
    public static void main(String[]args) {

        /*EJECUTARÁ EL PROGRAMA CORRECTAMENTE */

        /* Programa que solicite el nombre de: Médico, Mamá, Bebe, calcular la dosis y mostrarla y
         * al peso del bebe sumarle 15 luego mostar por pantalla lo solicitado.*/

         /*DECLARAMOS VARIABLES */

        int pesoBebe;
        int mesesBebe;
        int anoActual;
        int anoNacimiento;
        int a=8;
        int dosis;
        
        /*Creamos e importamos una clase objecto en este caso es Lectura */

        Scanner Lectura = new Scanner(System.in);

        /*SOLICITAMOS DATOS */

        System.out.println("Ingrese el nombre del médico");
        Lectura.next();

        System.out.println("Ingrese el nombre de la Mamá");
        Lectura.next();

        System.out.println("Ingrese el nombre del Bebé");
        Lectura.next();

        System.out.println("Ingrese el Peso del Bebé");
        pesoBebe=Lectura.nextInt();

        System.out.println("Ingrese el año del nacimiento del Bebé:");
        anoNacimiento=Lectura.nextInt();

        System.out.println("Ingrese el año en que está:");
        anoActual=Lectura.nextInt();

        /*REALIZAMOS LOS DEBIDOS PROCESOS */

        mesesBebe=anoActual-anoNacimiento;
        System.out.println("El bebé tiene:  "  +mesesBebe+  "meses");


        dosis= pesoBebe+15/mesesBebe+10*a;
        System.out.println("La dosis aplicar es de: "  +dosis);

        /*CERRAMOS EL BUFFER */

        Lectura.close();
    }

}