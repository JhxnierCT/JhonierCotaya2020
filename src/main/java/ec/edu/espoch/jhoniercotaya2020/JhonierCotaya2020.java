/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.jhoniercotaya2020;

/**
 *
 * @author SO-LAB-PC5
 */
import java.util.Scanner;

public class JhonierCotaya2020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] ventas;
        ventas = new float[7];

        float totalVentas;
        float promediVentas;
        float sumaTotal;
        int i = 0;
        float dato = 0;

        do {
            System.out.println("Ingrese el monto de ventas de cada uno de los 7 dias");
            ventas[i] = scanner.nextInt();
            if (ventas[i] > 0) {
                ventas[i] = dato;
                i++;
            } else {
                System.out.println("El valor es negativo");
            }

        } while (i < 7);

        int opcion = 0;
        System.out.println("-----Seleccione una opcion:-----");

        System.out.println("1.Calcular el total de ventas de la semana");
        System.out.println("2.Calcular el dia con ventas mas cercanas al promedio");
        System.out.println("3.Mostrar el dia con la venta mas alta y mas baja");
        System.out.println("4.Calcular el monto acumulado de ventas durante los primeros tres dias y los ultimos 3 dias");
        System.out.println("5.Salir");

        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                float suma=0;
                for (int j = 0; j < 7; j++) {
                    suma=ventas[i]+suma;
                }
                    sumaTotal=suma;
                    System.out.println("El total de ventas es:"+sumaTotal);
                    break;
            case 2:
                
                
                
                }
        
               
                }
        }
    


