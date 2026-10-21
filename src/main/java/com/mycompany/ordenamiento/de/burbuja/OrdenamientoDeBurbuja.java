/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to type this license
 */

package com.mycompany.ordenamiento.de.burbuja;

/**
 *
 * @author victo
 */
public class OrdenamientoDeBurbuja {

    //Requisito 1: Implementación tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    //Requisito 2: Implementación optimizada
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false; // Se reinicia la bandera en cada pasada
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    
                    huboIntercambio = true; // Se activa si hubo al menos un intercambio
                }
            }

            // Si en una pasada completa no hubo ningún intercambio, interrumpe el ciclo
            if (!huboIntercambio) {
                break;
            }
        }
    }

    //Requisito 3: Clase principal con pruebas de ejecución ---
    public static void main(String[] args) {
        //Prueba 1: Arreglo Desordenado
        int[] arregloDesordenado1 = {5, 1, 4, 2, 8};
        int[] arregloDesordenado2 = {5, 1, 4, 2, 8};

        System.out.println("Prueba 1: El arreglo esta desordenado");
        System.out.print("Estado inicial: ");
        imprimirArreglo(arregloDesordenado1);

        ordenamientoBurbuja(arregloDesordenado1);
        System.out.print("Resultado (Burbuja Tradicional): ");
        imprimirArreglo(arregloDesordenado1);

        ordenamientoBurbujaMejorado(arregloDesordenado2);
        System.out.print("Resultado (Burbuja Mejorado):    ");
        imprimirArreglo(arregloDesordenado2);
        System.out.println();

        //Prueba 2: Arreglo Parcialmente Ordenado
        int[] arregloParcial1 = {1, 2, 4, 3, 5};
        int[] arregloParcial2 = {1, 2, 4, 3, 5};

        System.out.println("Prueba 2: El arreglo esta ordenado");
        System.out.print("Estado inicial: ");
        imprimirArreglo(arregloParcial1);

        ordenamientoBurbuja(arregloParcial1);
        System.out.print("Resultado (Burbuja Tradicional): ");
        imprimirArreglo(arregloParcial1);

        ordenamientoBurbujaMejorado(arregloParcial2);
        System.out.print("Resultado (Burbuja Mejorado):    ");
        imprimirArreglo(arregloParcial2);
    }

    // Método para mostrar los arreglos de forma limpia
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}