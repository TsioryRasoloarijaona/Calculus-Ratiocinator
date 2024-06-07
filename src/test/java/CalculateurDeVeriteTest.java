import com.STD22109.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculateurDeVeriteTest {
    @Test
    void test_des_valeurs_de_varite (){
        var verite = new Verite("Lou est beau");
        var mensonge = new Monsonge("Lou est pauvre");
        var incertitude = new Incertitude("Lou est généreux");
        var reponse1 = new CalculateurDeVerite(verite , mensonge , "donc").donnerLaReponse();
        assertTrue(reponse1.);
    }
}
