import net.sf.json.JSONArray;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet de déterminer si une personne est éligible
 * à l'assurance selon les critères fixés.
 */
public class Eligible {

    final static String MSG_ERR_GENRE = "Genre invalide!" +
            " Les valeurs possibles sont : 0,1,2,9 (selon la norme ISO 5218)" +
            "\nVeuillez vérifier le fichier d'entrée. ";
    final static String MSG_ERR_DATE = "La date ne peut pas être dans le futur" +
            "\nVeuillez vérifier le fichier d'entrée. ";
    final static String MSG_ERR_SPORT = "La liste des sports" +
            " contient des éléments invalides..." +
            "\nVeuillez vérifier le fichier d'entrée. ";


    /**
     * Cette méthode permet de déterminer si la personne fume le tabac ET
     * le cannabis.
     * @param fumeurTab  , la valeur booléenne si fume le tabac
     * @param fumeurCan, la valeur booléenne si fume le cannabis
     * @return la valeur booléenne si la personne fume les deux substances.
     */
    public static boolean determinerFumeur(boolean fumeurTab,
                                           boolean fumeurCan) {
        boolean fumeur = false;

        if (fumeurTab == true && fumeurCan == true) {
            fumeur = true;
        }
        return fumeur;
    }

    /**
     * Cette méthode permet de déterminer si une personne est éligible
     * à l"assurance selon les sports qu'elle pratique
     *
     * @param listeSport, le ArrayList des sports pratiqués
     * @return la valeur booléenne si la personne est éligible
     */
    private static boolean evaluerSport(JSONArray listeSport) {
        boolean eligible = true;

        try {
            for (int i = 0; i < listeSport.size(); i++) {
                if (listeSport.get(i).equals("Bungee") ||
                        listeSport.get(i).equals("Saut en parachute") ||
                        listeSport.get(i).equals("Escalade")) {
                    eligible = false;
                }
            }
        } catch (NullPointerException e) {
           PrimeAssurance.sortirSysteme(MSG_ERR_SPORT);
        }
        return eligible;
    }

    /**
     * Cette méthode permet d'analyser les données du clients et de déterminer
     * si le client est admissible ou non à l'assurance.
     *
     * @param personne, l'objet personne contenant les données du client.
     * @return, la valeur booléenne si le client est éligible à l'assurance
     */
    public static boolean determinerEligible(Personne personne) {
        boolean eligible = false;
        try {
            if (!determinerFumeur(personne.getFumeurTab(),
                    personne.getFumeurCan())) {
                switch (personne.getGenre()) {
                    case 0:
                    case 2:
                    case 9:
                        eligible = Age.validerAge(personne.getGenre(),
                                Age.determinerAge(personne.getDate()));
                        break;
                    case 1:
                        eligible = Age.validerAge(1,
                                Age.determinerAge(personne.getDate()));
                        break;
                    default:
                        System.out.println(MSG_ERR_GENRE);
                        break;
                }
                eligible = evaluerSport(personne.getSport());
            }
        } catch (IllegalArgumentException e) {
            PrimeAssurance.sortirSysteme(MSG_ERR_DATE);
        }
        return eligible;
    }
}
