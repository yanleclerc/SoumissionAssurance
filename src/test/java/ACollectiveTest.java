import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Cette classe permet d'effectuer plusieurs tests sur les limites
 *  des différentes classes (selon les exigences), elle inclue indirectement
 *  toutes les classes.
 */

public class ACollectiveTest {
    @Test
    public void testACollective(){
        Personne test = new Personne("DIO",1,"1996-01-01",
                true,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                "WALMART","A2299","2000-01-01",
                0,"Montreal");

        Assertions.assertTrue(ACollective.verifierEligibleACollective(test));
    }
    @Test
    public void testNumContratR(){
        Personne test = new Personne("DIO",1,"1996-01-01",
                true,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                "WALMART","R2299","2000-01-01",
                0,"Montreal");

        Assertions.assertTrue(ACollective.verifierEligibleACollective(test));
    }
    @Test
    public void testNumContratH(){
        Personne test = new Personne("DIO",1,"1996-01-01",
                true,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                "WALMART","H2299","2000-01-01",
                0,"Montreal");

        Assertions.assertTrue(ACollective.verifierEligibleACollective(test));
    }
    @Test
    public void testPartEmp50(){
        Personne test = new Personne("DIO",1,"1996-01-01",
                true,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                "WALMART","H2299","2000-01-01",
                50,"Montreal");

        Assertions.assertEquals("50",
                ACollective.determinerMontantEmployeur(test,100.0));
    }
    @Test
    public void testPartEmp100(){
        Personne test = new Personne("DIO",1,"1996-01-01",
                true,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                "WALMART","H2299","2000-01-01",
                100,"Montreal");

        Assertions.assertEquals("0",
                ACollective.determinerMontantEmploye(test,100.0));
    }
}
