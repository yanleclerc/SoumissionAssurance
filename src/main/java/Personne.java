import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @Author Yan-Alexandre Leclerc
 * @Version 4
 * @Description Objet Personne qui sert à stocker l'information d'un client
 * dans une variable du type Personne.
 */
public class Personne {

    //-----------
    // Attributs
    //-----------

    JSONObject fumeur;
    JSONArray antecedents;
    JSONArray sport;
    private String nom = null;
    private int genre = 0;
    private String date = null;
    private boolean fumeurTab = false;
    private boolean fumeurCan = false;
    private boolean alcool = false;
    private boolean aCollective = false;



    private String employeur = null;
    private String numContrat = null;
    private String dateEmb = null;
    private int partEmp = 0;
    private String lieuTravail = null;

    //-------------
    //Constructeurs
    //-------------

    public Personne() {

    }

    public Personne(String nom, int genre, String date, boolean aCollective,
                    JSONObject fumeur, boolean fumeurTab, boolean fumeurCan,
                    boolean alcool, JSONArray antecedents, JSONArray sport) {
        this.nom = nom;
        this.genre = genre;
        this.date = date;
        this.aCollective = aCollective;
        this.fumeur = fumeur;
        this.fumeurTab = fumeurTab;
        this.fumeurCan = fumeurCan;
        this.alcool = alcool;
        this.antecedents = antecedents;
        this.sport = sport;
    }

    public Personne(String nom, int genre, String date, boolean aCollective,
                    JSONObject fumeur, boolean fumeurTab, boolean fumeurCan,
                    boolean alcool, JSONArray antecedents, JSONArray sport,
                    String employeur, String numContrat, String dateEmb,
                    int partEmp, String lieuTravail) {
        this.nom = nom;
        this.genre = genre;
        this.date = date;
        this.aCollective = aCollective;
        this.fumeur = fumeur;
        this.fumeurTab = fumeurTab;
        this.fumeurCan = fumeurCan;
        this.alcool = alcool;
        this.antecedents = antecedents;
        this.sport = sport;
        this.employeur = employeur;
        this.numContrat = numContrat;
        this.dateEmb = dateEmb;
        this.partEmp = partEmp;
        this.lieuTravail = lieuTravail;
    }

    //-------------
    //Getters/Setters
    //-------------

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public boolean getACollective() {
        return aCollective;
    }

    public void setACollective(boolean aCollective) {
        this.aCollective = aCollective;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public JSONObject getFumeur() {
        return fumeur;
    }

    public void setFumeur(JSONObject fumeur) {
        this.fumeur = fumeur;
    }

    public boolean getFumeurTab() {
        return fumeurTab;
    }

    public void setFumeurTab(boolean fumeurTab) {
        this.fumeurTab = fumeurTab;
    }

    public boolean getFumeurCan() {
        return fumeurCan;
    }

    public void setFumeurCan(boolean fumeurCan) {
        this.fumeurCan = fumeurCan;
    }

    public boolean getAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public JSONArray getAntecedents() {
        return antecedents;
    }

    public void setAntecedents(JSONArray antecedents) {
        this.antecedents = antecedents;
    }

    public JSONArray getSport() {
        return sport;
    }

    public void setSport(JSONArray sport) {
        this.sport = sport;
    }

    public String getEmployeur() {
        return employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }

    public String getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(String numContrat) {
        this.numContrat = numContrat;
    }

    public String getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(String dateEmb) {
        this.dateEmb = dateEmb;
    }

    public int getPartEmp() {
        return partEmp;
    }

    public void setPartEmp(int partEmp) {
        this.partEmp = partEmp;
    }

    public String getLieuTravail() {
        return lieuTravail;
    }

    public void setLieuTravail(String lieuTravail) {
        this.lieuTravail = lieuTravail;
    }
}
