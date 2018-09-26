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
        for
    }
}
