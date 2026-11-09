public abstract class Colis implements Comparable<Colis> {
    private String code;
    private int poids;
    private boolean horsDakar;

    public Colis(String code, int poids, boolean horsDakar) {
        if (poids <= 0) {
            throw new IllegalArgumentException("Le poids est inferieur ou egal a 0");
        }
        this.code = code;
        this.poids = poids;
        this.horsDakar = horsDakar;
    }

    public String getCode() { return code; }
    public int getPoids() { return poids; }
    public boolean isHorsDakar() { return horsDakar; }

    // Tarif de base, écrit UNE SEULE FOIS ici
    public long tarif() {
        long t = (long) poids * Parametres.TARIF_KG;
        if (horsDakar) {
            t += Parametres.SURCHARGE_HORS_DAKAR;
        }
        return t;
    }

    public abstract String sigle();
    public abstract int priorite();

    // Q3 - écrit une seule fois ici
    @Override
    public String toString() {
        String lieu = horsDakar ? "hors-Dakar" : "Dakar";
        return "[" + sigle() + "] " + code + " " + poids + "kg " + lieu + " " + tarif() + " FCFA";
    }

    // Pour que ça compile, à compléter avec la Q4 de la page 4 :
    @Override
    public int compareTo(Colis autre) {
        return 0; // TODO : voir page 4
    }
}