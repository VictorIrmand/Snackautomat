import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class snackAutomatTest {

    @Test
    void testMedKøbMedKorrekteByttePenge() {
        //Arrange
        snackAutomat automat = new snackAutomat();
        int pris = 20;
        int betalt = 35;

        //Act
        int byttePenge = automat.køb(20,35);

        //Assert
        assertEquals(15,byttePenge, "Der burde gerne være 15kr i byttepenge");


    }

    @Test
    void testAfByttePenge(){
        //Arrange
        snackAutomat automat = new snackAutomat();
        int beløb = 87;

        //Act
        int[] result = automat.byttePenge(beløb);

        //Assert
        int[] expected = {4,0,1,1,0};
        assertArrayEquals(expected,result);
    }
}