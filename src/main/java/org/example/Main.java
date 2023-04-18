package org.example;

public class Main {

    public static void main(String[] args) {


    }
    /* Métodos cuadratica*/
    public static Double[] calcularCuadratica(Double[] numeros) {
        double A,B,C,potencia,l,m,m1=0;
        double x1=0;
        double x2=0;
        try {
            A = numeros[0];
            B = numeros[1];
            C = numeros[2];
            potencia = Math.pow(B, 2) - (4 * A * C);
            l = 2 * A;
            m = (-B) - (Math.sqrt(potencia));
            m1 = (-B) + (Math.sqrt(potencia));

            x1 = (m / l);
            x2 = (m1 / l);
            mostrarRaices(x1, x2);


        } catch (Exception e) {
            System.out.println("no se puede dividir por 0");
        }
        return convertiraMatriz(x1, x2);
    }
    public static void  mostrarRaices(double x1, double x2){
        System.out.println("Primera raiz:"+x1);
        System.out.println("Segunda raiz:"+x2);
    }

    public static Double[] convertiraMatriz(double x,double y){
        Double[] raices = crearMatriz(2);
        raices[0]= x;
        raices[1]=y;
        return raices;
    }

    public static Double[] crearMatriz(int e){
        Double[] matriz = new Double[e];
        return  matriz;
    }
    /*Métodos sistema de ecuaciones lineal*/
    public static Double[] calcularSistema(Double[] primero){
        double x= 0;
        double y= 0;
        try {
            double a = primero[0];
            double b = primero[1];
            double c = primero[2];
            double d = primero[3];
            double e = primero[4];
            double f = primero[5];
            double l = (e * a) - (d * b);
            double m = (f * a) - (d * c);

            y = m / l;

            double m1 = c - (b * y);

            x = (m1 / a);
            mostrarIngognitas(x, y);
        }catch (Exception e){
            System.out.printf("no es posible dividir por 0");

        }
        return convertiraMatriz(x,y);
    }
    public static void mostrarIngognitas(double x, double y){
        System.out.println("Valor de x:"+x);
        System.out.println("Valor de y:"+y);
    }
    public static Double[] calcularEcurec(Double[] num){
        double y1,y2,x1,x2,m=0;
        double b =0;
        try{x1= num[0];
            y1= num[1];
            x2= num[2];
            y2= num[3];
            b= num[4];
            double o=y2-y1;
            double l= x2-x1;
            m=o/l;
            mostarEcu(m,b);
        }catch(Exception e){
            System.out.printf("no se puede dividir por 0");
        }

        return convertiraMatriz(m,b);

    }
    public static void mostarEcu(double m, double b){
        System.out.println("La ecuación de la recta es: y="+m+"x +"+b );
    }
}