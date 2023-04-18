
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
        Double[] num = crearMatriz(5);
        calcularEcurec(llenarMatriz5numeros(num));
    }
    private static void Sistema2ecuaciones() {
        Double[] num = crearMatriz(6);
        calcularSistema(llenarMatriz6numeros(num));

    }
    private static void CalcularPerimetroAreaVolumenes() {
        InitMenuFiguras();

    }
    private static void EcuacionesCuadraticas() {
        Double[] num = crearMatriz(3);
        calcularCuadratica(llenarMatriz3numeros(num));

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
        System.out.println("el primer numero es el porcentaje del segundo");
        num = llenarMatriz2numeros(num);
        double porcentaje = (num[0] * num[1]) / 100;
        System.out.println("su porcentaje es: "+ porcentaje);
    }

    private static void potenciaprimernumelevadoalsegundo(Double[] num) {
        num = llenarMatriz2numeros(num);
        double cuadrado = Math.pow(num[0], num[1]);
        System.out.println(num[0] +" elevado a "+num[1]+" es " + cuadrado);
    }

    private static void nMenor(Double[] num) {
        num = llenarMatriz2numeros(num);
        int indiceDelmenor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < num.length; x++) {
            if (num[x] < num[indiceDelmenor]) {
                indiceDelmenor = x;
            }
        }
        // Ahora podemos obtener el mayor usando la posición
        Double menor = num[indiceDelmenor];
        System.out.println("el numero menor es: "+ menor);;
    }

    private static void nMayor(Double[] num) {
        num = llenarMatriz2numeros(num);
        int indiceDelMayor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < num.length; x++) {
            if (num[x] > num[indiceDelMayor]) {
                indiceDelMayor = x;
            }
        }
        // Ahora podemos obtener el mayor usando la posición
        Double mayor = num[indiceDelMayor];
        System.out.println("el numero mayor es: "+ mayor);;
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

    private static boolean EsIntegerDouble2(String[] text) {
        Double v, x, y, t, q, a;
        try {
            v=Double.valueOf(text[0]);
            y=Double.valueOf(text[1]);
            x=Double.valueOf(text[2]);
            t=Double.valueOf(text[3]);
            q=Double.valueOf(text[4]);
            a=Double.valueOf(text[5]);
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

        String[] verificacion = new String[6];

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese su primer numero");
            verificacion[0] = teclado.nextLine();
            System.out.println("ingrese su segundo numero");
            verificacion[1] = teclado.nextLine();

            verificacion[2] = "0";
            verificacion[3] = "0";
            verificacion[4] = "0";
            verificacion[5] = "0";
        }while (!EsIntegerDouble2(verificacion));
        num[0] = Double.valueOf(verificacion[0]);
        num[1] = Double.valueOf(verificacion[1]);

        return num;
    }


    public static Double[] llenarMatriz3numeros(Double[] num) {
        Scanner teclado = new Scanner(System.in);
        String[] verificacion = new String[6];

        do {
            System.out.println("ingrese su A");
            verificacion[0] = teclado.nextLine();
            System.out.println("ingrese su B");
            verificacion[1] = teclado.nextLine();
            System.out.println("ingrese su C");
            verificacion[2] = teclado.nextLine();
            verificacion[3] = "0";
            verificacion[4] = "0";
            verificacion[5] = "0";
        }while (!EsIntegerDouble2(verificacion));
        num[0] = Double.valueOf(verificacion[0]);
        num[1] = Double.valueOf(verificacion[1]);
        num[2] = Double.valueOf(verificacion[2]);
        return num;
    }
    public static Double[] llenarMatriz6numeros(Double[] num) {
        String[] verificacion = new String[6];

        do {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su x de EC. 1");
        verificacion[0] = teclado.nextLine();
        System.out.println("ingrese su y de EC. 1");
        verificacion[1] = teclado.nextLine();
        System.out.println("ingrese su c de EC. 1");
        verificacion[2] = teclado.nextLine();
        System.out.println("ingrese su x de EC. 2");
        verificacion[3] = teclado.nextLine();
        System.out.println("ingrese su y de EC. 2");
        verificacion[4] = teclado.nextLine();
        System.out.println("ingrese su c de EC. 2");
        verificacion[5] = teclado.nextLine();
        }while (!EsIntegerDouble2(verificacion));
        num[0] = Double.valueOf(verificacion[0]);
        num[1] = Double.valueOf(verificacion[1]);
        num[2] = Double.valueOf(verificacion[2]);
        num[3] = Double.valueOf(verificacion[2]);
        num[4] = Double.valueOf(verificacion[2]);
        num[5] = Double.valueOf(verificacion[2]);
        return num;
    }

    public static Double[] llenarMatriz5numeros(Double[] num) {
        String[] verificacion = new String[6];

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese x del primer punto");
            verificacion[0] = teclado.nextLine();
            System.out.println("ingrese y del primer punto");
            verificacion[1] = teclado.nextLine();
            System.out.println("ingrese x del segundo punto");
            verificacion[2] = teclado.nextLine();
            System.out.println("ingrese y del segundo punto");
            verificacion[3] = teclado.nextLine();
            System.out.println("ingrese el valor de B");
            verificacion[4] = teclado.nextLine();
            verificacion[5] = "0";
        }while (!EsIntegerDouble2(verificacion));
        num[0] = Double.valueOf(verificacion[0]);
        num[1] = Double.valueOf(verificacion[1]);
        num[2] = Double.valueOf(verificacion[2]);
        num[3] = Double.valueOf(verificacion[2]);
        num[4] = Double.valueOf(verificacion[2]);
        return num;
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
    private static void InitMenuFiguras() {

        menuFiguras();
        Scanner teclado = new Scanner(System.in);
        String seleccion;
        //gg
        do {
            Menu();
            seleccion = teclado.nextLine();
        }while (!EsInteger(seleccion));
        //gg

        switch (seleccion) {
            case "1":
                calcCuadrado();
                break;
            case "2":
                calcRectangulo();
                break;
            case "3":
                calcCirculo();
                break;
            case "4":
                calcEsfera();
                break;
            case "5":
                calcCubo();
                break;
            case "6":
                calcCono();
                break;
            default:
                System.out.println("Esa opcion no existe, reintente otra vez");
                break;
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