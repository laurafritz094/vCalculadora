package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.interfaces.DSAPublicKey;

class MainTest {

    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void calcularCuadratica() {
        Main cal = new Main();
        Double[] b= new Double[3];
        b[0]= Double.valueOf(-1);
        b[1]= Double.valueOf(4);
        b[2]= Double.valueOf(-3);
        /*esperado*/
        Double[] a= new Double[2];
        a[0]=Double.valueOf(3);
        a[1]=Double.valueOf(1);

        Assertions.assertArrayEquals(a,cal.calcularCuadratica(b));


    }

    @Test
    void calcularSistema() {
        Main cal = new Main();
        Double[] b= new Double[6];
        b[0]= Double.valueOf(2);
        b[1]= Double.valueOf(3);
        b[2]= Double.valueOf(-1);
        b[3]= Double.valueOf(3);
        b[4]= Double.valueOf(4);
        b[5]= Double.valueOf(0);

        /*esperado*/
        Double[] a= new Double[2];
        a[0]=Double.valueOf(4);
        a[1]=Double.valueOf(-3);

        Assertions.assertArrayEquals(a,cal.calcularSistema(b));

    }

    @Test
    void calcularEcurec() {
        Main cal = new Main();
        Double[] b= new Double[6];
        b[0]= Double.valueOf(1);
        b[1]= Double.valueOf(-2);
        b[2]= Double.valueOf(3);
        b[3]= Double.valueOf(4);
        b[4]= Double.valueOf(4);
        /*esperado*/
        Double[] a= new Double[2];
        a[0]=Double.valueOf(3);
        a[1]=Double.valueOf(4);
        Assertions.assertArrayEquals(a,cal.calcularEcurec(b));

    }
}