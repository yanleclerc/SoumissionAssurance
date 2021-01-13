import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet d'effectuer plusieurs tests sur la classe
 * Age
 */

public class AgeTest {

    @Test
    public void testAgeHomme80(){
        Personne personne = new Personne("Dio",1,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertTrue(Age.validerAge(personne.getGenre()
                ,Age.determinerAge(personne.getDate())));
    }
    @Test
    public void testAgeHomme100(){
        Personne personne = new Personne("Dio",1,"1929-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertFalse(Age.validerAge(personne.getGenre()
        ,Age.determinerAge(personne.getDate())));
    }
    @Test
    public void testAgeFemme80(){
        Personne personne = new Personne("Dio",2,"1940-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertTrue(Age.validerAge(personne.getGenre()
                ,Age.determinerAge(personne.getDate())));
    }
    @Test
    public void testAgeFemme100(){
        Personne personne = new Personne("Dio",2,"1929-01-01",
                false,new JSONObject(),false,
                false,true,new JSONArray(),new JSONArray());
        Assertions.assertFalse(Age.validerAge(personne.getGenre()
                ,Age.determinerAge(personne.getDate())));
    }
}
