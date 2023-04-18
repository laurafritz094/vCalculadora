
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.interfaces.DSAPublicKey;
import org.junit.Before;



import static org.junit.Assert.*;

public class MainTest {
    private Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testAreaConoTrue() throws Exception {
        double radio = 1;
        double altura = 5;
        assertEquals(main.calAreaCono(radio, altura), 18.84955592153876, 1);
    }

    @Test
    public void testNumNegative() throws Exception {
        double altura = -5;
        assertFalse("negativo", Main.valnegative(altura));
    }

    @Test
    public void testNumZero() throws Exception {
        double altura = 0;
        assertTrue("zero", Main.valnegative(altura));
    }

    @Test
    public void testNumPositive() throws Exception {
        double altura = 5;
        assertTrue("positivo", Main.valnegative(altura));
    }

    @Test
    public void testAreaConoFalse() throws Exception {
        double radio = 0;
        double altura = 5;
        assertEquals(main.calAreaCono(radio, altura), 0, 1);
    }

    @Test
    public void testAreaConoZero() throws Exception {
        double radio = 0;
        double altura = 0;
        assertEquals(main.calAreaCono(radio, altura), 0, 1);
    }

    @Test
    void calcularCuadratica() {
        Main cal = new Main();
        Double[] b= new Double[3];
        b[0]= Double.valueOf(-1);
        b[1]= Double.valueOf(4);
        b[2]= Double.valueOf(-3);

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

        Double[] a= new Double[2];
        a[0]=Double.valueOf(3);
        a[1]=Double.valueOf(4);
        Assertions.assertArrayEquals(a,cal.calcularEcurec(b));

    }
}