package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, d, contador = 0;
        String numeros;
        int[]  numerosInt = new int[1000];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        d = in.nextInt();
        while(n>0){
            numeros = in.next();
            if(numeros.charAt(numeros.length()-1) == (char)d){
                numerosInt[contador] = Integer.parseInt(numeros);
                contador++;
            }
            n--;
        }
        if(contador<4){
            for(int i = contador; i<5; i++){
                System.out.print(-1);
            }
        }
        for (int i = v.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
        for(int i = 0; )
    }
}
