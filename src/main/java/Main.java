
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Inicializador();
    }

    private static void Inicializador() {
        Scanner teclado = new Scanner(System.in);
        boolean reiniciar = true;
        do {
            String menuseleccionado;
            do {
                Menu();
                menuseleccionado = teclado.nextLine();
            }while (!EsInteger(menuseleccionado));
            EleccionMenu(Integer.parseInt(menuseleccionado));
            reiniciar = deseaseguir();
        }while (reiniciar==true);
    }
    private static boolean deseaseguir() {
        boolean repetir = true;
        do {
            System.out.println("Desea elegir otra opcion o salir (si, salir)");
            String otraOperacion = entradaS();
            if (otraOperacion.equals("salir")){
                repetir = false;
                return false;
            }else if (otraOperacion.equals("si")){
                repetir = false;
            }else {
                System.out.println("esa opcion no existe, ingrese otra vez");
            }
        }while (repetir==true);
        return true;
    }
    private static void EleccionMenu(int menuseleccionado) {

        switch (menuseleccionado) {
            case 1:
                OperacionesBasicas();
                break;

            case 2:
                EcuacionesCuadraticas();
                break;

            case 3:
                CalcularPerimetroAreaVolumenes();
                break;

            case 4:
                Sistema2ecuaciones();
                break;

            case 5:
                EcuacionDeLaRecta();
                break;

            case 6:
                System.out.println("Responda salir si desea cerrar el programa");
                break;

            default:
                System.out.println("Esa opcion no existe, ingrese otra vez");
                break;

        }
    }
    private static void EcuacionDeLaRecta() {
        System.out.println("eligio ecuacion de la recta");
    }
    private static void Sistema2ecuaciones() {
        System.out.println("eligio sistema de 2 ecuaciones");
    }
    private static void CalcularPerimetroAreaVolumenes() {
        System.out.println("eligio calcular perimetro area o volumenes");

    }
    private static void EcuacionesCuadraticas() {
        System.out.println("eligio ecuaciones cadraticas");

    }
    private static void OperacionesBasicas() {
        int e = 2;
        Double[] num = crearMatriz(e);
        String opcionElejida;
        boolean terminar=true;
        do {

            do {
                System.out.println("ahora elija la operacion que desea: ");
                System.out.println("opcion 1: suma");
                System.out.println("opcion 2: resta");
                System.out.println("opcion 3: multiplicacion");
                System.out.println("opcion 4: division");
                System.out.println("opcion 5: el mayor de 2 numeros");
                System.out.println("opcion 6: el menor de 2 numeros");
                System.out.println("opcion 7: potencia del primer numero elevado al segundo");
                System.out.println("opcion 8: calcular porcentaje de un numero");
                System.out.println("opcion 9: salir");



                opcionElejida = entradaS();

            } while (!EsInteger(opcionElejida));

            switch (opcionElejida) {
                case "1":
                    suma(num);
                    terminar = false;
                    break;
                case "2":
                    resta(num);
                    terminar = false;
                    break;
                case "3":
                    multiplicacion(num);
                    terminar = false;
                    break;
                case "4":
                    division(num);
                    terminar = false;
                    break;
                case "5":
                    nMayor(num);
                    terminar=false;
                    break;
                case "6":
                    nMenor(num);
                    terminar=false;
                    break;
                case "7":
                    potenciaprimernumelevadoalsegundo(num);
                    terminar=false;
                    break;
                case "8":
                    calcularporcentaje(num);
                    terminar=false;
                    break;
                case "9":
                    terminar=false;
                    break;

                default:
                    System.out.println("Esa opcion no existe, ingrese otra vez");
                    break;
            }
        }while (terminar==true);
    }

    private static void calcularporcentaje(Double[] num) {
    }

    private static void potenciaprimernumelevadoalsegundo(Double[] num) {
    }

    private static void nMenor(Double[] num) {
        
    }

    private static void nMayor(Double[] num) {
        
    }

    private static void division(Double[] num) {
        num = llenarMatriz2numeros(num);
        double division = num[0] / num[1];
        System.out.println("la division es: "+ division);
    }
    private static void multiplicacion(Double[] num) {
        num = llenarMatriz2numeros(num);
        double multiplicacion = num[0] * num[1];
        System.out.println("la multiplicacion es: "+ multiplicacion);
    }
    private static void resta(Double[] num) {
        num = llenarMatriz2numeros(num);
        double resta = num[0] - num[1];
        System.out.println("la resta es: "+ resta);

    }
    private static void suma(Double[] num) {
        num = llenarMatriz2numeros(num);
        double suma = num[0] + num[1];
        System.out.println("la suma es: "+ suma);
    }
    private static void Menu() {
        System.out.println("Elija la opcion que necesita de la calculadora (solo número)");
        System.out.println("opcion 1: Operaciones basicas (suma, resta, multiplicacion, division)");
        System.out.println("opcion 2: Ecuacion cuadratica");
        System.out.println("opcion 3: Calcular perimetro, area o volumenes (solo figuras de: cuadrado, rectangulo, circulo, esfera, cubi y cono)");
        System.out.println("opcion 4: Sistema de 2 ecuaciones y 2 incognitas");
        System.out.println("opcion 5: Calcular ecuacion de la recta");
        System.out.println("opcion 6: Cerrar programa");
    }
    private static String entradaS(){
        Scanner teclado = new Scanner(System.in);
        String salida = teclado.nextLine();
        return salida;
    }
    private static boolean EsInteger(String text) {
        int v;
        try {
            v=Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("ese no es un numero, ingrese otra vez");
            return false;
        }
    }
    public static Double[] crearMatriz(int e) {
        Double[] matriz = new Double[e];
        return matriz;
    }
    //reemplazar valores definidos por Scanner
    public static Double[] llenarMatriz2numeros(Double[] num) {
        num[0] = Double.valueOf(3);
        num[1] = Double.valueOf(4);
        return num;
    }
    //reemplazar valores definidos por Scanner
}