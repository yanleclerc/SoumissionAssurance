import net.sf.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet l'écriture du fichier des résultats.
 */

public class JsonWriter {

    //Message d'erreur pour le fichier JSON de sortie
    final static String MSG_ERR_EXC = "Erreur lors de la création du fichier des"
            +" résultats. Veuillez recommencez.";

    /**
     *  Cette méthode ecrit les résultats si l'assurance est individuelle
     *
     * @param personne l'objet personne contenant les données.
     * @param cheminSortie le fichier JSON de sortie.
     */
    private static void ecrireIndividuel(Personne personne, String cheminSortie){
        JSONObject resultat = new JSONObject();
        resultat.put("eligible", Eligible.determinerEligible(personne));
        if (Eligible.determinerEligible(personne)) {
            resultat.put("montant_annuel", Montant.determinerMontant(personne));
        }
        try {
            DiskFile.saveStringIntoFile(cheminSortie, resultat.toString());
        } catch (IOException e) {
            System.out.println(MSG_ERR_EXC);
            System.exit(0);
        }
    }

    /**
     *  Cette méthode ecrit les résultats si l'assurance est individuelle
     *
     * @param personne l'objet personne contenant les données.
     * @param cheminSortie le fichier JSON de sortie.
     */
    private static void ecrireCollectif(Personne personne, String cheminSortie){
        JSONObject resultat = new JSONObject();
        resultat.put("eligible",  Eligible.determinerEligible(personne)&&
                ACollective.verifierEligibleACollective(personne) );
        if ( Eligible.determinerEligible(personne)&&
                ACollective.verifierEligibleACollective(personne)) {
            resultat.put("montant_annuel", Montant.determinerMontant(personne));
            resultat.put("part_employeur",
                    ACollective.determinerMontantEmployeur(personne,
                            Montant.determinerMontant(personne)));
            resultat.put("part_employe",
                    ACollective.determinerMontantEmploye(personne,
                    Montant.determinerMontant(personne)));
        }
        try {
            DiskFile.saveStringIntoFile(cheminSortie, resultat.toString());
        } catch (IOException e) {
            System.out.println(MSG_ERR_EXC);
            System.exit(0);
        }

    }


    /**
     * Cette méthode permet la lecture des données et l'écriture des résultats.
     *
     * @param cheminEntree, le fichier d'entrée JSON.
     * @param cheminSortie  Le fichier de sortie JSON.
     * @param personne,     l'objet pour stocker les données .
     * @throws IOException,    si erreur lors de l'écriture des résultats.
     * @throws ParseException, si erreur lors de la distribution des données.
     */
    public static void ecrire(String cheminEntree, String cheminSortie,
                              Personne personne)
            throws IOException, ParseException {
        JsonParser.jsonFileToPersonne(cheminEntree, personne);
        if (personne.getACollective()){
            ecrireCollectif(personne, cheminSortie);
        } else {
            ecrireIndividuel(personne,cheminSortie);
        }
    }
}
