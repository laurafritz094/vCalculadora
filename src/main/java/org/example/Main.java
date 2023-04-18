package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitMenuFiguras();
    }

    private static void InitMenuFiguras() {

        menuFiguras();
        Scanner teclado = new Scanner(System.in);
        int seleccion=teclado.nextInt();


        switch (seleccion) {
            case 1:
                calcCuadrado();
                break;
            case 2:
                calcRectangulo();
                break;
            case 3:
                calcCirculo();
                break;
            case 4:
                calcEsfera();
                break;
            case 5:
                calcCubo();
                break;
            case 6:
                calcCono();
                break;
            default:
                System.out.println("Esa opcion no existe, reintente otra vez");
        }

    }

    private static void calcCono() {
        System.out.println("ingrese diametro(1) y altura(2) del cono");
        double diametro=metodoScaner();
        double radio =diametro/2;
        double altura = metodoScaner();
        boolean positivo1 = valnegative(radio);
        boolean positivo2 = valnegative(altura);

        if (positivo1 && positivo2) {
            double volumen = calVolCono(radio,altura);
            double area = calAreaCono(radio,altura);

            System.out.println("El volumen del cono es : " + volumen);
            System.out.println("El area del cono es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

    }

    public static boolean valnegative(double number) {
        boolean positivo = false;
        if (number>=0) {
            positivo = true;
        }
        return positivo;
    }

    public static double calAreaCono(double radio, double altura) {
        double area =  Math.PI*radio*(radio+altura);
        return area;
    }

    private static double calVolCono(double radio, double altura) {
        double cuadrado = potencia(radio,2);
        double volumen = (Math.PI*cuadrado*altura)/3;
        return volumen;
    }

    private static double potencia(double base, int exponente) {
        double exponecial = 0;
        exponecial = Math.pow(base,exponente);
        return exponecial;
    }

    private static double metodoScaner() {
        Scanner teclado = new Scanner(System.in);
        double entrada=teclado.nextInt();
        return entrada;
    }

    private static void calcCubo() {
        System.out.println("ingrese longitud de uno de los lados del cubo: ");
        double lado=metodoScaner();
        boolean positivo = valnegative(lado);
        if (positivo) {
            double area =  potencia(lado,2);
            double volumen = potencia(lado,3);
            System.out.println("El volumen del cubo es : " + volumen);
            System.out.println("El area del cubo es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

    }

    private static void calcEsfera() {
        System.out.println("ingrese radio de la esfera: ");
        double radio=metodoScaner();
        boolean positivo = valnegative(radio);
        if (positivo) {
            double volumen = calcVolEsfera(radio);
            double area = Math.PI*radio*radio;
            System.out.println("El volumen de la esfera es : " + volumen);
            System.out.println("El area de la esfera es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

    }

    private static double calcVolEsfera(double radio) {
        double pot = potencia(radio,3);
        double volumen = (Math.PI*pot)*4/3;
        return volumen;
    }

    private static void calcCirculo() {
        System.out.println("ingrese radio del circulo: ");
        double radio=metodoScaner();
        boolean positivo = valnegative(radio);
        if (positivo) {
            double perimetro = 2*Math.PI*radio;
            double area = Math.PI*radio*radio;
            System.out.println("El perimetro del circulo es : " + perimetro);
            System.out.println("El area del circulo es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

    }

    private static void calcRectangulo() {
        System.out.println("ingrese base(1) y altura(2) de un rectangulo: ");
        double ladoa=metodoScaner();
        double ladob=metodoScaner();
        boolean positivo1 = valnegative(ladoa);
        boolean positivo2 = valnegative(ladob);
        if (positivo1 && positivo2) {
            double area =  ladoa*ladob;
            double perimetro = 2*ladoa+2*ladob;

            System.out.println("El perimetro del rectangulo es : " + perimetro);
            System.out.println("El area del rectangulo es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

    }

    private static void calcCuadrado() {
        System.out.println("ingrese longitud de uno de los lados del cuadrado: ");
        double lado=metodoScaner();
        boolean positivo = valnegative(lado);
        if (positivo) {
            double area =  potencia(lado,2);
            double perimetro = 4*lado;
            System.out.println("El perimetro del cuadrado es : " + perimetro);
            System.out.println("El area del cuadrado es : " + area);
        } else {
            System.out.println("ha ingresado un numero incorrecto");
        }

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