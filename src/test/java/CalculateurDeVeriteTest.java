import com.STD22109.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculateurDeVeriteTest {
    @Test
    void test_des_valeur_de_verite (){
        var verite = new Verite("Lou est beau");
        var mensonge = new Monsonge("Lou est pauvre");
        var incertitude = new Incertitude("Lou est généreux");
        assertTrue(!mensonge.isValeurDeVerite() && !mensonge.isIncertitude());
        assertTrue(verite.isValeurDeVerite() && !verite.isIncertitude());
        assertTrue(incertitude.isIncertitude());
    }
}
