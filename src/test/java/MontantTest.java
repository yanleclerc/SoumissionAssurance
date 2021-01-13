import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Cette classe permet d'effectuer plusieurs tests sur la classe
 * montant ( les montants d'assurance), elle inclue indirectement la classe Age
 * et Eligible.
 */
public class MontantTest {
    @Test
    public void testMontantHommeNonDefini(){
        Personne personne = new Personne("Dio",1,"1996-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantFemmeNonDefini(){
        Personne personne = new Personne("Dio",2,"1996-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeHomme30(){
        Personne personne = new Personne("Dio",1,"1986-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeHomme41(){
        Personne personne = new Personne("Dio",1,"1976-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeHomme60(){
        Personne personne = new Personne("Dio",1,"1959-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeHomme80(){
        Personne personne = new Personne("Dio",1,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeHomme100(){
        Personne personne = new Personne("Dio",1,"1929-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemme30(){
        Personne personne = new Personne("Dio",2,"1986-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemme41(){
        Personne personne = new Personne("Dio",2,"1976-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemme60(){
        Personne personne = new Personne("Dio",2,"1959-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemme80(){
        Personne personne = new Personne("Dio",2,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemme100(){
        Personne personne = new Personne("Dio",2,"1929-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
    @Test
    public void testMontantAgeFemmeFumeur(){
        Personne personne = new Personne("Dio",2,"1929-01-01",
                false,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray());
        Assertions.assertNotEquals(0,
                Montant.determinerMontant(personne));
    }
}
