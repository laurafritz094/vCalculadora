import org.example.Main;
import org.junit.Before;
import org.junit.Test;

import static org.example.Main.valnegative;
import static org.junit.Assert.*;

public class testMain {
    private Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testAreaConoTrue() throws Exception {
        double radio = 1;
        double altura=5;
        assertEquals(main.calAreaCono(radio, altura), 18.84955592153876,1);
    }
    @Test
    public void testNumNegative() throws Exception {
        double altura=-5;
        assertFalse("negativo", valnegative(altura));
    }

    @Test
    public void testNumZero() throws Exception {
        double altura=0;
        assertTrue("zero", valnegative(altura));
    }

    @Test
    public void testNumPositive() throws Exception {
        double altura=5;
        assertTrue("positivo", valnegative(altura));
    }
    @Test
    public void testAreaConoFalse() throws Exception {
        double radio = 0;
        double altura=5;
        assertEquals(main.calAreaCono(radio, altura), 0,1);
    }
    @Test
    public void testAreaConoZero() throws Exception {
        double radio = 0;
        double altura=0;
        assertEquals(main.calAreaCono(radio, altura), 0,1);
    }



}
