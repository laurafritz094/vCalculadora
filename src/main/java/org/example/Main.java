package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitMenuFiguras();
    }

    private static void InitMenuFiguras() {
        Scanner teclado = new Scanner(System.in);
        menuFiguras();
        int seleccion = teclado.nextInt();
        switch (seleccion) {
            case 1:
                calcCuadrado();
            case 2:
                calcRectangulo();
            case 3:
                calcCirculo();
            case 4:
                calcEsfera();
            case 5:
                calcCubo();
            case 6:
                calcCono();
            default:
                System.out.println("Esa opcion no existe, reintente otra vez");
        }

    }

    private static void calcCono() {
        System.out.println("ingrese diametro(1) y altura(2) y el cono");
        double diametro=metodoScaner();
        double radio =diametro/2;
        double altura = metodoScaner();
        double cuadrado = potencia(radio,2);

        double volumen = (Math.PI*cuadrado*altura)/3;
        double area = ;
        System.out.println("El volumen del cono es : " + volumen);
        System.out.println("El area del cono es : " + volumen);
        System.out.println("El perimetro del cono es : " + volumen);
    }

    private static double potencia(double base, int exponente) {
        double exponecial = 0;
        exponecial = Math.pow(base,exponente);
        return exponecial;
    }

    private static int metodoScaner() {
        Scanner teclado = new Scanner(System.in);
        int entrada=teclado.nextInt();
        return entrada;
    }

    private static void calcCubo() {
    }

    private static void calcEsfera() {
    }

    private static void calcCirculo() {
    }

    private static void calcRectangulo() {
    }

    private static void calcCuadrado() {
    }

    private static void menuFiguras() {
        System.out.println("elija el numero de la figura geometrica a calcular: (perimetro, area, volumen) ");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Circulo");
        System.out.println("4.- Esfera");
        System.out.println("5.- Cubo");
        System.out.println("6.- Cono");
    }
}