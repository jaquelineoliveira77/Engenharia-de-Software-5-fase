
import modelo.Matematica;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jaqueline Oliveira
 */
public class MatematicaTeste_1 {

    @Test
    public void calculaTesteCaixaPreta() {

        Matematica mtm = new Matematica();

        //casos de teste soma
        assertEquals(2, mtm.soma(1, 1), 0);
        
        //exemplo uma classe com erro = 1+1=2 // erro soma = 3
        // assertEquals(3, mtm.soma(1, 1), 0);
        
        assertEquals(-10, mtm.soma(-11, 1), 0);
        assertEquals(1.42, mtm.soma(3.14f, -1.72f), 0.001);

        //casos de teste subtrai
        assertEquals(10, mtm.subtrai(20, 10), 0);
        assertEquals(15, mtm.subtrai(20, 5), 0);
        assertEquals(5, mtm.subtrai(10, 5), 0);

        //casos de teste multiplica
        assertEquals(8, mtm.multiplica(4, 2), 0);
        assertEquals(5, mtm.multiplica(1, 5), 0);
        assertEquals(7, mtm.multiplica(7, 1), 0);

        //casos de teste divide
        assertEquals(4, mtm.divide(8, 2), 0);
        assertEquals(5, mtm.divide(15, 3), 1);
        assertEquals(7, mtm.divide(70, 10), 0);

    }
    
    @Before
    public void setUp(){
        
        Matematica mtm = new Matematica();
        
        
        
    }

}
