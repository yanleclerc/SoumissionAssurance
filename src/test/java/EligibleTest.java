import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet d'effectuer plusieurs tests sur la classe
 * Eligible.
 */
public class EligibleTest {
    @Test
    public void testEligibleAgeHomme80(){
        Personne personne = new Personne("Dio",1,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertTrue(Eligible.determinerEligible(personne));
    }

    @Test
    public void testEligibleAgeFemme80(){
        Personne personne = new Personne("Dio",2,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertTrue(Eligible.determinerEligible(personne));
    }
    @Test
    public void testEligibleFumeur(){
        Personne personne = new Personne("Dio",2,"1940-01-01",
                false,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray());
        Assertions.assertTrue(Eligible.determinerFumeur
                (personne.getFumeurTab(),personne.getFumeurCan()));
    }

}
