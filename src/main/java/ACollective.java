import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Cette classe permet de déterminer si une personne
 * possede une assurance collective et fait la gestion du montant de l'assurance.
 */

public class ACollective {

    final static String MSG_ERR_LIEU = "Lieu invalide, Veuillez recommencer.";
    final static String MSG_ERR_DATE_EMB = "Date d'embauche invalide."+
            " Veuillez vérifier si la date et le format(ISO 8601) sont valides.";
    final static String MSG_ERR_EMPLOYEUR = "Nom de l'employeur invalide"+
            " Veuillez vérifier que le nom soit entre 5 et 50 caractères.";
    final static String MSG_ERR_PART_EMP = "Pourcentage de l'employeur invalide."+
            " Veuillez vérifier que le pourcentage soit compris entre 0 et 100";
    final static String MSG_ERR_CONTRAT = "Numero de contrat invalide."+
            " Veuillez vérifier que le contrat commence par 'A','R' ou'H'"+
            " et que le numéro soit compris entre 1000 et 7000.";
    final static String MSG_ERR_EX = "Erreur, les données de la soumissions" +
            " sont incomplètes ou invalides. Veuillez recommencer.";

    /**
     * Cette méthode vérifie si une personne travaille dans des lieux
     * non-assurables. Si oui, la personne n'est pas assurable, si non, la
     * personne peut être assurée.
     *
     * @param personne l'objet personne évalué.
     * @return la valeur booléenne si assurable ou non.
     */
    private static boolean verifierLieuTravail(Personne personne){
        boolean eligible = true;
        try{
             if (personne.getLieuTravail().equals("Havre-Saint-Pierre") ||
                     personne.getLieuTravail().equals("Chibougamau") ||
                     personne.getLieuTravail().equals("Carignan") ||
                     personne.getLieuTravail().equals("Entrelacs") ||
                     personne.getLieuTravail().equals("Fassett")){
                 eligible = false;
             }
        } catch (NullPointerException e) {
            PrimeAssurance.sortirSysteme(MSG_ERR_LIEU);
        }
        return eligible;
    }

    /**
     *Cette méthode vérifie si la personne travaille chez l'employeur depuis
     * plus de 3 mois. Si oui, la personne est assurable, si non, la personne ne
     * peut pas être assurée.
     *
     * @param personne l'objet personne évalué.
     * @return la valeur booléenne si assurable ou non.
     */
    private static boolean verifierDateEmbauche(Personne personne){
        boolean eligible = true;
        LocalDate date = LocalDate.now();
        int mois;
        try{
            mois = Period.between(LocalDate.parse(personne.getDateEmb()),
                    date).getMonths();
            if( mois < 3 ){
                eligible = false;
            }
        } catch (NullPointerException | DateTimeException e) {
            PrimeAssurance.sortirSysteme(MSG_ERR_DATE_EMB);
        }
        return eligible;
    }

    /**
     * Cette méthode valide le nom de l'employeur.
     *
     * @param personne l'objet personne évalué.
     */
    private static void validerNomEmployeur(Personne personne){
        try {
            if (personne.getEmployeur().length() < 5 ||
                    personne.getEmployeur().length() > 50) {
                PrimeAssurance.sortirSysteme(MSG_ERR_EMPLOYEUR);
            }
        } catch (NullPointerException e){
            PrimeAssurance.sortirSysteme(MSG_ERR_EX);
    }
    }

    /**
     * Cette méthode valide le pourcentage de l'employeur.
     *
     * @param personne l'objet personne évalué.
     */
    private static void validerPourcentage(Personne personne){
            if (personne.getPartEmp() < 0 ||
                    personne.getPartEmp()> 100) {
                PrimeAssurance.sortirSysteme(MSG_ERR_PART_EMP);
            }
    }

    /**
     * Cette méthode valide le numéro de contrat
     *
     * @param personne l'objet personne évalué.
     */
    private static void validerContrat(Personne personne){
        try {
            if (!(personne.getNumContrat().startsWith("A") ||
                    personne.getNumContrat().startsWith("R") ||
                    personne.getNumContrat().startsWith("H")) ||
                    Integer.parseInt
                            (personne.getNumContrat().substring(1)) < 1000
                            || Integer.parseInt
                    (personne.getNumContrat().substring(1)) > 7000) {
                PrimeAssurance.sortirSysteme(MSG_ERR_CONTRAT);
            }
        }catch(NullPointerException | IndexOutOfBoundsException |
                NumberFormatException e){
            PrimeAssurance.sortirSysteme(MSG_ERR_EX);
        }
    }

    /**
     * Cette méthode vérifie l'éligibilité d'une personne selon les différents
     * critères de l'assurance collective.
     *
     * @param personne l'objet personne évalué
     * @return la valeur booléenne si assurable ou non.
     */
     public static boolean verifierEligibleACollective(Personne personne){
         boolean eligible = false;

        validerNomEmployeur(personne);
        validerPourcentage(personne);
        validerContrat(personne);
        if (verifierDateEmbauche(personne) && verifierLieuTravail(personne)){
            eligible = true;
        }
         return eligible;
     }

    /**
     * Cette méthode permet de calculé le montant de l'assurance que l'employeur
     * doit payer
     *
     * @param personne l'objet personne évalué
     * @param montant le montant total de l'assurance
     *
     * @return la valeur du montant payable par l'employeur
     */
    public static String determinerMontantEmployeur(Personne personne,
                                                    Double montant){
        double pourcentage = personne.getPartEmp() / 100.0;
        double montantPartiel = montant * pourcentage;
        DecimalFormat m = new DecimalFormat("#.##");
        m.format(montantPartiel);
        m.setRoundingMode(RoundingMode.UP);


        return m.format(montantPartiel);
    }

    /**
     * Cette méthode permet de calculé le montant de l'assurance que l'employeur
     * doit payer
     *
     * @param personne l'objet personne évalué
     * @param montant le montant total de l'assurance
     *
     * @return la valeur du montant payable par l'employeur
     */
    public static String determinerMontantEmploye(Personne personne,
                                                    Double montant){
      double pourcentage = (100.0 - personne.getPartEmp()) /100.0;
      double montantPartiel = montant * pourcentage;
      DecimalFormat m = new DecimalFormat("#.##");
      m.setRoundingMode(RoundingMode.DOWN);


      return m.format(montantPartiel);
    }
}
