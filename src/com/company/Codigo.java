package com.company;


public class Codigo {


    public int[] mergeSort (int [] arreglo){
        int i, j, k;
        if (arreglo.length > 1){
            int izquierda = arreglo.length/2; int derecha = arreglo.length-izquierda;
            int [] arregloizq = new int[izquierda];
            int [] arregloder = new int[derecha];
            for (i = 0; i <izquierda ; i++) {
                arregloizq[i] = arreglo[i];
            }
            for (i = izquierda ; i < izquierda + derecha ; i++) {
                arregloder[i-izquierda] = arreglo[i];
            }
            arregloizq = mergeSort(arregloizq);
            arregloder = mergeSort(arregloder);
            i=0; j=0; k=0;
            while(arregloizq.length != j && arregloder.length != k){
                if (arregloizq[j] < arregloder[k]) {
                    arreglo[i] = arregloizq[j];
                    i++; j++;
                }else {
                    arreglo[i] = arregloder[k];
                    i++; k++;
                }
            }
            while(arregloizq.length != j){
                arreglo[i]=arregloizq[j];
                i++; j++;
            }
            while(arregloder.length != k){
                arreglo[i] = arregloder[k];
                i++;  k++;
            }
        } return arreglo;
    }


    public int[] bubleSort(int [] arreglo){
        int aux;
        boolean cambios = false;

        while (true){
            cambios=false;
            for (int i = 1; i <arreglo.length ; i++) {
                if(arreglo[i]<arreglo[i-1]){
                    aux= arreglo[i];
                    arreglo[i]= arreglo[i-1];
                    arreglo[i-1]=aux;
                    cambios=true;
                }
            }
            if (cambios==false){
                break;
            }
        }
        return arreglo;
    }
}
