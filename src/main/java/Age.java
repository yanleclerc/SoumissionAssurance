import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Yan-Alexandre Leclerc
 * @CodePermanent LECY20069604
 * @Version 4 (remise 04-08-20)
 * @Description Cette classe permet de déterminer l'âge d'une personne
 * selon la date de naissance et la date actuelle
 */

public class Age {

    final static String MSG_ERR_FORMAT_DATE = "Le format de la date est invalide..." +
            "Le format valide est aaaa/MM/jj" +
            "\nVeuillez vérifier le fichier d'entrée. ";

    /**
     * Cette méthode permet de calculer l'age d'une personne.
     *
     * @param dateNaissance, La chaine de caractères de la date de naissance.
     * @return age, La valeur numérique de l'age d'une personne.
     */
    public static int determinerAge(String dateNaissance)
            throws IllegalArgumentException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        int age = 0;
        try {

        int anneeN = Integer.parseInt(dateNaissance.substring(0, 4));
        int moisN = Integer.parseInt(dateNaissance.substring(5, 7));
        int jourN = Integer.parseInt(dateNaissance.substring(8, 10));
        int annee = Integer.parseInt(formatter.format(date).substring(0, 4));
        int mois = Integer.parseInt(formatter.format(date).substring(5, 7));
        int jour = Integer.parseInt(formatter.format(date).substring(8, 10));
        age = annee - anneeN;


            if (mois > moisN) {
                age--;
            } else if (mois == moisN) {
                if (jour > jourN) {
                    age--;
                }
            }
        } catch (NullPointerException | NumberFormatException e) {
            PrimeAssurance.sortirSysteme(MSG_ERR_FORMAT_DATE);
        }
        if (age == 0) {
            throw new IllegalArgumentException();
        }
        return age;
    }

    /**
     * Cette methode permet d'identifier l'éligibilité d'une personne selon son
     * genre et sa date de naissance.
     *
     * @param genre, valeur du genre selon la norme ISO 5218
     * @param age,   valeur de l'age d'une personne
     * @return valeur boolean si elligible ou non
     */
    public static boolean validerAge(int genre, int age) {
        boolean valide = false;

        if (genre == 0 || genre == 2 || genre == 9) {
            valide = age >= 18 && age <= 85;
        } else if (genre == 1) {
            valide = age >= 18 && age <= 80;
        }
        return valide;
    }
}
