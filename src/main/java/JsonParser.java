import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


import java.io.IOException;
import java.text.ParseException;

import net.sf.json.JSONException;
import org.apache.commons.lang.SerializationException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe transmet d'abord les données du fichier JSON en String
 * et par la suite, les valeurs de l'objet JSONObject dans l'objet Personne.
 */

public class JsonParser {

    //Message d'erreur pour l'attribution des données
    final static String MSG_ERR_DATA = "Erreur, les données de la soumissions " +
            "sont incomplètes. Veuillez recommencer.";

    /**
     * Cette méthode permet d'attribuer les valeurs de l'assurance collective
     * si elle est true à la base
     * @param objet,    le sous-objet JSON pour le traitement des données.
     * @param personne, l'objet pour stocker les données du clients.
     */
    private static void jsontoACollective(JSONObject objet, Personne personne){

        try{
            personne.setEmployeur(objet.getString("employeur"));
            personne.setNumContrat(objet.getString("numero_contrat"));
            personne.setDateEmb(objet.getString("date_embauche"));
            personne.setPartEmp(objet.getInt("part_employeur"));
            personne.setLieuTravail(objet.getString("lieu_travail"));
        }catch(NullPointerException | JSONException e) {
            System.out.println(MSG_ERR_DATA);
            System.exit(0);
        }
    }

    /**
     * Cette méthode permet d'attribuer les valeurs du fichier JSON dans l'objet
     * Personne.
     * @param objet,    le sous-objet JSON pour le traitement des données.
     * @param personne, l'objet pour stocker les données du clients.
     */
    private static void jsonToPersonne(JSONObject objet, Personne personne) {
        try {
            personne.setNom(objet.getString("nom"));
            personne.setGenre(objet.getInt("genre"));
            personne.setDate(objet.getString("date_de_naissance"));
            personne.setACollective(objet.getBoolean("assurance_collective"));
            JSONObject fumeurObjet = (JSONObject) objet.get("fumeur");
            personne.setFumeurTab((boolean) fumeurObjet.get("tabac"));
            personne.setFumeurCan((boolean) fumeurObjet.get("cannabis"));
            personne.setAlcool(objet.getBoolean("alcool"));
            JSONArray listeMaladie = (JSONArray) objet.get("antecedents");
            personne.setAntecedents(listeMaladie);
            JSONArray listeSport = (JSONArray) objet.get("sports");
            personne.setSport(listeSport);
            if (personne.getACollective()){
                jsontoACollective(objet,personne);
            }
        } catch (NullPointerException | JSONException e) {
            System.out.println(MSG_ERR_DATA);
            System.exit(0);
        }
    }

    /**
     * Cette méthode permet de lire et traiter les données du fichier JSON
     *
     * @param cheminEntree, le fichier d'entrée JSON
     * @param personne,     l'objet dans lequel les données sont stockées
     * @throws IOException,    si erreur lors de la lecture des données.
     * @throws ParseException, si erreur lors de l'attribution de la chaine
     *                         de caractères vers l'objet.
     * @return, l'objet avec toutes les données stockées en variables.
     */
    public static Personne jsonFileToPersonne(String cheminEntree,
                                              Personne personne)
            throws IOException {
        JSONObject objet = null;

        String jsonString = DiskFile.loadFileIntoString(cheminEntree);
        try {
            objet = (JSONObject) JSONSerializer.toJSON(jsonString);
        } catch (NullPointerException | JSONException e) {
            System.out.println(MSG_ERR_DATA);
            System.exit(0);
        }
        jsonToPersonne(objet, personne);
        return personne;
    }
}