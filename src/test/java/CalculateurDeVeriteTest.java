import com.STD22109.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void test_de_la_calcul_de_verite (){
        var verite = new Verite("Lou est beau");
        var mensonge = new Monsonge("Lou est pauvre");
        var incertitude = new Incertitude("Lou est généreux");
        var mensongeEtIncertitude = new CalculateurDeVerite(mensonge , incertitude , "et").donnerLaReponse();
        assertEquals(mensongeEtIncertitude , CalculateurDeVerite.reponse.jenesaispas);

        var veriteDoncMensonge = new CalculateurDeVerite(verite , mensonge , "donc").donnerLaReponse();
        assertEquals(veriteDoncMensonge , CalculateurDeVerite.reponse.faux);

        var mensongeDoncIncertitude = new CalculateurDeVerite(mensonge , incertitude , "donc").donnerLaReponse();
        assertEquals(mensongeDoncIncertitude , CalculateurDeVerite.reponse.jenesaispas);


    }
}
