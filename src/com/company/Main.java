package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Codigo ordenar = new Codigo();
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el tamaño de el arreglo ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i <n ; i++) {
            arreglo[i] = (int) (Math.random()*n)+1;
        }


        long comienzomerge = System.nanoTime();
        ordenar.mergeSort(arreglo);
        long finalmerge = System.nanoTime();
        long totalmerge = finalmerge-comienzomerge;
        System.out.println("\nEl tiempo de proceso de el Bubble Sort en nano segundo es: " + totalmerge );


        long comienzobuble = System.nanoTime();
        ordenar.bubleSort(arreglo);
        long finalbuble = System.nanoTime();
        long totalbuble = finalbuble-comienzobuble;
        System.out.println("\nEl tiempo de proceso de el Merge Sort en nano segundo es: " + totalbuble);



    }

}
