import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet d'effectuer plusieurs tests sur l'objet
 * Personne.
 */

public class ObjetPersonneTest {



    @Test
    public void testConstructeurVide() {
        Personne personne = new Personne();
        Assertions.assertNotNull(personne);
    }
    @Test
    public void testConstructeurParametres(){
        Personne test = new Personne(null,0,null,
                false,new JSONObject(),true,
                true,true,new JSONArray(),new JSONArray(),
                null,null,null,
                0,null);
        Assertions.assertNotNull(test);
    }

    @Test
    public  void testNomDefini(){
        String nom = "Dio Brando";
        Personne personne = new Personne();
        personne.setNom(nom);

        Assertions.assertEquals("Dio Brando",personne.getNom());
    }

    @Test
    public void testGenreDefini(){
        int genre = 1;
        Personne personne = new Personne();
        personne.setGenre(genre);

        Assertions.assertEquals(1,personne.getGenre());
    }

    @Test
    public void testDateNaissanceDefini(){
        String date = "2020-01-01";
        Personne personne = new Personne();
        personne.setDate(date);

        Assertions.assertEquals(date,personne.getDate());
    }

    @Test
    public void testACollectiveDefini(){
        boolean assurance = true;
        Personne personne = new Personne();
        personne.setACollective(assurance);

        Assertions.assertTrue(personne.getACollective());
    }
    @Test
    public void testFumeurDefini(){
        JSONObject fumeur = new JSONObject();
        Personne personne = new Personne();
        personne.setFumeur(fumeur);

        Assertions.assertEquals(fumeur,personne.getFumeur());
    }

    @Test
    public void testFumeurTabDefini(){
        boolean fumeurTab = true;
        Personne personne = new Personne();
        personne.setFumeurTab(fumeurTab);

        Assertions.assertTrue(personne.getFumeurTab());
    }

    @Test
    public void testFumeurCanDefini(){
        boolean fumeurCan = true;
        Personne personne = new Personne();
        personne.setFumeurCan(fumeurCan);

        Assertions.assertTrue(personne.getFumeurCan());
    }

    @Test
    public void testAlcoolDefini(){
        boolean alcool = true;
        Personne personne = new Personne();
        personne.setAlcool(alcool);

        Assertions.assertTrue(personne.getAlcool());
    }

    @Test
    public void testAntecedentsDefini(){
        JSONArray antecedents = new JSONArray();
        antecedents.add("Cancer");
        Personne personne = new Personne();
        personne.setAntecedents(antecedents);

        Assertions.assertEquals(antecedents,personne.getAntecedents());
    }

    @Test
    public void testSportDefini(){
        JSONArray sports = new JSONArray();
        sports.add("Judo");
        sports.add("Nage");
        Personne personne = new Personne();
        personne.setSport(sports);

        Assertions.assertEquals(sports,personne.getSport());
    }

    @Test
    public void testEmployeurDefini(){
        String employeur = "Costco";
        Personne personne = new Personne();
        personne.setEmployeur(employeur);

        Assertions.assertEquals(employeur, personne.getEmployeur());
    }
    @Test
    public void testNumContratDefini(){
        String numContrat = "R6999";
        Personne personne = new Personne();
        personne.setNumContrat(numContrat);

        Assertions.assertEquals(numContrat, personne.getNumContrat());
    }

    @Test
    public void testDateEmbaucheDefini(){
        String date = "2020-01-01";
        Personne personne = new Personne();
        personne.setDateEmb(date);

        Assertions.assertEquals(date,personne.getDateEmb());
    }
    @Test
    public void testPartEmployeurDefini(){
        int part = 50;
        Personne personne = new Personne();
        personne.setPartEmp(part);

        Assertions.assertEquals(part, personne.getPartEmp());
    }

    @Test
    public void testLieuTravailDefini(){
        String lieu = "Ghetto Laval";
        Personne personne = new Personne();
        personne.setLieuTravail(lieu);

        Assertions.assertEquals(lieu,personne.getLieuTravail());
    }
}



