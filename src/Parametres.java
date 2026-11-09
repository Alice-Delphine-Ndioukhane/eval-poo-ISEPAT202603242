
public final class Parametres {
    public static final String MATRICULE = "206005";
    public static final int N = 05;                                // <-- À REMPLACER

    public static final long TARIF_KG = 400 + 10 * (N % 10);      // FCFA par kg
    public static final long SURCHARGE_HORS_DAKAR = 1500;         // FCFA
    public static final int CAPACITE = 15 + N % 7;                // kg (exercice 3)

    private Parametres() { }
}
