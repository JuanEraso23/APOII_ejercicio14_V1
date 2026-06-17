package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.print("Digite el primer número: ");
        int x = sc.nextInt();

        System.out.print("Digite el segundo número: ");
        int y = sc.nextInt();

        //Operaciones
        int a = suma(x, y);
        int b = resta(x, y);
        int c = multiplicacion(x, y);
        double d = division(x, y);

        //Resultados
        System.out.println("SUMA: " + a);
        System.out.println("RESTA: " + b);
        System.out.println("MULTIPLICACIÓN: " + c);
        System.out.println("DIVISIÓN: " + d);

        //Cierre Scanner
        sc.close();
    }

    //Método Suma
    public static int suma(int x, int y) {
        return (x + y);
    }

    //Método Resta
    public static int resta(int x, int y) {
        return (x - y);
    }

    //Método Multiplicación
    public static int multiplicacion(int x, int y) {
        return (x * y);
    }

    //Método División
    public static double division(int x, int y) {
        return (double) x / y;
    }
}