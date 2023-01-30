package org.losremedios.prog.ut4.actividades.act2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [][][] a = new int [10][10][3];
        int num=2;

        for (int i=1;i<=10;i++){

            a [i-1] = metodoMultiplicacion(i);
        }

        imprimeTabla(a);


    }

    public static int[][] metodoMultiplicacion(int num){

        int[][] multiplica = new int[10][3];

        for(int i =0;i< multiplica.length;i++){
            multiplica[i][0] = num;
            multiplica[i][1] = i+1;
            multiplica[i][2] = num*multiplica[i][1];
        }

        return multiplica;
    }

    public static void crearTab (int [][] tabla){

        for (int i=0;i< tabla.length;i++){
            for (int j =0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]);
            }

            System.out.println();
        }
    }

    public static void imprimeTabla (int[][][] t){
        for (int i=0;i<t.length;i++){
            System.out.println("Tabla del " + (i+1));
            for (int j=0;j<t[i].length;j++){
                System.out.printf("%d x %d = %d %n", t[i][j][0], t[i][j][1], t[i][j][2]);
            }
        }
    }


}
