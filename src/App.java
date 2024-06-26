//Darien José Mayorga Moreno
//2024-1356U

import java.util.Scanner;


public class App {


    //variables globales
    public static int tamaño = 0;
    public static Scanner leer = new Scanner(System.in);
    public static boolean condicion = true;


    public static void main(String[] args) throws Exception {

        boolean condicion = true;
        //Trycatch para asegurarnos que se ingresen los datos correctos
        do {
            try {
                System.out.println("Ingrese el tamaño del arreglo, no puede ser mayor que 16 y mayor que 1");
                tamaño = leer.nextInt();
                if (tamaño>=2 && tamaño<=16) {
                    condicion = false;
                    
                }
                
            } catch (Exception e) {
              System.out.println(e);
              System.out.println("Respete los paarametros mencionados");
              leer.nextLine();
            }

        } while (condicion);
     
        //recibimos el arreglo 
        int array[] = llenado();

        //lo mostramos
        System.out.println("Su arreglo es: ");
        mostrar(array);

        //mostrar el arreglo en orden inverso
        System.out.println("este es el orden inverso");
        inverso(array);

    }
    //metodo para llenar el arreglo
    
    public static int [] llenado(){
        int [] arreglo = new int [tamaño];
        do {
            try {
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("ingrese el valor [" + (i+1) + "]");
                    arreglo[i] = leer.nextInt();
                  
                }
                condicion=false;
            } catch (Exception e) {
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }
        } while (condicion);
        
        return arreglo;
    }
    //metodo para mostrarlo
    public static void mostrar(int[] a){
        for (int i : a) {
            System.out.print(i+ ", ");
        }
        System.out.println(" ");
    }
    //metodo para mostrar el arreglo inverso
    public static void inverso (int[]arregloinverso){

            for (int i = arregloinverso.length - 1; i >= 0; i--) {
                System.out.print(arregloinverso[i] + ", ");
        }
        System.out.println(" ");
    }


}
