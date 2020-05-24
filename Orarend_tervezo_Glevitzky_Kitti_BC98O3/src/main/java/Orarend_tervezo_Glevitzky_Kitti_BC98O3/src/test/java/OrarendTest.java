import model.Orarendterv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrarendTest {
    Orarendterv Test;

    @BeforeEach
    void setUp() {

        Test = new Orarendterv();
    }

    @Test
   void testkiirtargy(){
       assertEquals("matematika",Test.kiirtargy("matematika"));
   }

    @Test
    void testkiirnap(){
        assertEquals("péntek",Test.kiirnap("péntek"));
    }


    @Test
    void testkiirora(){
        assertEquals("4",Test.kiirora("4"));
    }


    @Test
    void testkiirevfolyam(){
        assertEquals("6",Test.kiirevfolyam("6"));
    }

    @Test
    void testkiirosztaly(){
        assertEquals("A",Test.kiirosztaly("A"));
    }

    @Test
    void testkiiveg(){
        assertEquals("matematika péntek 4 6 A",Test.kiirveg("matematika péntek 4 6 A"));
    }



}
