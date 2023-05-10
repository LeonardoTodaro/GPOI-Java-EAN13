import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class test {

   private static EAN13 ean13;


@BeforeClass
public static void init(){
ean13 = new EAN13();
}


@Test
public void testEanVerificaCodiceValido(){
   ean13.setCodice("3614273613422");
   assertTrue(ean13.verificaCodice());
 
}


@Test
public void testEanVerificaCodiceNonValido(){
    ean13.setCodice("3614273613622");
    assertFalse(ean13.verificaCodice());
}

@Test
public void testEanVerificaCodiceLunghezzaNonValida(){
    ean13.setCodice("3614273");
    assertFalse(ean13.verificaCodice());
}

@Test
public void testEanVerificaCodiceVuoto(){
    ean13.setCodice("");
    assertThrows(NullPointerException.class, () -> {ean13.verificaCodice();});
}
}

