import java.util.*;
public class Reto5 {
    /*CREAR UNA CLASE */
    public static void  main(String[] args) {
        /*DECLARAR VARIABLES */

        String nombreEmpleado,nombreProducto,nombreCliente;
        int cantidadProducto,total,precioProducto;

        /*INSTANCIAR CLASES */
            Scanner Lectura=new Scanner(System.in);

        /*SOLICITAR LOS DATOS QUE DESEA MOSTRAR POR PANTALLA*/

        System.out.println("Ingrese por favor el nombre del Empleado ");
        nombreEmpleado=Lectura.next();

        /*REALIZAR EL DEVIDO PROCESO PARA QUE SE EJECUTE DE MANERA CORRECTA */

        if(nombreEmpleado.equals("Alejandra")){

            System.out.println("Ingrese por favor el nombre del Cliente: ");
            nombreCliente=Lectura.next();

            System.out.println("Ingrese por favor el nombre del Producto: ");
            nombreProducto=Lectura.next();

            System.out.println("Ingrese por favor la Cantidad de Productos: ");
            cantidadProducto=Lectura.nextInt();

            System.out.println("Ingrese por favor el Precio del Producto: ");
            precioProducto=Lectura.nextInt();

            total=(cantidadProducto*precioProducto);

            System.out.println("El nombre del Empleado es:"  +nombreEmpleado+ "El nombre del Cliente: "  +nombreCliente+
            "El nombre del Producto es: " +nombreProducto+  "     La cantidad de sus compra es: " +cantidadProducto+
            "El TOTAL de sus compra es:"  +total);
            
        }
        else{
        System.out.println("POR FAVOR USTED NO SE ENCUENTRA REGISTRADO, ¡POR FAVOR REGÍSTRESE!");
        nombreEmpleado=Lectura.next();
        /*LIMPIAR  CERRAR EL BUFFER */
        Lectura.close();
            }
            }
        }