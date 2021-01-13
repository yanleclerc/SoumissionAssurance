import java.io.DataInput;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Ce programme permet de lire un fichier JSON et d'extraire
 * les données d'une soumission pour donner un verdict si le client
 * est admissible ou non .Un fichier de sortie JSON
 * est retourné avec le résultat de la soumission.
 */
public class PrimeAssurance {

    //Message d'erreur si les paramètres sont invalides
    final static String MSG_ERR_TR = "Erreur, le programme" +
            " n'arrive pas " +
            "à traiter les données. Veuillez recommencez.";
    final static String MSG_ERR_PARAMS = "Paramètres invalides. " +
            "\nUsage requis: <chemin d'entré> <chemin de sortie>";

    public static void sortirSysteme(String msg){
        System.out.println(msg);
        System.exit(0);
    }


    public static void main(String[] params) {
        if (params.length != 2) {
            sortirSysteme(MSG_ERR_PARAMS);
        }

        //Les fichiers d'entrée et de sortie
        String cheminEntree = params[0];
        String cheminSortie = params[1];

        try {
            Personne personne = new Personne();
            JsonWriter.ecrire(cheminEntree, cheminSortie, personne);
        } catch (IOException | ParseException e) {
            System.out.println(MSG_ERR_TR);
        }
    }
}
