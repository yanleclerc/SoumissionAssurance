/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Cette classe permet de déterminer le montant
 * de l'assurance d'une personne selon differents critères.
 */
public class Montant {

    /**
     * Cette méthode permet de calculer le montant de l'assurance selon
     * les tranches d'âges des Femmes et des personnes sans genre.
     *
     * @param age, la valeur de l'âge calculée.
     * @return , la valeur du montant pré-conditions.
     */
    private static double calculerAgeFemmeEtSG(int age) {
        double montant = 0;

        if (age >= 18 && age <= 29) {
            montant = 100;
        } else if (age >= 30 && age <= 40) {
            montant = 140;
        } else if (age >= 41 && age <= 59) {
            montant = 155;
        } else if (age >= 60 && age <= 73) {
            montant = 250;
        } else {
            montant = 600;
        }
        return montant;
    }

    /**
     * Cette méthode permet de calculer le montant de l'assurance selon
     * les tranches d'âges des Hommes.
     *
     * @param age, la valeur de l'âge calculée.
     * @return , la valeur du montant pré-conditions.
     */
    private static double calculerAgeHomme(int age) {
        double montant = 0;

        if (age >= 18 && age <= 29) {
            montant = 150;
        } else if (age >= 30 && age <= 40) {
            montant = 165;
        } else if (age >= 41 && age <= 59) {
            montant = 200;
        } else if (age >= 60 && age <= 73) {
            montant = 350;
        } else {
            montant = 700;
        }
        return montant;
    }

    /**
     * Cette méthode permet de calculer les diverses conditions qui
     * viennent s'ajouter au calcul du montant de l'assurance.
     *
     * @param montant, la valeur du montant pré-condition
     * @return, la valeur du montant apres les conditions
     */
    private static double calculerConditions(Personne personne, double montant) {
        double nouvMontant = montant;

        if (Eligible.determinerFumeur(personne.getFumeurTab(),
                personne.getFumeurCan())) {
            nouvMontant += montant + 100;
        } else if (personne.getAlcool()) {
            nouvMontant += montant * 0.05;
        } else if (personne.getAntecedents().size() > 2) {
            nouvMontant += montant * 0.15;
        } else if (personne.getSport().isEmpty()) {
            nouvMontant += montant + 25;
        }
        for (int i = 0; i < personne.getAntecedents().size(); i++) {
            if (personne.getAntecedents().getString(i).contains("Cancer")
                    || personne.getAntecedents().getString(i).contains("cancer")) {
                nouvMontant += montant * 0.5;
            }
        }
        return nouvMontant;
    }

    /**
     * Cette méthode permet de calculer le montant d'une assurance
     * selon différents critères.
     *
     * @param personne, la personne qui soumet une demande d'assurnace
     * @return , la valeur du montant de l'assurance
     */
    public static double determinerMontant(Personne personne) {
        double montant;
        int genre = personne.getGenre();
        int age = Age.determinerAge(personne.getDate());

        if (genre == 0 || genre == 9 || genre == 2) {
            montant = calculerConditions(personne, calculerAgeFemmeEtSG(age));
        } else {
            montant = calculerConditions(personne, calculerAgeHomme(age));
        }
        return montant;
    }
}
