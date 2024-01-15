/*
 * Practica de inventario
 */

package arrays.inventario;

import java.util.ArrayList;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Ismael_Ast
 */
public class Inventario {

    public static void main(String[] args) {
        
        //Vamos añadiendo lo primero de todo las arraylist 
        ArrayList<String> nombres = new ArrayList<>(); //En esta arraylist vamos añadir el nombre con la variable string
        ArrayList<Double> precios = new ArrayList<>(); //En este arraylist de precios vamos añadir la variable double 
        ArrayList<Integer> cantidades = new ArrayList<>(); //Y por ultimo en la arraylist de cantidades para almacenarlas en stock

        Scanner sc = new Scanner(System.in); //Añadimos el scanner para que el usuario pueda escribir lo que le pedimos
        
        sc.useLocale(US);

        while (true) {
            //Hacemos el menu para que el usuario vea que opciones quiere elegir
            System.out.println("\nElige una de estas opciones: ");
            System.out.println("Opcion 1. Agregar producto");
            System.out.println("Opcion 2. Actualizar inventario");
            System.out.println("Opcion 3. Buscar producto");
            System.out.println("Opcion 4. Mostrar inventario");
            System.out.println("Opcion 5. Salir");
            System.out.print("Escribe cualquier opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); //Este codigo hace un salto de linea

            switch (opcion) {
                case 1: //Esta es la opcion de agregar productos
                    
                    //Vamos a ir preguntando al usuario que nombre, precio y cantidad de producto quiere
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese el precio del producto: ");
                    double precio = sc.nextDouble();

                    System.out.print("Ingrese la cantidad en stock del producto: ");
                    int cantidad = sc.nextInt();

                    nombres.add(nombre);
                    precios.add(precio);
                    cantidades.add(cantidad);

                    System.out.println("Producto agregado al inventario.");
                    break;

                case 2: //Esta es la opcion 2 de de actualizar los productos
                    System.out.print("\nIngrese el nombre del producto a actualizar: ");
                    String nombreActualizar = sc.nextLine();

                    for (int i = 0; i < nombres.size(); i++) {
                        if (nombres.get(i).equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Escriba aquí el nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            nombres.set(i, nuevoNombre);
                            
                            System.out.print("Escriba aqui el precio del producto: ");
                            Double nuevoPrecios = sc.nextDouble();
                            precios.set(i, nuevoPrecios);

                            System.out.print("Escriba la nueva cantidad en stock: ");
                            int nuevaCantidad = sc.nextInt();
                            cantidades.set(i, nuevaCantidad);

                            System.out.println("Inventario actualizado.");
                            break;
                        }
                    }
                    break;

                case 3: //Esta es la opcion 3 para bucar los productos
                    System.out.print("\nEscriba el nombre del producto a buscar: ");
                    String nombreBuscar = sc.nextLine();

                    for (int i = 0; i < nombres.size(); i++) {
                        if (nombres.get(i).equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Nombre: " + nombres.get(i));
                            System.out.println("Precio: " + precios.get(i));
                            System.out.println("Cantidad en stock: " + cantidades.get(i));
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nEste es el inventario que tienes: ");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println("Nombre: " + nombres.get(i));
                        System.out.println("Precio: " + precios.get(i));
                        System.out.println("Cantidad en stock: " + cantidades.get(i));
                    }
                    break;

                case 5:
                    System.out.println("\n¡Que tengas un buen dia!");
                    System.exit(0);

                default:
                    System.out.println("Esta opcion no existe, por favor vuelva a escribir");
            }
        }
    }
}

