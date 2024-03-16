package Ej5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Funciones f = new Funciones();
        Funciones f2 = new Funciones();

        System.out.println("Ingrese un valor para la dimension fisica del vector de enteros: ");
        int[] v = new int[in.nextInt()];

        for (int i=0;i<v.length; i++) {
            System.out.println("Ingrese un valor para la posicion " +i);
            v[i] = in.nextInt();
        }

        System.out.println("-------------Por retorno de objeto-------------");
        f = Funciones.asReturn(v);
        System.out.println("Numero maximo: "+f.getMax());
        System.out.println("Numero minimo: "+f.getMin());
        System.out.println("Numero promedio: "+f.getProm());

        System.out.println("-------------Por espacio en memoria-------------");
        f2.setDimf(v.length);
        for (int i : v) {
            f2.asParameter(f2,i);   
        }
        f2.calcularPromedio();
        System.out.println("Numero maximo: "+f2.getMax());
        System.out.println("Numero minimo: "+f2.getMin());
        System.out.println("Numero promedio: "+f2.getProm());
        in.close();
    }
}
